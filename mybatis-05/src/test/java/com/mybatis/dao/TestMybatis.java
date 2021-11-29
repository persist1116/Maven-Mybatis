package com.mybatis.dao;

import com.mybatis.pojo.Student;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacher(1));
        sqlSession.close();
    }
     @Test
     public void getStudent(){
         SqlSession sqlSession = MybatisUtils.getSqlSession();
         StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
         List<Student> students = mapper.getStudent();
         for(Student s:students){
             System.out.println(s);
         }
         sqlSession.close();
     }
    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();
        for(Student s:students){
            System.out.println(s);
        }
        sqlSession.close();
    }


}
