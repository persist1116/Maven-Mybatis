package com.mybatis.dao;


import com.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);
    //分页2
    List<User> getUserByRowBounds();
}
