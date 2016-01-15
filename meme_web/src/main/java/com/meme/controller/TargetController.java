package com.meme.controller;

import com.meme.constants.SessionKey;
import com.meme.service.TargetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by zhangb on 29/12/2015.
 */
@Controller
@RequestMapping("/target")
@SessionAttributes(SessionKey.GEN_USER)
public class TargetController extends BaseController{
    @Autowired
    private TargetService targetService;

/*    @RequestMapping("loadTargets")
    public ModelAndView loadAllTargets(HttpSession httpSession) {
        logger.info("showSignIn invoked");
        User user = (User) httpSession.getAttribute(SessionKey.GEN_USER);
        List<Target> targetList = targetService.loadTargetListForUser(user);



    }*/
}
