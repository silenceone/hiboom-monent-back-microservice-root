package com.hiboom.monent.back.api;


import com.hiboom.monent.back.excel.ExcelLabel;
import com.parent.common.restsupport.RestResponse;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 9:46
 */
public interface LabelService {
    /**
     * 导入标签
     *
     * @param list
     */
    void importExcel(List<ExcelLabel> list);

    /**
     * 导出标签
     *
     * @return
     */
    List<ExcelLabel> exportExcel();
}
