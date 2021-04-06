package com.mf.service;

import com.mf.dao.UserDao;
import com.mf.dao.UserDaoImpl;
import com.mf.dao.UserDaoMysqlImpl;
import com.mf.dao.UserDaoOracleImpl;

/**
 * @author mf
 * @create 2021-04-04-17:28
 */
public class UserServiceImpl implements UserDao{


    private UserDao userDao;
    //利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
