package com.hiboom.monent.back.microservice.service.impl;


import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.ActivityService;
import com.hiboom.monent.back.entity.HbActivity;
import com.hiboom.monent.back.microservice.dao.mapper.HbActivityMapper;
import com.hiboom.monent.back.vo.ActivityDetailVO;
import com.hiboom.monent.back.vo.ActivityTemplateVO;
import com.hiboom.monent.back.vo.ActivityVO;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.DateUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

;

/**
 * @author wujj
 * @version 3.0
 * @Description:
 * @date 2018年04月28日 16:48
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private HbActivityMapper hbActivityMapper;


    /**
     * 活动列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<ActivityVO>> activityList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum * pageSize, pageSize);
        List<ActivityVO> activityList = hbActivityMapper.findAllActivity(rowBounds);
        PageInfo<ActivityVO> pageInfo = new PageInfo<>(activityList);
        Integer total = hbActivityMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<ActivityVO>> response = new RestResponse(0, "", pageInfo);
        return response;
    }

    /**
     * 活动详情
     *
     * @param id
     * @return
     */
    @Override
    public RestResponse<ActivityDetailVO> activityDetail(Integer id) {
        HbActivity hbActivity = hbActivityMapper.load(id);
        ActivityDetailVO activityDetailVO = new ActivityDetailVO();
        BeanUtils.copyProperties(hbActivity, activityDetailVO);
        activityDetailVO.setPrice(hbActivity.getPrice().floatValue());
        activityDetailVO.setBeginTime(DateUtil.formatTimeDay(new Date(hbActivity.getBegin())));
        activityDetailVO.setEndTime(DateUtil.formatTimeDay(new Date(hbActivity.getEnd())));
        RestResponse<ActivityDetailVO> response = new RestResponse(0, "", activityDetailVO);
        return response;
    }

    /**
     * 活动删除
     *
     * @param id
     * @return
     */
    @Override
    @Transactional
    public RestResponse<Integer> activityDelete(Integer id) {
        hbActivityMapper.deleteById(id);
        //给参与人数退款
        RestResponse<Integer> response = new RestResponse(0, "", id);
        return response;
    }

}
