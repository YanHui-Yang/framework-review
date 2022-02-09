package com.yyh.dao;

import com.yyh.pojo.Order;
import com.yyh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User findUserById(int id);

    int insertUser(User user);

    Order findOrdersAndUser(@Param("id") int id);

    User findUserAndOrder(@Param("id") int id);
}
