package com.meme.controller;

import com.meme.base.MemeBasicClass;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangb on 2/12/2015.
 */
public abstract class BaseController extends MemeBasicClass{

    @ExceptionHandler
    public String exception(HttpServletRequest request, Exception ex){
        logger.error(ex.getMessage(), ex);
        request.setAttribute("ex", ex);

        if(ex instanceof Exception){
            return "generic_error";
        }

//        Handle for AJAX request
//        String xRequestedWith = request.getHeader("X-Requested-With");
//        if (!StringUtils.isEmpty(xRequestedWith)) {
//            // ajax请求
//            resultViewName = "errors/ajax-error";
//
//        }
//
//        return resultViewName;
        return "error";
    }
}
