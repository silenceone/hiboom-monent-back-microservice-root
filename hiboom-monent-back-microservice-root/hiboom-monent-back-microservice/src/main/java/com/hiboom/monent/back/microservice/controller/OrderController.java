package com.hiboom.monent.back.microservice.controller;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.OrderService;
import com.hiboom.monent.back.vo.OrderVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 10:37
 */
@Api(tags = "OrderController", description = "订单管理")
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 订单列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "订单列表", notes = "订单列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<OrderVO>> orderList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        return orderService.orderList(pageNum, pageSize);

    }
}
