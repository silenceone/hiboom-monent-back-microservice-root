package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * 邀请订单
 */
public class HbOrder implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 订单id.
     */
    private String orderId;
    /**
     * 被租人员id.
     */
    private Integer byrentId;
    /**
     * 租用人员id.
     */
    private Integer rentId;
    /**
     * 被租的时间.
     */
    private Integer rentTime;
    /**
     * 被租的地点.
     */
    private String rentAddress;
    /**
     * 如何度过.
     */
    private String rentSpend;
    /**
     * 订单总金额.
     */
    private Float amount;
    /**
     * 订单状态 0未接单，1订单进行中，2已结单，3拒绝.
     */
    private Integer status;
    /**
     * 订单的创建时间.
     */
    private Long createTime;
    /**
     * 订单的接受时间.
     */
    private Long acceptTime;
    /**
     * 订单的过期时间.
     */
    private Long timeOut;
    /**
     * 订单是否已读，0，未读，1已读.
     */
    private Integer isRead;
    /**
     * 订单约定的日子.
     */
    private Integer appointDay;
    /**
     * 订单约定的时间段，上午/下午/晚上/凌晨.
     */
    private Integer appointRange;
    /**
     * 套餐id.
     */
    private Integer packId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public String getRentAddress() {
        return rentAddress;
    }

    public void setRentAddress(String rentAddress) {
        this.rentAddress = rentAddress;
    }

    public String getRentSpend() {
        return rentSpend;
    }

    public void setRentSpend(String rentSpend) {
        this.rentSpend = rentSpend;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Long acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getAppointDay() {
        return appointDay;
    }

    public void setAppointDay(Integer appointDay) {
        this.appointDay = appointDay;
    }

    public Integer getAppointRange() {
        return appointRange;
    }

    public void setAppointRange(Integer appointRange) {
        this.appointRange = appointRange;
    }

    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }
}