package com.hiboom.monent.back.excel;

import com.parent.common.excel.annotation.ExcelField;
import com.parent.common.excel.annotation.ImportField;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 9:40
 */
public class ExcelLabel {
    /**
     * 标签.
     */
    @ImportField(index = 1)
    @ExcelField(value = "标签名")
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcelLabel that = (ExcelLabel) o;

        return label != null ? label.equals(that.label) : that.label == null;

    }

    @Override
    public int hashCode() {
        return label != null ? label.hashCode() : 0;
    }
}
