package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbCustomerLike;

import java.util.List;

public interface HbCustomerLikeMapper extends BaseMapper<HbCustomerLike, Integer> {
    /**
     * 关注我的人
     *
     * @param uid
     * @return
     */
    List<Integer> findbeCares(Integer uid);

    /**
     * 我关注的人
     *
     * @param uid
     * @return
     */
    List<Integer> findCares(Integer uid);
}