package com.hiboom.monent.back.vo;

import java.util.List;
import java.util.Map;

/**
 * @author wujj
 * @version 1.0
 * @Description:关联用户信息
 * @date 2018年05月07日 22:23
 */
public class RelatedUserVO {
    /**
     * 关注我的人.
     */
    private List<Integer> beCareAboutList;
    /**
     * 我关注的人.
     */
    private List<Integer> careAboutList;

    /**
     * 我租过的人.
     */
    private List<Integer> rentList;
    /**
     * 租过我的人.
     */
    private List<Integer> beRentList;

    public List<Integer> getBeCareAboutList() {
        return beCareAboutList;
    }

    public void setBeCareAboutList(List<Integer> beCareAboutList) {
        this.beCareAboutList = beCareAboutList;
    }

    public List<Integer> getCareAboutList() {
        return careAboutList;
    }

    public void setCareAboutList(List<Integer> careAboutList) {
        this.careAboutList = careAboutList;
    }

    public List<Integer> getRentList() {
        return rentList;
    }

    public void setRentList(List<Integer> rentList) {
        this.rentList = rentList;
    }

    public List<Integer> getBeRentList() {
        return beRentList;
    }

    public void setBeRentList(List<Integer> beRentList) {
        this.beRentList = beRentList;
    }
}
