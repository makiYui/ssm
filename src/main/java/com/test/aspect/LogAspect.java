package com.test.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/4/13.
 */
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    public void before() {
        logger.info("log start!");
    }

    public void after() {
        logger.info("log end!");
    }
}
