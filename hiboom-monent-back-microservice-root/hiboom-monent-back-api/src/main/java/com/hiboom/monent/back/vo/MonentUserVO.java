package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 21:46
 */
public class MonentUserVO implements Serializable{
    /**id.*/
    private Integer uid;
    /**手机号码.*/
    private String tel;
    /**hi币余额.*/
    private Float hiBalance;
    /**账户余额.*/
    private Float accountBalance;
    /**注册时间.*/
    private String regTime;
    /**最后登录时间.*/
    private String lastLoginTime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Float getHiBalance() {
        return hiBalance;
    }

    public void setHiBalance(Float hiBalance) {
        this.hiBalance = hiBalance;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
