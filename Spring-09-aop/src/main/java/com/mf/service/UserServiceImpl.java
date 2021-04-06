package com.mf.service;

/**
 * @author mf
 * @create 2021-04-05-19:10
 */
//真实对象
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
    }

    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
