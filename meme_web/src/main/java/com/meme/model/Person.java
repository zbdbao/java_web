package com.meme.model;

/**
 * Created by zhangb on 16/11/2015.
 */
public class Person {
    private int id;
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name+":"+age;
    }
}
