package com.meme.controller;

import com.meme.model.User;
import com.meme.validate.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangb on 17/11/2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.setValidator(new UserValidator());
    }


    @RequestMapping("/goSignUp")
    public ModelAndView showSignUp() {


        ModelAndView mv = new ModelAndView("user_sign_up", "command", new User());
        return mv;
    }

}
