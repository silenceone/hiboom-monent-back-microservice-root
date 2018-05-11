package com.hiboom.monent.back.api;

import com.hiboom.monent.back.excel.ExcelVoiceTemplate;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 12:39
 */
public interface VoiceTemplateService {
    /**
     * 语言提醒导入
     *
     * @param list
     */
    void importExcel(List<ExcelVoiceTemplate> list);

    /**
     * 语音提醒导出
     *
     * @return
     */
    List<ExcelVoiceTemplate> exportExcel();
}
