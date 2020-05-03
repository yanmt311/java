package com.mt.Demo_3;

import com.mt.Demo_2.Animal;

public class Demo_1 extends Animal {
    //protected不同包中的子类中进行访问 -- 必须是public 并且用super访问 -- static不依赖对象，super是父类对象的引用
    public void func(){
        Animal animal = new Animal();
        System.out.println(super.name);
    }

}
