package com.meme.validate;

import com.meme.model.User;
import com.meme.utils.StringValidateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhangb on 17/11/2015.
 */
public class UserSignupValidator implements Validator {
    final static Logger logger = LoggerFactory.getLogger(UserSignupValidator.class);

    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    public void validate(Object o, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "userName", "user.userName.required", "Not accept empty.");
        ValidationUtils.rejectIfEmpty(errors, "birthday", "user.birthday.required", "Not accept empty.");
        ValidationUtils.rejectIfEmpty(errors, "sex", "user.sex.required", "Not accept empty.");
        ValidationUtils.rejectIfEmpty(errors, "mobile", "user.mobile.required", "Not accept empty.");
        ValidationUtils.rejectIfEmpty(errors, "emailAddress", "user.emailAddress.required", "Not accept empty.");

//        ValidationUtils.rejectIfEmpty(errors, "password", "user.password.required", "Not accept empty.");
//        ValidationUtils.rejectIfEmpty(errors, "passwordConfirm", "user.passwordConfirm.required", "Not accept empty.");

        User user = (User) o;
        int valueLength =  user.getUserName().length();
        if(valueLength<4 || valueLength>200){
            errors.rejectValue("userName", "user.userName.length.invalid");
        }

        valueLength = user.passwordLength();
        if(valueLength<6 || valueLength>30){
            errors.rejectValue("password", "user.password.length.invalid");
        }

        if(!StringValidateUtils.validateEmail(user.getEmailAddress())){
            errors.rejectValue("emailAddress", "user.emailAddress.format.invalid");
        }

        if(!StringValidateUtils.validateCNMobile(user.getMobile())){
            errors.rejectValue("mobile", "user.mobile.format.invalid");
        }


        if(!user.isPasswordConfirmed()){
            errors.rejectValue("userName", "user.password.confirm.invalid");
        }
        logger.debug("User validated succeed:{}", user);
    }


}
