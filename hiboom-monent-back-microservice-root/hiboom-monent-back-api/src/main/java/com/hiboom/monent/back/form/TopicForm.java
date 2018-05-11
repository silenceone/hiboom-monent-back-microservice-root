package com.hiboom.monent.back.form;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 10:37
 */
public class TopicForm implements Serializable {
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
     * 话题图片.
     */
    private String coverImg;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }
}
