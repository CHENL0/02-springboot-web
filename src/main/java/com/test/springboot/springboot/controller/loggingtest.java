/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: loggingtest
 * Author:   ca
 * Date:     2018/8/1 9:59
 * Description: to test log
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen          2018/8/1 9:59     1.0              to test log
 */
package com.test.springboot.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description〈to test log〉
 * @author Chen
 * @create 2018/8/1
 * @since 1.0.0
 */

public class loggingtest {
   private static final Logger log=LoggerFactory.getLogger(loggingtest.class);
    @Test
    public void test(){
        log.debug("debug");
        log.error("error");
        log.info("info");
        log.warn("warn");
    }
}