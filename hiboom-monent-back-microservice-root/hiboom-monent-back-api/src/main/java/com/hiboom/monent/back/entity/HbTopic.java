package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * 话题实体
 */
public class HbTopic implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 话题图片路径.
     */
    private String topicPath;
    /**
     * 话题名称.
     */
    private String topicName;
    /**
     * 话题内容.
     */
    private String topicContent;
    /**
     * 浏览量.
     */
    private Integer topicBrowse;
    /**
     * 话题参与数.
     */
    private Integer topicJoin;
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

    public String getTopicPath() {
        return topicPath;
    }

    public void setTopicPath(String topicPath) {
        this.topicPath = topicPath;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public Integer getTopicBrowse() {
        return topicBrowse;
    }

    public void setTopicBrowse(Integer topicBrowse) {
        this.topicBrowse = topicBrowse;
    }

    public Integer getTopicJoin() {
        return topicJoin;
    }

    public void setTopicJoin(Integer topicJoin) {
        this.topicJoin = topicJoin;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}