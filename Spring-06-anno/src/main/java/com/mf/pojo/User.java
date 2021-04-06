package com.mf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author mf
 * @create 2021-04-05-16:43
 */
//等价于 <bean id="user" class="com.mf.pojo.User"/>
@Component//组件
@Scope("prototype")//作用域
public class User {
//等价于 <property name="name" value="马富">
    @Value("马富")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
