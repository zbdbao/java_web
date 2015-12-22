package com.meme.controller;

import com.meme.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangb on 13/11/2015.
 */
@Controller
@RequestMapping("/adam")
public class AdamController {

    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView sayHello(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        System.out.println("in controller");


        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }

    @RequestMapping("/showVisit")
    public ModelAndView showVisit(){

        System.out.println("in controller：showVisit");

        ModelAndView mv = new ModelAndView("show_visit", "command", new Person());
        return mv;
    }


    @RequestMapping(value = "/visit",  method = RequestMethod.POST)
    public String visit(Person person,
                              ModelMap model) {

        System.out.println("in controller");

        System.out.println("Request parameter: "+person);

        model.addAttribute("name", person.getName());
        model.addAttribute("age", person.getAge());
        model.addAttribute("id", person.getId());
//        ModelAndView mv = new ModelAndView("show_visit");
//        mv.addObject("message", message);
//        mv.addObject("name", person.getName());
        return "visit_result";
    }


}
