package com.hiboom.monent.back.entity;

import java.io.Serializable;

public class HbCustomerLike implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * uid.
     */
    private Integer uid;
    /**
     * 房主uid.
     */
    private Integer roomOwnerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoomOwnerId() {
        return roomOwnerId;
    }

    public void setRoomOwnerId(Integer roomOwnerId) {
        this.roomOwnerId = roomOwnerId;
    }
}