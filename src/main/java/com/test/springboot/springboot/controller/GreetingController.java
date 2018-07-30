/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GreetingController
 * Author:   ca
 * Date:     2018/7/30 10:45
 * Description: test restful controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.springboot.springboot.controller;

import com.test.springboot.springboot.pojo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description<br>
 * 〈test restful controller〉
 *
 * @author Chen
 * @create 2018/7/30
 * @since 1.0.0
 */
@Controller 
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    public @ResponseBody
    Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}