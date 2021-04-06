package com.mf.dao;

import com.mf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mf
 * @create 2021-04-06-9:31
 */
public interface UserMapper {
    List<User> selectUser();
    //添加一个用户
    public int addUser(User user);
    //删除一个用户
    public int deleteUser(@Param("id") int id);
}
