package com.test.controller;

import com.test.domain.User;
import com.test.entity.Result;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hp on 2018/4/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUsers")
    public @ResponseBody
    Result queryUsers() {
        List<User> users = userService.queryUsers();
        return new Result("success", users);
    }
}
