package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 14:34
 */
public class ActivityDetailVO implements Serializable {
    /**
     * 图片.
     */
    private String image;
    /**
     * 活动标题.
     */
    private String title;
    /**
     * 价格.
     */
    private Float price;
    /**
     * 地址.
     */
    private String address;
    /**
     * 最少人数.
     */
    private Integer joinMin;
    /**
     * 最大人数.
     */
    private Integer joinMax;
    /**
     * 开始时间.
     */
    private String beginTime;
    /**
     * 结束时间.
     */
    private String endTime;
    /**
     * 手机号码.
     */
    private String tel;
    /**
     * 内容.
     */
    private String content;
    /**
     * 详情图片.
     */
    private String contentImg;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getJoinMin() {
        return joinMin;
    }

    public void setJoinMin(Integer joinMin) {
        this.joinMin = joinMin;
    }

    public Integer getJoinMax() {
        return joinMax;
    }

    public void setJoinMax(Integer joinMax) {
        this.joinMax = joinMax;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }
}
