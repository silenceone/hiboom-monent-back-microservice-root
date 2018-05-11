package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * 活动模版实体
 */
public class HbActivityTemplate implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 图片.
     */
    private String image;
    /**
     * 首图.
     */
    private String coverImg;
    /**
     * 活动模版标题.
     */
    private String title;
    /**
     * 活动价格.
     */
    private Double price;
    /**
     * 活动地址.
     */
    private String address;
    /**
     * 参加最小人数.
     */
    private Integer joinMin;
    /**
     * 参加最大人数.
     */
    private Integer joinMax;
    /**
     * 活动详情图片.
     */
    private String contentImg;
    /**
     * 一级分销提成比例.
     */
    private Double onePrice;
    /**
     * 二级分销比例.
     */
    private Double twoPrice;
    /**
     * 使用次数.
     */
    private Integer isUse;

    /**
     * 创建时间.
     */
    private Integer ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

    public Double getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(Double onePrice) {
        this.onePrice = onePrice;
    }

    public Double getTwoPrice() {
        return twoPrice;
    }

    public void setTwoPrice(Double twoPrice) {
        this.twoPrice = twoPrice;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}