package com.hiboom.monent.back.entity;

import java.io.Serializable;

public class HbCustomerDynamic implements Serializable {
    /**
     * 主键Id.
     */
    private Integer id;
    /**
     * 房主id.
     */
    private Integer ownerId;
    /**
     * 房主图片.
     */
    private String dynamicImg;
    /**
     * 房主的声音.
     */
    private String ownerVoice;
    /**
     * 声音的时间.
     */
    private Integer voiceTime;
    /**
     * 房主声音的评论.
     */
    private Integer commentAmount;
    /**
     * 房主声音被听的次数.
     */
    private Integer soundAmount;
    /**
     * 是否置顶.
     */
    private Integer isTop;
    /**
     * 话题主键.
     */
    private Integer topicId;
    /**
     * 动态的点赞数.
     */
    private Integer topicLike;
    /**
     * 标签.
     */
    private String label;
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getDynamicImg() {
        return dynamicImg;
    }

    public void setDynamicImg(String dynamicImg) {
        this.dynamicImg = dynamicImg;
    }

    public String getOwnerVoice() {
        return ownerVoice;
    }

    public void setOwnerVoice(String ownerVoice) {
        this.ownerVoice = ownerVoice;
    }

    public Integer getVoiceTime() {
        return voiceTime;
    }

    public void setVoiceTime(Integer voiceTime) {
        this.voiceTime = voiceTime;
    }

    public Integer getCommentAmount() {
        return commentAmount;
    }

    public void setCommentAmount(Integer commentAmount) {
        this.commentAmount = commentAmount;
    }

    public Integer getSoundAmount() {
        return soundAmount;
    }

    public void setSoundAmount(Integer soundAmount) {
        this.soundAmount = soundAmount;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getTopicLike() {
        return topicLike;
    }

    public void setTopicLike(Integer topicLike) {
        this.topicLike = topicLike;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}