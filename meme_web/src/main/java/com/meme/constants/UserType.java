package com.meme.constants;

/**
 * Created by zhangb on 29/11/2015.
 */
public enum UserType {
    NORMAL(1),VIP(9),DISABLED(0);

    private Integer type;
    UserType(Integer type){
        this.type = type;
    }

    public Integer getValue() {
        return type;
    }

    public static UserType generateType(int type){
        for (UserType userType : UserType.values()) {
            if (userType.type == type) {
                return userType;
            }
        }
        throw new IllegalArgumentException("Invalid type value input: " + type );
    }
}
