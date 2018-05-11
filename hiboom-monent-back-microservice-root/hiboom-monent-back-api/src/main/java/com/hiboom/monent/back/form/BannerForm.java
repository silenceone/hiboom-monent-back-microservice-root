package com.hiboom.monent.back.form;

import java.io.Serializable;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 11:11
 */
public class BannerForm implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * banner主题.
     */
    private String title;
    /**
     * banner图片.
     */
    private String img;
    /**
     * 跳转链接.
     */
    private String jumpUrl;

    /**
     * 详情图片.
     */
    private String[] detailImg;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String[] getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String[] detailImg) {
        this.detailImg = detailImg;
    }
}
