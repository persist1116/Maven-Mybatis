import com.mybatis.dao.UserMapper1;
import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {



    @Test
    public void getUserBySno(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        User userSno = mapper.getUserSno(3);
//        mapper.addUser(new User(10,"芳芳",4));
        User userSno2 = mapper.getUserSno(3);
        System.out.println(userSno2==userSno);
        sqlSession.close();
    }
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        User userSno = mapper.getUserSno(3);
        sqlSession.close();
        System.out.println(userSno);
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper1 mapper2 = sqlSession2.getMapper(UserMapper1.class);
        User userSno2 = mapper2.getUserSno(3);
        System.out.println(userSno2);
        System.out.println(userSno==userSno2);
        sqlSession2.close();
    }
}
