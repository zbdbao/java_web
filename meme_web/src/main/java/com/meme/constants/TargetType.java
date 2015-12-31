package com.meme.constants;

/**
 * Created by zhangb on 29/12/2015.
 */
public enum TargetType {

    TEXT(1),IMG(2);

    private Integer value;
    TargetType(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static TargetType generateType(int value){
        for (TargetType type : TargetType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid type value input: " + value );
    }
}
