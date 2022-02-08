package com.yyh.dao;

import com.yyh.pojo.User;

public interface UserDao {

    User findUserById(int id);

    int insertUser(User user);
}
