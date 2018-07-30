/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: Greeting
 * Author:   Chen
 * Date:     2018/7/30 10:45
 * Description: test restful pojo
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen           2018/7/30 10:41     1.1              test restful pojo
 */
package com.test.springboot.springboot.controller;

import com.test.springboot.springboot.pojo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description test restful controller
 * @author Chen
 * @create 2018/7/30
 * @since 1.0.0
 */
@Controller 
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
     * @Author Chen
     * @Description the method of greeting to test requestmethod of get
     * @Date 22:54 2018/7/30
     * @Param [name]
     * @return com.test.springboot.springboot.pojo.Greeting
     **/
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    public @ResponseBody
    Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

   /*
    * @Author Chen
    * @Description //TODO the method of greeting2 to test requestmethod of post 
    * @Date 22:55 2018/7/30
    * @Param [name]
    * @return java.lang.String
    **/
    @PostMapping(value="/greeting2")
    public @ResponseBody
    String greeting2(@RequestParam(value="name",defaultValue = "post")String name){
        return String.format(template,name);
    }

    /*
     * @Author Chen
     * @Description //TODO the method of greeting3 to test requestmethod of get
     * @Date 22:55 2018/7/30
     * @Param [name]
     * @return java.lang.String
     **/
    @GetMapping
    public @ResponseBody
    String greeting3(@RequestParam(value="name",defaultValue = "get")String name){
        return String.format(template,name);
    }

   /*
    * @Author Chen
    * @Description //TODO the method of greeting4 to test requestmethod of put
    * @Date 22:56 2018/7/30
    * @Param [name]
    * @return java.lang.String
    **/
    @PutMapping
    public @ResponseBody
    String greeting4(@RequestParam(value = "name",defaultValue = "put")String name){
        return String.format(template,name);
    }
    /*
     * @Author Chen
     * @Description //TODO the method of greeting5 to test requestmethod of delete
     * @Date 22:56 2018/7/30
     * @Param [name]
     * @return java.lang.String
     **/
    @DeleteMapping
    public @ResponseBody
    String greeting5(@RequestParam(value = "name",defaultValue = "delete")String name){
        return String.format(template,name);
    }
}