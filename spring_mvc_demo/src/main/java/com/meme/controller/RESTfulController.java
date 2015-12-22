package com.meme.controller;

import com.meme.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangb on 24/11/2015.
 */
@RestController
@RequestMapping("/json")
public class RESTfulController {

    @RequestMapping(value = "/user", produces = "application/json", method= RequestMethod.GET)
//@RequestMapping(value="{name}", method = RequestMethod.GET)
//    public @ResponseBody User getUser(@PathVariable String name){
    public @ResponseBody User getUser(Model model){
        System.out.println(this.getClass().getName()+" inside the controller, getUser()");
//        List<User> userList = new ArrayList<User>(5);
        User user = new User();
        user.setUsername("Test");
        user.setAddress("SG");
        user.setBirthday(new Date());
        user.setCountry("SG");
        user.setSex("M");
        user.setPostcode(123467);
//        model.addAttribute("user", user);
//        userList.add(user);

        return user;

    }

    @RequestMapping("/key")
    public @ResponseBody String getKey(Model model){
        System.out.println(this.getClass().getName()+" inside the controller, getKey()");
        return "Come on json";

    }
}
