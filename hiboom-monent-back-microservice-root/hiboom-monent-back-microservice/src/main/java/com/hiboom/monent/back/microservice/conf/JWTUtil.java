package com.hiboom.monent.back.microservice.conf;

import com.parent.common.entity.JWTInfo;
import com.parent.common.utils.JWTHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wujj
 * @version 3.0
 * @Description:
 * @date 2018年04月30日 22:12
 */
@Component
public class JWTUtil {
    private Logger logger = LoggerFactory.getLogger(JWTUtil.class);

    @Value("${jwt.expire}")
    private int expire;
    @Value("${jwt.pri-key.path}")
    private String priKeyPath;
    @Value("${jwt.pub-key.path}")
    private String pubKeyPath;


    public String generateToken(JWTInfo jwtInfo) throws Exception {
        return JWTHelper.generateToken(jwtInfo, priKeyPath, expire);
    }

    public JWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, pubKeyPath);
    }


}
