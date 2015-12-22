package com.meme.model;

import com.meme.constants.CommonConstants;
import com.meme.constants.Sex;
import com.meme.constants.UserType;
import com.meme.utils.EncryptUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * Created by zhangb on 17/11/2015.
 */
public class UserForm {
    private Integer userId;
    private String userName;
//
    @DateTimeFormat(pattern = CommonConstants.DATE_FORMAT_GEN)
    private Date birthday;
    private String sex;
    private String emailAddress;
    private String mobile;

    private String password;
    private String passwordConfirm;

    public boolean isPasswordConfirmed(){
        if(!StringUtils.isEmpty(password) && password.equals(passwordConfirm)){
            return true;
        }
        return false;
    }

    public int passwordLength() {
        if (StringUtils.isEmpty(password)) {
            return 0;
        } else{
            return password.length();
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String generateEncryptedPassword(){
        return EncryptUtil.encrypt(password);
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


}
