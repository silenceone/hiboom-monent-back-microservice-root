package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * voice模版
 */
public class HbVoiceTemplate implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * 标题.
     */
    private String title;
    /**
     * 内容.
     */
    private String content;
    /**
     * 状态.
     */
    private Short status;

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
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }


}