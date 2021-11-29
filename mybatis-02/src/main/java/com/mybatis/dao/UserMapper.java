package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Author:Yuki
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据sno查询用户
    User getUserBySno(int sno);

    int addUser(User user);

    //修改用户
    int updateUser(User user);
    //delete 一个用户
    int deleteUser(int sno);
}
