package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hp on 2018/4/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUsers() {
        return userDao.queryUsers();
    }
}
