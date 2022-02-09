package com.yyh.dao.impl;

import com.yyh.dao.UserDao;
import com.yyh.pojo.Order;
import com.yyh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoImpl implements UserDao {

    private final SqlSessionFactory sqlSessionFactory;

    // 注入sqlSessionFactory
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) {
        // sqlsessionFactory工厂类去创建sqlsession会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = null;
        try {
            user = sqlSession.selectOne("com.yyh.dao.UserDao.findUserById", id);
        } finally {
            sqlSession.close();
        }
        // sqlsession接口，开发人员使用它对数据库进行增删改查操作
        return user;
    }

    @Override
    public int insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = 0;
        try {
            insert = sqlSession.insert("com.yyh.dao.UserDao.insertUser", user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return insert;
    }

    @Override
    public Order findOrdersAndUser(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order = null;
        try {
            order = sqlSession.selectOne("com.yyh.dao.UserDao.findOrdersAndUser", id);
        } finally {
            sqlSession.close();
        }
        return order;
    }

    @Override
    public User findUserAndOrder(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = null;
        try {
            user = sqlSession.selectOne("com.yyh.dao.UserDao.findUserAndOrder", id);
        } finally {
            sqlSession.close();
        }
        return user;
    }
}
