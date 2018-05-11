package com.hiboom.monent.back.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月01日 21:01
 */
public class TopicVO implements Serializable {
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
    /**
     * 浏览量.
     */
    private Integer browse;
    /**
     * 转发量
     */
    private Integer forwardAmount;
    /**
     * 创建时间.
     */
    private String ctime;
    /**
     * 话题精选留言.
     */
    private List<TopicVoiceVO> topicVoiceList;

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

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public List<TopicVoiceVO> getTopicVoiceList() {
        return topicVoiceList;
    }

    public void setTopicVoiceList(List<TopicVoiceVO> topicVoiceList) {
        this.topicVoiceList = topicVoiceList;
    }

    public Integer getForwardAmount() {
        return forwardAmount;
    }

    public void setForwardAmount(Integer forwardAmount) {
        this.forwardAmount = forwardAmount;
    }
}


