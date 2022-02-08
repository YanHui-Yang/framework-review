package com.yyh.dao.impl;

import com.yyh.dao.UserDao;
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
        // sqlsession接口，开发人员使用它对数据库进行增删改查操作
        return sqlSession.selectOne("com.yyh.dao.UserDao.findUserById", id);
    }
}
