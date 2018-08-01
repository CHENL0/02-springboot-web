/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: ProductController
 * Author:   ca
 * Date:     2018/7/31 16:03
 * Description: The Controller of Product
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen          2018/7/31 16:03     1.0              The Controller of Product
 */
package com.test.springboot.springboot.controller;

import com.test.springboot.springboot.pojo.Foods;
import com.test.springboot.springboot.pojo.Order;
import com.test.springboot.springboot.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @description〈The Controller of Product〉
 * @author Chen
 * @create 2018/7/31
 * @since 1.0.0
 */
@Controller
public class ProductController {
    @GetMapping(value="/producttest", produces = "application/json; charset=utf-8")
   public @ResponseBody
    Order test1(){
        Product product1=new Product("热榜",1,new Foods(1,"面包","好吃",1.2,"http://xxx.com"));
        Product product2=new Product("好吃的",2,new Foods(2,"面包","好吃",1.2,"http://xxx.com"));
        List<Product> productList1=new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);
        Order order=new Order(1,"成功",productList1);
//       System.out.println(order.toString());
        return order;
   }
}