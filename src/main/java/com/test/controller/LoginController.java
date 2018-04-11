package com.test.controller;

import com.test.domain.User;
import com.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hp on 2018/4/10.
 */
@Controller
@RequestMapping(value = "index")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login")
    public ModelAndView login(User user, HttpServletRequest request, HttpServletResponse response) {
        //测试idea提交git
        ModelAndView mv = new ModelAndView();
        boolean b = loginService.login(user);
        if (b) {
            mv.addObject("message", "success");
            mv.setViewName("/success");
        } else {
            mv.addObject("message", "fail");
            mv.setViewName("/fail");
        }
        return mv;
    }
}
