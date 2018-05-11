package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * banner实体
 */
public class HbBanners implements Serializable {
    /**
     * id.
     */
    private Integer id;
    /**
     * banner图片路径.
     */
    private String img;
    /**
     * banner标题.
     */
    private String title;
    /**
     * 跳转链接.
     */
    private String jumpUrl;

    /**
     * 详情图片.
     */
    private String detailImg;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String detailImg) {
        this.detailImg = detailImg;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}