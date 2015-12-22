package com.meme.constants;

/**
 * Created by zhangb on 30/11/2015.
 */
public enum UserCredentialStatus {
    VALID(1), DISABLED(2), INVALID(0);

    private int statusCode;
    UserCredentialStatus(int status){
        this.statusCode = status;
    }
    public Integer getValue() {
        return statusCode;
    }

    public static UserCredentialStatus generateType(int status){
        for (UserCredentialStatus userCredentialStatus : UserCredentialStatus.values()) {
            if (userCredentialStatus.statusCode == status) {
                return userCredentialStatus;
            }
        }
        throw new IllegalArgumentException("Invalid type value input: " + status );
    }
    @Override
    public String toString() {
        return "UserCredentialStatus{"
                +this.name()+" : " + statusCode
                +'}';
    }
}
