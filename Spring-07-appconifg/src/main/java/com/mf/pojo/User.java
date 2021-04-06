package com.mf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mf
 * @create 2021-04-05-17:09
 */
//这个注解的意思就是说这个类名被spring接管了，注册到了容器中
@Component
public class User {
    @Value("mamf")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
