package com.meme.validate;

import com.meme.form.UserLoginForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Created by zhangb on 17/11/2015.
 */
public class UserSigninValidator extends BaseValidator {

    public boolean supports(Class<?> aClass) {
        return aClass.equals(UserLoginForm.class);
    }

    public void validate(Object o, Errors errors) {
        logger.debug("User login validate:{}", o);

        ValidationUtils.rejectIfEmpty(errors, "userName", "user.userName.required", "Not accept empty.");

        ValidationUtils.rejectIfEmpty(errors, "password", "user.password.required", "Not accept empty.");
    }


}
