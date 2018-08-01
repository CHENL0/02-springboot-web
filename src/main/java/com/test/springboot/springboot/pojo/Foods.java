/**
 * Copyright (C), 2018-2018, CLPS
 * FileName: Foods
 * Author:   ca
 * Date:     2018/7/31 16:07
 * Description: the pojo of foods
 * History:
 * <author>          <time>          <version>          <desc>
 * Chen          2018/7/31 16:07     1.0              the pojo of foods
 */
package com.test.springboot.springboot.pojo;

import java.io.Serializable;

/**
 * @description〈the pojo of foods〉
 * @author Chen
 * @create 2018/7/31
 * @since 1.0.0
 */
public class Foods implements Serializable {
    private int foodid;
    private String foodname;
    private String fooddescription;
    private double price;
    private String inco;

    public Foods(int foodid, String foodname, String fooddescription, double price, String inco) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.fooddescription = fooddescription;
        this.price = price;
        this.inco = inco;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFooddescription() {
        return fooddescription;
    }

    public void setFooddescription(String fooddescription) {
        this.fooddescription = fooddescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInco() {
        return inco;
    }

    public void setInco(String inco) {
        this.inco = inco;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "foodid=" + foodid +
                ", foodname='" + foodname + '\'' +
                ", fooddescription='" + fooddescription + '\'' +
                ", price=" + price +
                ", inco='" + inco + '\'' +
                '}';
    }
}