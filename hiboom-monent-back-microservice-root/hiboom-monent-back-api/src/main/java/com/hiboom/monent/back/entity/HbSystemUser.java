package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * 系统用户实体
 */
public class HbSystemUser implements Serializable {
    /**
     * 用户uid.
     */
    private Integer uid;
    /**
     * 登录用户.
     */
    private String username;
    /**
     * 显示用户
     */
    private String name;

    /**
     * 密码.
     */
    private String password;
    /**
     * 性别.
     */
    private Integer gender;
    /**
     * 年龄.
     */
    private Integer age;
    /**
     * 头像.
     */
    private String portait;
    /**
     * 职位.
     */
    private String position;
    /**
     * 创建时间.
     */
    private Integer ctime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}