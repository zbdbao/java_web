package com.meme.constants;

/**
 * Created by zhangb on 29/12/2015.
 */
public enum TargetStatus {

    INITED(1),STARTED(2),PAUSED(3),DISCARD(4),DELAYED(5),COMPLETED(9);

    private Integer value;
    TargetStatus(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static TargetStatus generateType(int value){
        for (TargetStatus type : TargetStatus.values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid type value input: " + value );
    }
}
