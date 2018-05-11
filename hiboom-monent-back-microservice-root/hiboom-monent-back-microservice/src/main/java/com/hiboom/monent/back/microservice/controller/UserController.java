package com.hiboom.monent.back.microservice.controller;

import com.hiboom.monent.back.api.SystemUserService;
import com.hiboom.monent.back.entity.HbSystemUser;
import com.hiboom.monent.back.form.LoginForm;
import com.hiboom.monent.back.vo.SystemUserVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 15:23
 */
@Api(tags = "LoginController", description = "用户登录管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SystemUserService userService;

    /**
     * 后台用户登录
     *
     * @param loginForm
     * @return
     */
    @PostMapping(value = "/login", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "后台用户登录", notes = "后台用户登录", code = 200, produces = "application/json")
    public RestResponse<SystemUserVO> login(@RequestBody LoginForm loginForm) {
        return userService.login(loginForm.getUsername(), loginForm.getPassword());
    }

    /**
     * 新增用户
     *
     * @param adminUser
     * @return
     */
    @PostMapping(value = "/add", produces = "application/json; charset=utf-8")
    public RestResponse<Integer> userAdd(@RequestBody HbSystemUser adminUser) {
        return userService.userAdd(adminUser);

    }
}
