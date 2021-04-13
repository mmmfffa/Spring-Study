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

    //传统方式  private UserDao userDao=new UserDaoImpl();
    //实现方式不一样，UserDaoImpl()每次都需要手动改
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
