package com.meme.controller;

import com.meme.constants.SessionKey;
import com.meme.model.Target;
import com.meme.model.User;
import com.meme.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zhangb on 6/1/2016.
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController{

    @Autowired
    private TargetService targetService;

    @RequestMapping("/info")
    public ModelAndView homePage(HttpSession session){

        User user = (User) session.getAttribute(SessionKey.GEN_USER);

        logger.info("User homepage for {}", user);

        List<Target> targetList = targetService.loadTargetListForUser(user);

        ModelAndView modelAndView = new ModelAndView("user_home");
        modelAndView.addObject("targetList", targetList);
        logger.debug("User-{} target list: {}", user, targetList);

        return modelAndView;
    }
}
