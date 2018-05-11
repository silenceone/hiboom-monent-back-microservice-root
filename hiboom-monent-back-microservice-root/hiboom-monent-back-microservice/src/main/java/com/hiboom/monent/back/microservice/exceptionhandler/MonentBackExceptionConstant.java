package com.hiboom.monent.back.microservice.exceptionhandler;

import com.parent.common.exception.ExceptionConstant;
import com.parent.common.exception.ExceptionInfo;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 16:09
 */
public enum MonentBackExceptionConstant implements ExceptionConstant {
    PWD_ERROR(10001, "密码错误"),
    USER_NOT_EXIST(10002, "用户不存在"),
    BANNER_TITLE_EMPTY(10003, "Banner标题为空"),
    BANNER_IMG_EMPTY(10004, "Banner图片为空"),
    BANNER_CONTEN_EMPTY(10005, "Banner详情为空");

    private int code;
    private String msg;

    // 构造方法
    private MonentBackExceptionConstant(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public ExceptionInfo getExceptionInfo() {

        return new ExceptionInfo(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
