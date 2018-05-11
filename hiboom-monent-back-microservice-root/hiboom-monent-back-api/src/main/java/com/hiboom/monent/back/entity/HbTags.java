package com.hiboom.monent.back.entity;

import java.io.Serializable;

/**
 * 标签
 */
public class HbTags implements Serializable {
    /**
     * id.
     */
    private Integer id;
    /**
     * 标签内容.
     */
    private String tagsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName == null ? null : tagsName.trim();
    }
}