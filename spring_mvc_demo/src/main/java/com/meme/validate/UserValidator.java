package com.meme.validate;

import com.meme.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhangb on 17/11/2015.
 */
public class UserValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    public void validate(Object o, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "userName", "user.userName.required", "用户名不能为空");

    }
}
