package com.mt.Demo_2;


public class Animal {
    protected String name;

    public void eat(){
        //protected 同一包中的同一类中的访问
        System.out.println(this.name + "chi");
    }
}
