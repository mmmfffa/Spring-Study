package com.mf.config;

import com.mf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author mf
 * @create 2021-04-05-17:10
 */
//这个也会被spring容器托管，注册到容器中，因为他本来就是一个@compent
//@configuration代表这是一个配置类，就和我们之前看得beans.xml是一样的
@Configuration
@ComponentScan("com.mf.pojo")
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个bean相当于之前写的一个bean标签,id就是方法名字，class相当于方法返回值
    @Bean
    public User getUser(){
        return new User();//return 就是返回要注入到bean的对象
    }
}
