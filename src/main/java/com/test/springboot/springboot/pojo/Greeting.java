/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Greeting
 * Author:   ca
 * Date:     2018/7/30 10:41
 * Description: test restful pojo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.springboot.springboot.pojo;

/**
 * @description<br>
 * 〈test restful pojo〉
 *
 * @author Chen
 * @create 2018/7/30
 * @since 1.0.0
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}