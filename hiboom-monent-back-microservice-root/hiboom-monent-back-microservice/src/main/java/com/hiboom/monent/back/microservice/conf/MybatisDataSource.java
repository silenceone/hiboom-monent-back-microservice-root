package com.hiboom.monent.back.microservice.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
// mybaits dao 搜索路径
@MapperScan(basePackages = {"com.hiboom.monent.back.microservice.dao.mapper"})
public class MybatisDataSource {
    @Autowired
    private DataSourceProperties dataSourceProperties;
    // mybaits mapper xml搜索路径
    private final static String mapperLocations = "classpath:com/hiboom/monent/back/microservice/dao/mapper/*.xml";

    private DruidDataSource pool;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSourceProperties config = dataSourceProperties;
        this.pool = new DruidDataSource();
        this.pool.setDriverClassName(config.getDriverClassName());
        this.pool.setUrl(config.getUrl());
        if (config.getUsername() != null) {
            this.pool.setUsername(config.getUsername());
        }
        if (config.getPassword() != null) {
            this.pool.setPassword(config.getPassword());
        }
        this.pool.setInitialSize(config.getInitialSize());
        this.pool.setMaxActive(config.getMaxActive());
        this.pool.setMaxIdle(config.getMaxIdle());
        this.pool.setMinIdle(config.getMinIdle());
        this.pool.setTestOnBorrow(config.isTestOnBorrow());
        this.pool.setTestOnReturn(config.isTestOnReturn());
        this.pool.setValidationQuery(config.getValidationQuery());
        return this.pool;
    }

    @PreDestroy
    public void close() {
        if (this.pool != null) {
            this.pool.close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        properties.setProperty("dialect", "Mysql");
        pageHelper.setProperties(properties);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
