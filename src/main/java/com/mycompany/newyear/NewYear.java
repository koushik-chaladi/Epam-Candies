/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newyear;
import java.util.*;
import java.io.*;
/**
 *
 * @author HP
 */

public class NewYear {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Sweet> sweetcoll = new ArrayList<Sweet>();
    static ArrayList<choclates> choccoll=new ArrayList<choclates>();
    static ArrayList<Candies> cancoll=new ArrayList<Candies>();
    void total_weight()
    {
        int total=0;
        for(choclates choc: choccoll)
        {
            total=total+choc.getWeight();
        }    
        for(Sweet sweet: sweetcoll)
        {
            total=total+sweet.getWeight();
        }
        System.out.println(total);
    }
    void sort_choc(String type)
    {
        Scanner s=new Scanner(System.in);
        int lower,upper;
        System.out.println("Enter upper limit");
        lower=s.nextInt();
        System.out.println("Enter lower limit");
        upper=s.nextInt();
        if(type.equals("weight"))
        {
      for(int i=0;i<choccoll.size();i++)
      {
           for(int j=i+1;j<choccoll.size();j++)
           {
               if((choccoll.get(i)).getWeight()>(choccoll.get(j)).getWeight())
               {
                   Collections.swap(choccoll,i,j);
                   System.out.println("hello");
               }
           }
       } 
      for(int i=0;i<choccoll.size();i++)
      {
          if((choccoll.get(i)).getWeight()>=lower &&(choccoll.get(i)).getWeight()<=upper)
          System.out.println((choccoll.get(i)).className());
      }
        }
        else
        {
      for(int i=0;i<choccoll.size();i++)
      {
           for(int j=i+1;j<choccoll.size();j++)
           {
               if((choccoll.get(i)).getPrice()>(choccoll.get(j)).getPrice())
               {
                   Collections.swap(choccoll,i,j);
                   System.out.println("hello");
               }
           }
       } 
      for(int i=0;i<choccoll.size();i++)
      {
          if((choccoll.get(i)).getPrice()>=lower &&(choccoll.get(i)).getPrice()<=upper)
          System.out.println((choccoll.get(i)).className());
      }
       }
    }
    void sort_cand(String type)
    {
        Scanner s=new Scanner(System.in);
        int lower,upper;
        System.out.println("Enter upper limit");
        lower=s.nextInt();
        System.out.println("Enter lower limit");
        upper=s.nextInt();
    if(type.equals("weight"))
        {
      for(int i=0;i<cancoll.size();i++)
      {
           for(int j=i+1;j<cancoll.size();j++)
           {
               if((cancoll.get(i)).getWeight()>(cancoll.get(j)).getWeight())
               {
                   Collections.swap(cancoll,i,j);
                   System.out.println("hello");
               }
           }
       } 
      for(int i=0;i<cancoll.size();i++)
      {
          if((cancoll.get(i)).getWeight()>=lower &&(cancoll.get(i)).getWeight()<=upper)
          System.out.println((cancoll.get(i)).className());
      }
        }
        else
        {
      for(int i=0;i<cancoll.size();i++)
      {
           for(int j=i+1;j<cancoll.size();j++)
           {
               if((cancoll.get(i)).getPrice()>(cancoll.get(j)).getPrice())
               {
                   Collections.swap(cancoll,i,j);
                   System.out.println("hello");
               }
           }
       } 
      for(int i=0;i<cancoll.size();i++)
      {
          if((cancoll.get(i)).getPrice()>=lower &&(cancoll.get(i)).getPrice()<=upper)
          System.out.println((cancoll.get(i)).className());
      }
       }
    }
    public static void main(String[] args) {
       
        // TODO code application logic here
        NewYear obj=new NewYear();
        obj.input_choc();
        obj.sort_choc("weight");
    }
    void input_choc()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Choclates");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter type");
            String str=s.next();
            System.out.println("Enter candyname");
            String cname=s.next();
            System.out.println("Enter price and weight");
            int price=s.nextInt();
            int weight=s.nextInt();
            if(str.equals("candies"))
            {
                if(cname.equals("CandyMan"))
                {
                    Candies choc=new CandyMan(price,weight);
                    choclates choc1=new CandyMan(price,weight);
                    cancoll.add(choc);
                    choccoll.add(choc);
                }
                else
                {
                    ChocCandy choc=new ChocCandy(price,weight);
                    choclates chocl=new ChocCandy(price,weight);
                     cancoll.add(choc);
                     choccoll.add(choc);
                }
            }
            else
            {
                Waffy choc=new Waffy(price,weight);
                choccoll.add(choc);
                
            }
        }
    }
    void input_sweets()
    {
         Scanner s=new Scanner(System.in);
    System.out.println("Enter number of sweets");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Sweet Name");
            String sweets=s.next();
            System.out.println("Enter Sweet Weight");
            int weight=s.nextInt();
            System.out.println("Enter Sweet Price");
            int price=s.nextInt();
            if(sweets.equals("gulabjam"))
            {
                GulabJam sweet=new GulabJam(price,weight);
                sweetcoll.add(sweet);
            }
            else if(sweets.equals("MysorePak"))
            {
                MysorePak sweet=new MysorePak(price,weight);
                sweetcoll.add(sweet);
            }
            else
            {
                KajuBarfi sweet=new KajuBarfi(price,weight);
                sweetcoll.add(sweet);
                
            }
        }
    }
    
}
