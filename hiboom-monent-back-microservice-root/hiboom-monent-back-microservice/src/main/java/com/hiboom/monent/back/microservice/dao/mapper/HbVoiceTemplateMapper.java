package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbVoiceTemplate;
import com.hiboom.monent.back.excel.ExcelVoiceTemplate;

import java.util.List;

public interface HbVoiceTemplateMapper extends BaseMapper<HbVoiceTemplate, Integer> {

    /**
     * 查找所有语言模版
     *
     * @return
     */
    List<ExcelVoiceTemplate> findAllVoiceTemplate();

    /**
     * 先进行删除
     */
    void deleteAll();

    /**
     * 批量插入
     *
     * @param list
     */
    void batchInsert(List<ExcelVoiceTemplate> list);
}