package com.mybatis.dao;

import com.mybatis.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入一个博客
    int addBlog(Blog blog);
    //查询博客1
    List<Blog> queryBlogIf(Map map);
    //查寻博客2
    List<Blog> queryBlogWhere(Map map);
    //查寻博客3
    List<Blog> queryBlogWhere2(Map map);
    //更新博客
    int updateBlog(Map map);
    //使用foreach查询
    List<Blog> queryBlogForeach(Map map);
}
