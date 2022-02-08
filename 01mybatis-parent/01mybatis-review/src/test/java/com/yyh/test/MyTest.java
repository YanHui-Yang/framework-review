package com.yyh.test;

import com.yyh.dao.UserDao;
import com.yyh.dao.impl.UserDaoImpl;
import com.yyh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

public class MyTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {
        // 加载全局配置文件（同时把映射文件也加载了）
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // sqlsessionFactory需要通过sqlsessionFactoryBuilder读取全局配置文件信息之后
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = new User();
        user.setUsername("user");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("阳春市");
        userDao.insertUser(user);
        System.out.println(user.getId());
    }
}
