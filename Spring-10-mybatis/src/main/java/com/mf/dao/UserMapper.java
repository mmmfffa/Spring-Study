package com.mf.dao;

import com.mf.pojo.User;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-06-9:31
 */
public interface UserMapper {
    List<User> selectUser();
}
