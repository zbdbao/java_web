package com.meme.form;

/**
 * Created by zhangb on 10/12/2015.
 */
public class UserLoginForm {
    private String userName;
    private String password;
    private String oneTimePin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserLoginForm)) return false;

        UserLoginForm that = (UserLoginForm) o;

        if (!getUserName().equals(that.getUserName())) return false;
        if (!getPassword().equals(that.getPassword())) return false;
        return !(getOneTimePin() != null ? !getOneTimePin().equals(that.getOneTimePin()) : that.getOneTimePin() != null);

    }

    @Override
    public int hashCode() {
        int result = getUserName().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + (getOneTimePin() != null ? getOneTimePin().hashCode() : 0);
        return result;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOneTimePin() {
        return oneTimePin;
    }

    public void setOneTimePin(String oneTimePin) {
        this.oneTimePin = oneTimePin;
    }
}
