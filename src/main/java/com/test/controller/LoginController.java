package com.test.controller;

import com.test.domain.User;
import com.test.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private LoginService loginService;

    //测试@Value是否成功
    @Value(value = "${test.name}")
    private String str;

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

    @RequestMapping(value = "test")
    public ModelAndView testlogger(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        logger.error("error");
        mv.addObject("message", "fail");
        mv.setViewName("/fail");
        return mv;
    }

    /**
     * 不使用ModelAndView进行页面跳转
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "testJumpView")
    public String testJumpView(Model model,HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("message", "testJumpViewSuccess");
        return "/success";
    }
}
