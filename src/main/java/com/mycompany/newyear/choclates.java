/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newyear;

/**
 *
 * @author HP
 */
public class choclates {
    int price,weight;
    choclates(int price,int weight)
    {
        this.price=price;
        this.weight=weight;
    }
        public int getPrice()
    {
        return price;
    }
    public int getWeight()
    {
        return weight;
    }
    String className()
    {
        return "choclate";
    }
}
