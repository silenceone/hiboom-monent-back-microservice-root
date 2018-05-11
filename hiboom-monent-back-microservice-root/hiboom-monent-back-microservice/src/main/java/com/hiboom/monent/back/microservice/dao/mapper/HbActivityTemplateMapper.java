package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbActivityTemplate;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HbActivityTemplateMapper extends BaseMapper<HbActivityTemplate, Integer> {
    /**
     * 根据id标记删除
     *
     * @param id
     */
    void deleteById(Integer id);

}