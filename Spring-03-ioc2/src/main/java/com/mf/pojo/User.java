package com.mf.pojo;

/**
 * @author mf
 * @create 2021-04-04-21:01
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name= "+name);
    }
}
