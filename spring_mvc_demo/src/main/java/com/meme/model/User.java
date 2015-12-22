package com.meme.model;

import java.util.Date;

/**
 * Created by zhangb on 17/11/2015.
 */
public class User {
    private Integer userId;
    private String username;
    private Date birthday;
    private String sex;
    private String emailAddress;
    private String mobile;
    private String country;
    private String address;
    private Integer postcode;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobile='" + mobile + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", postcode=" + postcode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getUserId() != null ? !getUserId().equals(user.getUserId()) : user.getUserId() != null) return false;
        if (!getUsername().equals(user.getUsername())) return false;
        if (getBirthday() != null ? !getBirthday().equals(user.getBirthday()) : user.getBirthday() != null)
            return false;
        if (getSex() != null ? !getSex().equals(user.getSex()) : user.getSex() != null) return false;
        if (getEmailAddress() != null ? !getEmailAddress().equals(user.getEmailAddress()) : user.getEmailAddress() != null)
            return false;
        if (getMobile() != null ? !getMobile().equals(user.getMobile()) : user.getMobile() != null) return false;
        if (getCountry() != null ? !getCountry().equals(user.getCountry()) : user.getCountry() != null) return false;
        if (getAddress() != null ? !getAddress().equals(user.getAddress()) : user.getAddress() != null) return false;
        return !(getPostcode() != null ? !getPostcode().equals(user.getPostcode()) : user.getPostcode() != null);

    }

    @Override
    public int hashCode() {
        int result = getUserId() != null ? getUserId().hashCode() : 0;
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + (getBirthday() != null ? getBirthday().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (getEmailAddress() != null ? getEmailAddress().hashCode() : 0);
        result = 31 * result + (getMobile() != null ? getMobile().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPostcode() != null ? getPostcode().hashCode() : 0);
        return result;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

}
