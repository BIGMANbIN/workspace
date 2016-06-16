package com.it.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log4jTestCase {

    @Test
    public void testLog() {

        String name = "hanhan";
        String BookName = "《重构》";
        Logger logger = LoggerFactory.getLogger(Log4jTestCase.class);
        //从上到下最低级到最高级
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info(name +"借阅了"+BookName);//显示信息
        logger.warn("warn messag");//警告
        logger.error("error messag");
        //logger.fatal("fatal messag");
    }
}
