package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.form.ActivityTemplateForm;
import com.hiboom.monent.back.vo.ActivityTemplateVO;
import com.parent.common.restsupport.RestResponse;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 11:39
 */
public interface ActivityTemplateService {
    /**
     * 活动模版列表
     *
     * @return
     * @param pageNum
     * @param pageSize
     */
    RestResponse<PageInfo<ActivityTemplateVO>> templateList(Integer pageNum, Integer pageSize);

    /**
     * 活动模版新增
     * @param activityTemplateForm
     * @return
     */
    RestResponse<Integer> templateAdd(ActivityTemplateForm activityTemplateForm);

    /**
     * 活动模版修改
     * @param activityTemplateForm
     * @return
     */
    RestResponse<Integer> templateEdit(ActivityTemplateForm activityTemplateForm);

    /**
     * 活动模版删除
     * @param id
     * @return
     */
    RestResponse<Integer> templateDelete(Integer id);
}
