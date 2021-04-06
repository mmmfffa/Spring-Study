package com.mf.demo01;

/**
 * @author mf
 * @create 2021-04-05-18:58
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHost();
        host.rent();
        signContract();
        free();
    }
    public void seeHost(){
        System.out.println("中介带你看房子");
    }
    public void free(){
        System.out.println("收中介费");
    }
    public void signContract(){
        System.out.println("签合同");
    }
}
