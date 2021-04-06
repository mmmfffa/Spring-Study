package com.mf.demo01;

/**
 * @author mf
 * @create 2021-04-05-18:01
 */
public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }

}
