package com.mf.pojo;

/**
 * @author mf
 * @create 2021-04-04-21:23
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UseT被创建");
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
