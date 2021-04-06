package com.mf.pojo;

/**
 * @author mf
 * @create 2021-04-04-19:45
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
