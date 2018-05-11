package com.hiboom.monent.back.microservice.service.impl;

import com.hiboom.monent.back.api.SystemUserService;
import com.hiboom.monent.back.entity.HbSystemUser;
import com.hiboom.monent.back.microservice.conf.JWTUtil;
import com.hiboom.monent.back.microservice.dao.mapper.HbSystemUserMapper;
import com.hiboom.monent.back.microservice.exceptionhandler.MonentBackExceptionConstant;
import com.hiboom.monent.back.vo.SystemUserVO;
import com.parent.common.entity.JWTInfo;
import com.parent.common.exception.BIException;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.crypto.Md5Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 15:34
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private HbSystemUserMapper systemUserMapper;

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public RestResponse<SystemUserVO> login(String username, String password) {
        if (username == null || password == null) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        HbSystemUser adminUser = systemUserMapper.findByName(username);
        //用户不存在
        if (adminUser == null) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        //密码错误
        if (!adminUser.getPassword().equals(Md5Util.encodeHex(password))) {
            throw new BIException(MonentBackExceptionConstant.PWD_ERROR);
        }
        SystemUserVO adminUserVO = new SystemUserVO();
        BeanUtils.copyProperties(adminUser, adminUserVO);
        JWTInfo jwtInfo = new JWTInfo(username, String.valueOf(adminUser.getUid()), adminUser.getName());
        try {
            String token = jwtUtil.generateToken(jwtInfo);
            adminUserVO.setToken(token);
        } catch (Exception e) {
            return new RestResponse(e);
        }
        RestResponse<SystemUserVO> response = new RestResponse(0, "", adminUserVO);
        return response;
    }

    /**
     * 新增用户
     *
     * @param adminUser
     * @return
     */
    @Override
    public RestResponse<Integer> userAdd(HbSystemUser adminUser) {
        if (adminUser == null) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        adminUser.setCtime((int) (new Date().getTime() / 1000));
        adminUser.setPassword(Md5Util.encodeHex(adminUser.getPassword()));
        systemUserMapper.insert(adminUser);
        RestResponse<Integer> response = new RestResponse(0, "", adminUser.getUid());
        return response;
    }
}
