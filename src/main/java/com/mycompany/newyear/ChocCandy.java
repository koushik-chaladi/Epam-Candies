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
public class ChocCandy extends Candies {
    ChocCandy(int price,int weight)
    {
        super(price,weight);
    }  
    public String className()
    {
        return "chocCandy";
    }
}
