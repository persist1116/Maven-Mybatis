package dao;
import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void log4jTest(){
        logger.info("info:进入了");
        logger.debug("debug:进入了");
        logger.error("error:进入了");
    }
    @Test
//    实现分页查询
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for(User user:userByLimit){
            System.out.println(user);
        }
        sqlSession.close();
    }@Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //通过RowBounds实现分页
        RowBounds rowBounds = new RowBounds(0,2);
        List<User> userList = sqlSession.selectList("com.mybatis.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for(User user:userList){
            System.out.println(user);
        }
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.getUserByRowBounds();
        sqlSession.close();
    }

}
