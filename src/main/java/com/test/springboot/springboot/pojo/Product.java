/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: Product
 * Author:   ca
 * Date:     2018/7/31 16:00
 * Description: the pojo of product
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen          2018/7/31 16:00     1.0              the pojo of product
 */
package com.test.springboot.springboot.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @description〈the pojo of product〉
 * @author Chen
 * @create 2018/7/31
 * @since 1.0.0
 */
public class Product implements Serializable {
    private String name;
    private int type;
    private Foods foods;

    public Product(String name, int type, Foods foods) {
        this.name = name;
        this.type = type;
        this.foods = foods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Foods getFoods() {
        return foods;
    }

    public void setFoods(Foods foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", foodsList=" + foods +
                '}';
    }
}