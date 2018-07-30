/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: Greeting
 * Author:   Chen
 * Date:     2018/7/30 10:41
 * Description: test restful pojo
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen           2018/7/30 10:41     1.1              test restful pojo
 */
package com.test.springboot.springboot.pojo;

/**
 * @description the pojo of Greeting
 * @author Chen
 * @create 2018/7/30
 * @since 1.0.0
 */
public class Greeting {
    // id of Greeting what type of long 
    private final long id;
    // content of Greeting what type of String
    private final String content;
    //constructor of Greeting with long id and String content
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    //the getter() of id
    public long getId() {
        return id;
    }
    //the getter() of content
    public String getContent() {
        return content;
    }
}