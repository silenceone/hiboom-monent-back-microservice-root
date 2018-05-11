package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbCustomerDynamic;
import org.apache.ibatis.annotations.Param;

public interface HbCustomerDynamicMapper extends BaseMapper<HbCustomerDynamic, Integer> {

    /**
     * 删除留言
     *
     * @param id
     */
    void deleteById(Integer id);

    /**
     * '
     * 把原来置顶留言变成不置顶
     *
     * @param tid
     */
    void updateNoTop(@Param("tid") Integer tid);
}