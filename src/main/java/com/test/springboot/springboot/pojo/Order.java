/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: Order
 * Author:   ca
 * Date:     2018/7/31 16:21
 * Description: the pojo of Order
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen          2018/7/31 16:21     1.0              the pojo of Order
 */
package com.test.springboot.springboot.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @description〈the pojo of Order〉
 * @author Chen
 * @create 2018/7/31
 * @since 1.0.0
 */
public class Order implements Serializable {
    private int code;
    private String msg;
    private List<Product> productList;

    public Order(int code, String msg, List<Product> productList) {
        this.code = code;
        this.msg = msg;
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

/*   @Override
    public String toString() {
        return "Order{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", productList=" + productList +
               '}';
    }*/
}