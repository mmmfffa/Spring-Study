package com.mf.demo03;

/**
 * @author mf
 * @create 2021-04-05-17:59
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
