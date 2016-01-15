package com.meme.interceptor;

import com.meme.constants.SessionKey;
import com.meme.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangb on 29/12/2015.
 */
public class UserSessionInterceptor extends HandlerInterceptorAdapter {
    final Logger logger = LoggerFactory.getLogger(UserSessionInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = (User) request.getSession().getAttribute(SessionKey.GEN_USER);

        logger.debug("User session :{}", user);
        if(user == null || user.getUserId() < 0){
            logger.error("User session not valid, redirect to login.");

//            response.sendRedirect("/user/goSignIn");
            RequestDispatcher rd = request.getRequestDispatcher("/user/goSignIn");
            rd.forward(request, response);
            return false;
        }
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        logger.info(" postHandle invoked---MEME");

        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info(" afterCompletion invoked---MEME");

        super.afterCompletion(request, response, handler, ex);
    }
}
