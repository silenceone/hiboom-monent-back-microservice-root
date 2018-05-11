package com.hiboom.monent.back.excel;

import com.parent.common.excel.annotation.ExcelField;
import com.parent.common.excel.annotation.ImportField;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 9:40
 */
public class ExcelVoiceTemplate {
    /**
     * 标签.
     */
    @ImportField(index = 1)
    @ExcelField(value = "语言提醒")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
