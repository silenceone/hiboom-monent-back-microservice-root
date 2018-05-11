package com.hiboom.monent.back.vo;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月01日 21:08
 */
public class TopicVoiceVO implements Serializable {
    /**
     * 发言id.
     */
    private Integer id;
    /**
     * 发音声音.
     */
    private String voiceUrl;
    /**
     * 发言时长.
     */
    private Integer voiceTime;
    /**
     * 点赞次数.
     */
    private Integer likeAmount;
    /**
     * 发言人名称.
     */
    private String username;
    /**
     * 发言uid.
     */
    private Integer uid;
    /**
     * 标签.
     */
    private String label;
    /**
     * 是否置顶.
     */
    private Integer isTop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public Integer getVoiceTime() {
        return voiceTime;
    }

    public void setVoiceTime(Integer voiceTime) {
        this.voiceTime = voiceTime;
    }

    public Integer getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(Integer likeAmount) {
        this.likeAmount = likeAmount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }
}
