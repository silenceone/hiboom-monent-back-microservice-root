package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbSystemUser;

public interface HbSystemUserMapper extends BaseMapper<HbSystemUser, Integer> {

    /**
     * 根据登录名查找用户
     * @param username
     * @return
     */
    HbSystemUser findByName(String username);
}