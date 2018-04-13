package com.test.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/4/13.
 */
@Aspect
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * xml文件中配置aop方式实现
     */
    /*public void before() {
        logger.info("log start!");
    }

    public void after() {
        logger.info("log end!");
    }*/

    @Before(value = "execution(* com.test.controller.*.*(..))")
    public void before() {
        logger.info("log start!");
    }

    @After(value = "execution(* com.test.controller.*.*(..))")
    public void after() {
        logger.info("log end!");
    }
}
