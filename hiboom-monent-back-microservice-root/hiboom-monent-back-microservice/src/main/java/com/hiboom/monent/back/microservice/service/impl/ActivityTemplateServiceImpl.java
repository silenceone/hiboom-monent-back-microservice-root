package com.hiboom.monent.back.microservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.ActivityTemplateService;
import com.hiboom.monent.back.entity.HbActivityTemplate;
import com.hiboom.monent.back.form.ActivityTemplateForm;
import com.hiboom.monent.back.microservice.dao.mapper.HbActivityTemplateMapper;
import com.hiboom.monent.back.microservice.exceptionhandler.MonentBackExceptionConstant;
import com.hiboom.monent.back.vo.ActivityTemplateVO;
import com.parent.common.exception.BIException;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.DateUtil;
import com.parent.common.utils.StringUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 11:39
 */
@Service
public class ActivityTemplateServiceImpl implements ActivityTemplateService {
    @Autowired
    private HbActivityTemplateMapper hbActivityTemplateMapper;

    /**
     * 活动模版列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<ActivityTemplateVO>> templateList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum * pageSize, pageSize);
        List<HbActivityTemplate> hbActivityTemplateList = hbActivityTemplateMapper.findAll(null, rowBounds);
        List<ActivityTemplateVO> activityTemplateList = new ArrayList<>();
        for (HbActivityTemplate hbActivityTemplate : hbActivityTemplateList) {
            ActivityTemplateVO activityTemplateVO = new ActivityTemplateVO();
            activityTemplateVO.setImg(hbActivityTemplate.getImage());
            activityTemplateVO.setUseTime(hbActivityTemplate.getIsUse());
            DecimalFormat df = new DecimalFormat("0");
            activityTemplateVO.setOnePrice(df.format(hbActivityTemplate.getOnePrice() * 100) + "%");
            activityTemplateVO.setTwoPrice(df.format(hbActivityTemplate.getTwoPrice() * 100) + "%");
            activityTemplateVO.setCtime(DateUtil.convertIntDateTimeToString(hbActivityTemplate.getCtime()));
            BeanUtils.copyProperties(hbActivityTemplate, activityTemplateVO);
            activityTemplateList.add(activityTemplateVO);
        }
        PageInfo<ActivityTemplateVO> pageInfo = new PageInfo<>(activityTemplateList);
        Integer total = hbActivityTemplateMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<ActivityTemplateVO>> response = new RestResponse(0, "", pageInfo);
        return response;
    }

    /**
     * 活动模版新增
     *
     * @param activityTemplateForm
     * @return
     */
    @Override
    public RestResponse<Integer> templateAdd(ActivityTemplateForm activityTemplateForm) {
        HbActivityTemplate hbActivityTemplate = new HbActivityTemplate();
        BeanUtils.copyProperties(activityTemplateForm, hbActivityTemplate);
        hbActivityTemplate.setImage(activityTemplateForm.getImg());
        hbActivityTemplate.setCtime(DateUtil.toNowTimestamp());
        hbActivityTemplateMapper.insert(hbActivityTemplate);
        RestResponse<Integer> response = new RestResponse(0, "", hbActivityTemplate.getId());
        return response;
    }

    /**
     * 活动模版修改
     *
     * @param activityTemplateForm
     * @return
     */
    @Override
    public RestResponse<Integer> templateEdit(ActivityTemplateForm activityTemplateForm) {
        HbActivityTemplate hbActivityTemplate = new HbActivityTemplate();
        BeanUtils.copyProperties(activityTemplateForm, hbActivityTemplate);
        hbActivityTemplate.setImage(activityTemplateForm.getImg());
        hbActivityTemplateMapper.update(hbActivityTemplate);
        RestResponse<Integer> response = new RestResponse(0, "", hbActivityTemplate.getId());
        return response;
    }

    /**
     * 活动模版删除
     *
     * @param id
     * @return
     */
    @Override
    public RestResponse<Integer> templateDelete(Integer id) {
        hbActivityTemplateMapper.deleteById(id);
        RestResponse<Integer> response = new RestResponse(0, "", id);
        return response;
    }
}
