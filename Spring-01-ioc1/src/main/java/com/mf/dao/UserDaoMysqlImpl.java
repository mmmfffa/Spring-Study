package com.mf.dao;

/**
 * @author mf
 * @create 2021-04-04-17:40
 */
public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
