package com.meme.constants;

/**
 * Created by zhangb on 29/11/2015.
 */
public enum Sex {

    MALE("M", "Male"),

    FEMALE("F", "Female"),

    UNKNOWN("O", "Secret");

    private final String value;

    private final String description;

    private Sex(String v, String desc) {
        this.value = v;
        this.description = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static Sex get(String strValue) {
        for (Sex e : values()) {
            if (e.getValue().equals(strValue)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }

}