package com.hiboom.monent.back.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 21:46
 */
public class MonentUserDetailVO implements Serializable {

    private Integer uid;
    /**
     * 名称.
     */
    private String name;
    /**
     * 性别.
     */
    private String sex;
    /**
     * 年龄.
     */
    private Integer age;
    /**
     * 职业.
     */
    private String profession;
    /**
     * 来自城市.
     */
    private String city;
    /**
     * 空闲时间.
     */
    private String spareTime;
    /**
     * 价格.
     */
    private Float price;
    /**
     * 签名.
     */
    private String signature;
    /**
     * 标签.
     */
    private List<String> labels;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpareTime() {
        return spareTime;
    }

    public void setSpareTime(String spareTime) {
        this.spareTime = spareTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
