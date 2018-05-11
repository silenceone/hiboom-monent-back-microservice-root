package com.hiboom.monent.back.microservice.controller;


import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.ActivityService;
import com.hiboom.monent.back.entity.HbActivity;

import com.hiboom.monent.back.vo.ActivityDetailVO;
import com.hiboom.monent.back.vo.ActivityVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wujj
 * @version 3.0
 * @Description:
 * @date 2018年04月28日 16:44
 */
@Api(tags = "ActivityController", description = "活动管理")
@RestController
@RequestMapping(value = "/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * 活动列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动列表", notes = "活动列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<ActivityVO>> activityList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                           @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        return activityService.activityList(pageNum, pageSize);
    }

    /**
     * 活动详情
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动详情", notes = "活动详情", code = 200, produces = "application/json")
    public RestResponse<ActivityDetailVO> activityDetail(@PathVariable("id") Integer id) {
        return activityService.activityDetail(id);
    }

    /**
     * 活动删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动删除", notes = "活动删除", code = 200, produces = "application/json")
    public RestResponse<Integer> activityDelete(@PathVariable("id") Integer id) {
        return activityService.activityDelete(id);
    }
}
