package com.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//使用lombok插件的注解生成set、get等方法
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int sno;
    private String sname;
    private int classno;


}
