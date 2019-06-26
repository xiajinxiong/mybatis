package com.example.demo;

import com.example.demo.mapper.GirlMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Car;
import com.example.demo.model.Girl;
import com.example.demo.model.User;
import com.example.demo.util.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.CacheAwareContextLoaderDelegate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() throws IOException {
        SqlSession sqlSession = DBUtil.getSession();
        //System.out.print(sqlSession);

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //System.out.print(userMapper);
            //User user = sqlSession.selectOne("aa.UserMapper.selectUser", 1L);
            //User userr = userMapper.selectUser(1);
            //System.out.println(user.getName());
            User user1 = new User(2, "Bob");
            User user2 = new User(3, "Cat");

            //boolean insertResult = userMapper.insertUser(2, "Bob");
            //sqlSession.insert("aa.UserMapper.insertUser", user1);
            //sqlSession.insert("aa.UserMapper.insertUser", user2);
            //sqlSession.commit();//凡是修改表记录的都需要commit
            //User result = userMapper.selectUser(3L);
            //System.out.println(result);
            User user = userMapper.selectUser(1);
            System.out.print(user);
        }
        finally {
            sqlSession.close();
        }
    }


    @Test
    public void contextLoads2() throws IOException {
        SqlSession sqlSession = DBUtil.getSession();
        //System.out.print(sqlSession);

        try {
            GirlMapper girlMapper = sqlSession.getMapper(GirlMapper.class);
            User user = new User(10, "Boy");
            Girl girl = new Girl(1, "girl", user);
            girlMapper.insertGirl(girl);
            sqlSession.commit();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void contextLoads3() throws IOException {
        SqlSession sqlSession = DBUtil.getSession();
        //System.out.print(sqlSession);

        try {
            GirlMapper girlMapper = sqlSession.getMapper(GirlMapper.class);
            Girl girl = girlMapper.selectGirlByBoyFriend(10);
            System.out.println(girl);
            if (girl == null) {
                System.out.println("null");
            }
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void contextLoads4() throws IOException {
        SqlSession sqlSession = DBUtil.getSession();
        //System.out.print(sqlSession);

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.selectUserAndCars(1);
            System.out.print(user);
        }
        finally {
            sqlSession.close();
        }
    }

}
