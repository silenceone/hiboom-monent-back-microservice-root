package com.hiboom.monent.back.microservice.service.impl;

import com.hiboom.monent.back.api.VoiceTemplateService;
import com.hiboom.monent.back.excel.ExcelLabel;
import com.hiboom.monent.back.excel.ExcelVoiceTemplate;
import com.hiboom.monent.back.microservice.dao.mapper.HbVoiceTemplateMapper;
import com.parent.common.exception.BIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 12:39
 */
@Service
public class VoiceTemplateServiceImpl implements VoiceTemplateService {
    @Autowired
    private HbVoiceTemplateMapper hbVoiceTemplateMapper;

    /**
     * 语言提醒导入
     *
     * @param list
     */
    @Override
    @Transactional
    public void importExcel(List<ExcelVoiceTemplate> list) {
        if (list == null || list.size() == 0) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        List<ExcelVoiceTemplate> newList = new ArrayList<>();
        for (ExcelVoiceTemplate excelVoiceTemplate : list) {
            if (excelVoiceTemplate.getContent() != null && !"".equals(excelVoiceTemplate.getContent())) {
                newList.add(excelVoiceTemplate);
            }
        }
        hbVoiceTemplateMapper.deleteAll();
        hbVoiceTemplateMapper.batchInsert(newList);
    }

    /**
     * 语音提醒导出
     *
     * @return
     */
    @Override
    public List<ExcelVoiceTemplate> exportExcel() {
        return hbVoiceTemplateMapper.findAllVoiceTemplate();
    }
}
