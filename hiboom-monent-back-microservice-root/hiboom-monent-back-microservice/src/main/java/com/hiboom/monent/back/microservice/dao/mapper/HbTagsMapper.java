package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbTags;
import com.hiboom.monent.back.excel.ExcelLabel;

import java.util.List;

public interface HbTagsMapper extends BaseMapper<HbTags, Integer> {

    /**
     * 查找所有标签
     *
     * @return
     */
    List<ExcelLabel> findAllLabel();

    /**
     * 批量导入
     *
     * @param listDiff
     */
    void batchInsert(List<ExcelLabel> listDiff);
}