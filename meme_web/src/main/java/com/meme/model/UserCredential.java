package com.meme.model;

import com.meme.constants.UserCredentialStatus;

/**
 * Created by zhangb on 30/11/2015.
 */
public class UserCredential {
    private int userId;
    private String password;
    private UserCredentialStatus status;

    public UserCredentialStatus getStatus() {
        return status;
    }

    public void setStatus(UserCredentialStatus status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
