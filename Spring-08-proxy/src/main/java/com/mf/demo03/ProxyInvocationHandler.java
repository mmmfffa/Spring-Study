package com.mf.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mf
 * @create 2021-04-05-19:40
 */
//等会用这个类生成自动代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(Class<Rent> rentClass){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例并且返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制来实现的
        seeHouse();
        Object result = method.invoke(rent, args);
        free();
        return result;
    }
    public void seeHouse(){
        System.out.println("中介带看房子");
    }
    public void free(){
        System.out.println("中介收费");
    }
}
