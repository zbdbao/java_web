package com.meme.beans.impl;

/**
 * Created by zhangb on 20/11/2015.
 */
public class UserDetails {
    private int userId;
    private String userName;
    private String sex;
    private String mobileNumber;

    public UserDetails(int userId, String userName, String sex, String mobileNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.mobileNumber = mobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
