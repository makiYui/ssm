package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hp on 2018/4/10.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(User user) {
        User u = userDao.login(user);
        if (null == u) {
            return false;
        } else {
            return true;
        }
    }
}
