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
import org.springframework.web.bind.annotation.*;

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

    /**
     * @description get mapping
     * @param name
     * @return
     */
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    public @ResponseBody
    Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

    /**
     * 
     * @param name
     * @return
     */
    @PostMapping(value="/greeting2")
    public @ResponseBody
    String greeting2(@RequestParam(value="name",defaultValue = "post")String name){
        return String.format(template,name);
    }

    /**
     * 
     * @param name
     * @return
     */
    @GetMapping
    public @ResponseBody
    String greeting3(@RequestParam(value="name",defaultValue = "get")String name){
        return String.format(template,name);
    }

    /**
     * 
     * @param name
     * @return
     */
    @PutMapping
    public @ResponseBody
    String greeting4(@RequestParam(value = "name",defaultValue = "put")String name){
        return String.format(template,name);
    }
    @DeleteMapping
    public @ResponseBody
    String greeting5(@RequestParam(value = "name",defaultValue = "delete")String name){
        return String.format(template,name);
    }
}