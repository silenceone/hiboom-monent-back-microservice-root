package com.hiboom.monent.back.microservice.controller;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.ActivityTemplateService;
import com.hiboom.monent.back.form.ActivityTemplateForm;
import com.hiboom.monent.back.vo.ActivityTemplateVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 11:38
 */
@Api(tags = "ActivityTemplateController", description = "活动模版管理")
@RestController
@RequestMapping("/activity/template")
public class ActivityTemplateController {
    @Autowired
    private ActivityTemplateService activityTemplateService;

    /**
     * 活动模版列表
     *
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动模版列表", notes = "活动模版列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<ActivityTemplateVO>> templateList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                                   @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        return activityTemplateService.templateList(pageNum,pageSize);
    }

    /**
     * 活动模版新增
     *
     * @param activityTemplateForm
     * @return
     */
    @PostMapping(value = "/add", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动模版新增", notes = "活动模版新增", code = 200, produces = "application/json")
    public RestResponse<Integer> templateAdd(@RequestBody ActivityTemplateForm activityTemplateForm) {
        return activityTemplateService.templateAdd(activityTemplateForm);
    }

    /**
     * 活动模版修改
     * @param activityTemplateForm
     * @return
     */
    @PutMapping(value = "/edit", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动模版修改", notes = "活动模版修改", code = 200, produces = "application/json")
    public RestResponse<Integer> templateEdit(@RequestBody ActivityTemplateForm activityTemplateForm){
        return activityTemplateService.templateEdit(activityTemplateForm);
    }

    /**
     * 活动模版删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "活动模版删除", notes = "活动模版删除", code = 200, produces = "application/json")
    public RestResponse<Integer> templateDelete(@PathVariable Integer id){
        return activityTemplateService.templateDelete(id);
    }


}
