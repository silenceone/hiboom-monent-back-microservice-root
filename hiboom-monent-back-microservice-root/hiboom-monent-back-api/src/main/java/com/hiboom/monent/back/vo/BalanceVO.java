package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 22:07
 */
public class BalanceVO implements Serializable {

    /**
     * 收支.
     */
    private Integer inOrEx;
    /**
     * 交易类型.
     */
    private Integer type;
    /**
     * 交易金额.
     */
    private Float amount;
    /**
     * 交易时间.
     */
    private String time;

    public Integer getInOrEx() {
        return inOrEx;
    }

    public void setInOrEx(Integer inOrEx) {
        this.inOrEx = inOrEx;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
