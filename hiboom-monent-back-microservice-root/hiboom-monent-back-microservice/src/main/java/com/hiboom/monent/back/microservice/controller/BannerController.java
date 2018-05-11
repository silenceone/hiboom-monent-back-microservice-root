package com.hiboom.monent.back.microservice.controller;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.BannerService;
import com.hiboom.monent.back.form.BannerForm;
import com.hiboom.monent.back.vo.BannerVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:banner
 * @date 2018年05月02日 10:58
 */
@Api(tags = "BannerController", description = "Banner管理")
@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * banner列表
     *
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "banner列表", notes = "banner列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<BannerVO>> bannerList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                       @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum=pageNum-1;
        return bannerService.bannerList(pageNum,pageSize);
    }

    /**
     * banner新增
     *
     * @param bannerForm
     * @return
     */
    @PostMapping(value = "/add", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "banner新增", notes = "banner新增", code = 200, produces = "application/json")
    public RestResponse<Integer> bannerAdd(@RequestBody BannerForm bannerForm) {
        return bannerService.bannerAdd(bannerForm);
    }

    /**
     * banner修改
     *
     * @param bannerForm
     * @return
     */
    @PutMapping(value = "/edit", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "banner修改", notes = "banner修改", code = 200, produces = "application/json")
    public RestResponse<Integer> bannerEdit(@RequestBody BannerForm bannerForm) {
        return bannerService.bannerEdit(bannerForm);
    }

    /**
     * banner删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "banner删除", notes = "banner删除", code = 200, produces = "application/json")
    public RestResponse<Integer> bannerDelte(@PathVariable Integer id) {
        return bannerService.bannerDelte(id);
    }

}
