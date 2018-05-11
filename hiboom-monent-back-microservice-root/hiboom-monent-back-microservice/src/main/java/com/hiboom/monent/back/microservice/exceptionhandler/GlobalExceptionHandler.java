package com.hiboom.monent.back.microservice.exceptionhandler;



import com.parent.common.exception.BIException;
import com.parent.common.restsupport.RestResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * GlobalExceptionHandler 拦截器
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestResponse<String> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        RestResponse<String> response = new RestResponse<String>(BIException.UNKNOWN_ERROR, "发生错误，请联系管理员解决", null);
        return response;
    }


    @ExceptionHandler(value = BIException.class)
    @ResponseBody
    public RestResponse<BIException> jsonErrorHandler(HttpServletRequest req, BIException e) throws Exception {
        RestResponse<BIException> response = new RestResponse<BIException>(e);

        return response;
    }

}

