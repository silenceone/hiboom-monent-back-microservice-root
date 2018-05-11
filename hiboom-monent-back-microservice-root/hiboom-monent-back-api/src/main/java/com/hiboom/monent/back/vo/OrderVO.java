package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 10:17
 */
public class OrderVO implements Serializable {
    /**
     * 被租人员id.
     */
    private Integer byrentId;
    /**
     * 租用人员id.
     */
    private Integer rentId;
    /**
     * 套餐.
     */
    private String pack;
    /**
     * 被租的时间.
     */
    private Integer rentTime;
    /**
     * 订单总金额.
     */
    private Float amount;
    /**
     * 订单的创建(邀请)时间.
     */
    private String createTime;
    /**
     * 订单的过期(完成)时间.
     */
    private String timeOut;
    /**
     * 邀请留言.
     */
    private String rentSpend;

    /**
     * 订单状态 0未接单，1订单进行中，2已结单，3拒绝.
     */
    private Integer status;

    public Integer getByrentId() {
        return byrentId;
    }

    public void setByrentId(Integer byrentId) {
        this.byrentId = byrentId;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getRentSpend() {
        return rentSpend;
    }

    public void setRentSpend(String rentSpend) {
        this.rentSpend = rentSpend;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
