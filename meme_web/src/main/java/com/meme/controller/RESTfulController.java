package com.meme.controller;

import com.meme.model.User;
import com.meme.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RESTfulController extends BaseController{
    final static Logger logger = LoggerFactory.getLogger(RESTfulController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET,headers="Accept=application/json")
    public List getUserList(){
        logger.info("Inside the controller, getUserList()");
        List<User> userList = new ArrayList<User>(5);
        User user = new User();
//        user.setUsername("Test");
//        user.setAddress("SG");
//        user.setBirthday(new Date());
//        user.setCountry("SG");
//        user.setSex("M");
//        user.setPostcode(123467);
////        model.addAttribute("user", user);
//        userList.add(user);

        logger.debug("Total user list:{}", userList);
        return userList;

    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST,headers="Accept=application/json")
    public User getUser(@PathVariable int id){

        logger.info("Inside the controller, getUser(), id{}", id);

        User user = userService.getUser(id);

        return user;

    }


    @RequestMapping(value = "/userName/{userName}", method = RequestMethod.POST,headers="Accept=application/json")
    public Boolean validateUserName(@PathVariable String userName){

        logger.info("Inside the controller, validateUserName(), id{}", userName);

        return userService.isUserNameExist(userName);

    }
    @RequestMapping("/key")
    public String getKey(Model model){
        logger.info("Inside the controller, getKey()");

        System.out.println(this.getClass().getName()+" inside the controller, getKey()");
        return "Come on json";

    }
}
