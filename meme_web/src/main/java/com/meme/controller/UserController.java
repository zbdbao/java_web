package com.meme.controller;

import com.meme.constants.ExceptionStatus;
import com.meme.constants.SessionKey;
import com.meme.constants.UserType;
import com.meme.exception.UserAuthException;
import com.meme.form.UserLoginForm;
import com.meme.model.User;
import com.meme.repository.EnumRepository;
import com.meme.service.UserService;
import com.meme.utils.CommanUtils;
import com.meme.validate.UserSigninValidator;
import com.meme.validate.UserSignupValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangb on 17/11/2015.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes(SessionKey.GEN_USER)
public class UserController extends BaseController{
    @Autowired
    private UserService userService;

    @InitBinder("user")
    protected void initSignupBinder(WebDataBinder binder){

//        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_GEN);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));

        binder.setValidator(new UserSignupValidator());

    }
    @InitBinder("userLoginForm")
    protected void initSigninBinder(WebDataBinder binder){

        binder.setValidator(new UserSigninValidator());

    }


    @RequestMapping("/goSignUp")
    public ModelAndView showSignUp() {


        ModelAndView mv = new ModelAndView("user_sign_up", "user", new User());
        mv.addObject("sexMap", EnumRepository.getSexMap());
        return mv;
    }

    @RequestMapping("/signUp")
    public ModelAndView userSignUp(@Validated User user, BindingResult bindingResult) {
        logger.info("Register user {}", user);
        ModelAndView mv = null;
        if(bindingResult.hasErrors()){
            logger.error("Validate form fail:{}", bindingResult.getAllErrors());
            mv = new ModelAndView("user_sign_up", "user", user);
            mv.addObject("sexMap", EnumRepository.getSexMap());
        }else {
            if(userService.isUserNameExist(user.getUserName())){
                logger.error("Username exist in system:{}", user.getUserName());

                bindingResult.rejectValue("userName", "user.userName.invalid.exist");
                mv = new ModelAndView("user_sign_up", "user", user);

                mv.addObject("sexMap", EnumRepository.getSexMap());
            }else {
                user = userService.registerUser(user, UserType.NORMAL);
                mv = new ModelAndView("user_sign_up_result", "user", user);
            }
        }
        return mv;
    }


    @RequestMapping("/goSignIn")
    public String showSignIn(Model model, HttpSession httpSession) {
        logger.info("showSignIn invoked");
        User user = (User) httpSession.getAttribute(SessionKey.GEN_USER);

        if(CommanUtils.isUserValid(user)){//Already signed in

            return "redirect:/home/info";
        }else{
            model.addAttribute("userLoginForm", new UserLoginForm());
            return "user_sign_in";
        }

//        return mv;
    }

    @RequestMapping("/signIn")
    public String userSignIn(@Validated UserLoginForm userLoginForm, BindingResult bindingResult,
                             Model model, HttpSession httpSession) {
        logger.info("User login request:{}", userLoginForm);
        User user = (User) httpSession.getAttribute(SessionKey.GEN_USER);

        if(user != null && user.getUserId() > 0){//Already signed in
            return "redirect:/home/info";
        }else{
            if(bindingResult.hasErrors()){
                logger.error("Validate form fail:{}", bindingResult.getAllErrors());
                return "user_sign_in";
            }
            String userName = userLoginForm.getUserName();
            String password = userLoginForm.getPassword();


            try {
                user = userService.loginUser(userName, password);
            } catch (UserAuthException e) {

                if(e.getExceptionStatus() == ExceptionStatus.INVALID_USER){
                    logger.info("Username:{} login fail, status code:{}", userName, e.getExceptionStatus());
                    bindingResult.reject("userName","user.login.invalid.fail");
                    return "user_sign_in";
                }else if(e.getExceptionStatus() == ExceptionStatus.INVALID_PASSWORD){

                    logger.info("Username:{} login fail, status code:{}", userName, e.getExceptionStatus());
                    bindingResult.reject("userName","user.login.invalid.fail");

                    return "user_sign_in";
                }
            }
             if(CommanUtils.isUserValid(user)){
                model.addAttribute(SessionKey.GEN_USER, user);

                return "redirect:/home/info";
            }else{
//                Invalid user, redirect to user enable
//                 bindingResult.reject("userName","user.login.invalid.fail");
                 return "user_sign_in";
            }


        }
//        return mv;
    }

    @RequestMapping("/signOut")
    public String signOut(SessionStatus sessionStatus) {

        logger.info("User sign out");
        sessionStatus.setComplete();

        return "redirect:/user/goSignIn";
    }



    @RequestMapping("/index")
    public String index() {

        logger.info("Index page request.");
        return "user_index";
    }
}
