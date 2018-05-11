package com.hiboom.monent.back.microservice.controller;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.MonentUserService;
import com.hiboom.monent.back.vo.BalanceVO;
import com.hiboom.monent.back.vo.MonentUserDetailVO;
import com.hiboom.monent.back.vo.MonentUserVO;
import com.hiboom.monent.back.vo.RelatedUserVO;
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
 * @date 2018年05月07日 21:37
 */
@Api(tags = "MonentUserController", description = "一刻活动用户管理")
@RestController
@RequestMapping("/monent_user")
public class MonentUserController {
    @Autowired
    private MonentUserService monentUserService;

    /**
     * 用户列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "用户列表", notes = "用户列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<MonentUserVO>> monentUserList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                               @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        return monentUserService.monentUserList(pageNum, pageSize);
    }

    /**
     * 用户基本信息
     *
     * @param uid
     * @return
     */
    @GetMapping(value = "/{uid}/detail", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "用户基本信息", notes = "用户基本信息", code = 200, produces = "application/json")
    public RestResponse<MonentUserDetailVO> monentUserDetail(@PathVariable("uid") Integer uid) {
        return monentUserService.monentUserDetail(uid);
    }

    /**
     * hi币交易明细
     *
     * @param uid
     * @return
     */
    @GetMapping(value = "/{uid}/hi_balance", produces = "application/json; charset=utf-8")
    @ApiOperation(value = " hi币交易明细", notes = " hi币交易明细", code = 200, produces = "application/json")
    public RestResponse<List<BalanceVO>> hiBalanceList(@PathVariable("uid") Integer uid) {
        return monentUserService.hiBalanceList(uid);
    }

    /**
     * 账户余额明细
     *
     * @param uid
     * @return
     */
    @GetMapping(value = "/{uid}/balance", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "账户余额明细", notes = "账户余额明细", code = 200, produces = "application/json")
    public RestResponse<List<BalanceVO>> balanceList(@PathVariable("uid") Integer uid) {
        return monentUserService.balanceList(uid);
    }


    /**
     * 关联用户信息
     *
     * @param uid
     * @return
     */
    @GetMapping(value = "/{uid}/related", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "关联用户信息", notes = "关联用户信息", code = 200, produces = "application/json")
    public RestResponse<RelatedUserVO> relatedUser(@PathVariable("uid") Integer uid) {
        return monentUserService.relatedUser(uid);
    }

    /**
     * 充值
     * @param uid
     * @return
     */
    @PutMapping(value = "/{uid}/charge", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "充值", notes = "充值", code = 200, produces = "application/json")
    public RestResponse<Integer> recharge(@PathVariable("uid") Integer uid, @RequestParam(value = "amount") Float amount) {
        return monentUserService.recharge(uid,amount);
    }
}
