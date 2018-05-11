package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 11:22
 */
public class ActivityTemplateVO implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 活动模版标题.
     */
    private String title;
    /**
     * 活动地址.
     */
    private String address;
    /**
     * 活动价格.
     */
    private Double price;
    /**
     * 参加最小人数.
     */
    private Integer joinMin;
    /**
     * 参加最大人数.
     */
    private Integer joinMax;
    /**
     * 使用次数.
     */
    private Integer useTime;
    /**
     * 首图.
     */
    private String coverImg;
    /**
     * 图片.
     */
    private String img;
    /**
     * 活动详情图片.
     */
    private String contentImg;
    /**
     * 创建时间.
     */
    private String ctime;

    /**
     * 一级分销提成比例.
     */
    private String onePrice;
    /**
     * 二级分销比例.
     */
    private String twoPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(String onePrice) {
        this.onePrice = onePrice;
    }

    public String getTwoPrice() {
        return twoPrice;
    }

    public void setTwoPrice(String twoPrice) {
        this.twoPrice = twoPrice;
    }
}
