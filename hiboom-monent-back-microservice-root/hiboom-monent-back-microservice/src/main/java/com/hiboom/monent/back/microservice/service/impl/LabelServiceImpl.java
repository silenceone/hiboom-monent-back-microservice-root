package com.hiboom.monent.back.microservice.service.impl;

import com.hiboom.monent.back.api.LabelService;
import com.hiboom.monent.back.excel.ExcelLabel;
import com.hiboom.monent.back.microservice.dao.mapper.HbTagsMapper;
import com.parent.common.exception.BIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月09日 9:46
 */
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private HbTagsMapper hbTagsMapper;


    /**
     * 导入标签
     *
     * @param list
     */
    @Override
    public void importExcel(List<ExcelLabel> list) {
        if (list == null || list.size() == 0) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        //查找所有已经存在的标签
        List<ExcelLabel> excelLabelExistList = hbTagsMapper.findAllLabel();
        List<ExcelLabel> listDiff = getDiffrent(list, excelLabelExistList);
        List<ExcelLabel> newList = new ArrayList<>();
        for (ExcelLabel excelLabel : listDiff) {
            if (excelLabel.getLabel() != null && !"".equals(excelLabel.getLabel())) {
                newList.add(excelLabel);
            }
        }
        hbTagsMapper.batchInsert(newList);
    }

    /**
     * 导出标签
     *
     * @return
     */
    @Override
    public List<ExcelLabel> exportExcel() {
        List<ExcelLabel> excelLabelList = hbTagsMapper.findAllLabel();
        return excelLabelList;
    }

    /**
     * 比较两个list
     *
     * @param list1
     * @param list2
     * @return
     */
    private static List<ExcelLabel> getDiffrent(List<ExcelLabel> list1, List<ExcelLabel> list2) {
        List<ExcelLabel> diff = new ArrayList<>();
        Set<ExcelLabel> set = new HashSet<>();
        for (ExcelLabel excelLabel : list1) {
            set.add(excelLabel);
        }
        for (ExcelLabel excelLabel : list2) {
            if (set.contains(excelLabel)) {
                set.remove(excelLabel);
            }
        }
        for (ExcelLabel excelLabel : set) {
            diff.add(excelLabel);
        }
        return diff;

    }
}
