package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 15:25
 */
public class SystemUserVO implements Serializable {
    /**
     * 用户uid.
     */
    private Integer uid;
    /**
     * 用户登录名.
     */
    private String username;
    /**
     * 用户名.
     */
    private String name;
    /**
     * 性别.
     */
    private Integer gender;
    /**
     * 头像.
     */
    private String portait;
    /**
     * 职位.
     */
    private String position;
    /**
     * 生成的token
     */
    private String token;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPortait() {
        return portait;
    }

    public void setPortait(String portait) {
        this.portait = portait;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
