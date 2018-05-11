package com.hiboom.monent.back.microservice;

import com.hiboom.monent.back.microservice.conf.CrossFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MonentBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonentBackApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrossFilter());
        return bean;
    }
}
