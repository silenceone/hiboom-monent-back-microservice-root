package com.hiboom.monent.back.form;

import java.io.Serializable;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 10:50
 */
public class TopicVoiceForm implements Serializable {
    /**
     * 发言id.
     */
    private Integer id;
    /**
     * 标签.
     */
    private String label;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
