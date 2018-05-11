package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbBanners;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HbBannersMapper extends BaseMapper<HbBanners, Integer> {

    /**
     * 根据id删除banner
     *
     * @param id
     */
    void deleteById(Integer id);


}