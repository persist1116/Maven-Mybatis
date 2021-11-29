package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:Yuki
 */
public interface UserMapper {
    //查询全部用户
    @Select("select * from t_student")
    List<User> getUserList();
    //方法有多个参数时，所有的参数前面必须加上@Param("sno")这样的注解
    /**
     * 基本类型的参数或者String类型需要加上Param
     * 引用类型不需要
     * 如果只有一个基本数据类型的话，可以忽略，但是建议加上
     * #{}和${} 的区别：#{}可以防止sql注入
     */
    @Select("select * from t_student where sno = #{sno}")
    User getUserBySno(@Param("sno")int sno);
    @Insert("insert into t_student(sno,sname,classno) values (#{sno},#{sname},#{classno})")
    int addUser(User user);
    @Update("update t_student set sname=#{sname},classno=#{classno} where sno=#{sno}")
    int updateUser(User user);
    @Delete("delete from t_student where sno=#{sno}")
    int deleteUser(int sno);
}
