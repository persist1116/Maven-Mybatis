package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper1 {
    User getUserSno(@Param("sno") int sno);
    int addUser(User user);
}
