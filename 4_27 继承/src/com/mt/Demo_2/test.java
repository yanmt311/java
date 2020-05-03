package com.mt.Demo_2;

public class test {
    public static void main(String[] args) {
        //protected 同一包中不同类的访问
        Animal animal = new Animal();
        System.out.println(animal.name);
    }
}
