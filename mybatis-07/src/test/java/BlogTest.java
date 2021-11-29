import com.mybatis.dao.BlogMapper;
import com.mybatis.pojo.Blog;
import com.mybatis.utils.IDutils;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class BlogTest {
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId( IDutils.getId());
        blog.setTitle( "Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews ( 9999) ;
        mapper.addBlog(blog);

        blog.setId( IDutils.getId());
        blog.setTitle( "Java如此简单");
        mapper.addBlog(blog);

        blog.setId( IDutils.getId());
        blog.setTitle( "Spring如此简单");
        mapper.addBlog(blog);

        blog.setId( IDutils.getId());
        blog.setTitle("微服务如此简单");mapper.addBlog(blog);
        session.close( );
    }

    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java如此简单");
        map.put("author","狂神");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for(Blog b:blogs){
            System.out.println(b);
        }

        sqlSession.close();
    }
    @Test
    public void queryBlogWhere(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title","Java如此简单");
        map.put("author","狂神说");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogWhere(map);
        for(Blog b:blogs){
            System.out.println(b);
        }

        sqlSession.close();
    }
    @Test
    public void queryBlogWhere2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java如此简单");
        map.put("author","狂神说");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogWhere2(map);
        for(Blog b:blogs){
            System.out.println(b);
        }

        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("id","c56dce5af9964b06ba1d027e8f518f41");
        map.put("title","Java如此简单");
        map.put("author","狂神");
        map.put("views",1111);
        mapper.updateBlog(map);


        sqlSession.close();
    }
    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(1);
        map.put("ids",ids);
        mapper.queryBlogForeach(map);
        sqlSession.close();
    }
}
