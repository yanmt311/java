package com.mt.Demo_4;

class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("1");
    }

    public void eat(){
        System.out.println("eat");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
        System.out.println("2");
    }
}
class ChineGardenCat extends Cat{
    public ChineGardenCat(String name) {
        super(name);
        System.out.println("3");
    }
}

public class Demo_1 {
    public static void main(String[] args) {
        ChineGardenCat chineGardenCat = new ChineGardenCat("haha");
        System.out.println(chineGardenCat.name);
        chineGardenCat.eat();
    }
}
