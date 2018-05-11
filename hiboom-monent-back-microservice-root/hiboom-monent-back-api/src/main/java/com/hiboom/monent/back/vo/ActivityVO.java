package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 13:08
 */
public class ActivityVO implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 活动发起人id 活动创建人id .
     */
    private Integer createUid;
    /**
     * 手机号码 .
     */
    private String tel;
    /**
     * 活动标题 .
     */
    private String title;
    /**
     * 活动时间开始时间 .
     */
    private String beginTime;
    /**
     * 活动时间结束时间 .
     */
    private String endTime;
    /**
     * 价格 .
     */
    private Float price;
    /**
     * 模版id.
     */
    private Integer templateId;
    /**
     * 模版类型.
     */
    private String tempTitle;
    /**
     * 活动状态  活动的状态，1进行中，2已完成，3已退款.
     */
    private Integer status;
    /**
     * 参加人数 .
     */
    private Integer joinPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTempTitle() {
        return tempTitle;
    }

    public void setTempTitle(String tempTitle) {
        this.tempTitle = tempTitle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getJoinPerson() {
        return joinPerson;
    }

    public void setJoinPerson(Integer joinPerson) {
        this.joinPerson = joinPerson;
    }
}
