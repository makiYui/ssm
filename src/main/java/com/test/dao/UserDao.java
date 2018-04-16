package com.test.dao;

import com.test.domain.User;

import java.util.List;

/**
 * Created by hp on 2018/4/11.
 */
public interface UserDao {

    User login(User user);

    List<User> queryUsers();
}
