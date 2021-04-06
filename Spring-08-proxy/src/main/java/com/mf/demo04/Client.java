package com.mf.demo04;

import com.mf.demo02.UserService;
import com.mf.demo02.UserServiceImpl;

/**
 * @author mf
 * @create 2021-04-05-20:11
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        UserService proxy =(UserService) pih.getProxy();
        proxy.add();
        proxy.delete();

    }
}
