package com.mt.Demo_1;

/**
 * 知识点1：oop的三大特征：继承、封装、多态
 *          1、private 修饰的类的成员属性和成员方法，不能再类外访外，只能在类内进行访外 --- 封装 --
 *            降低代码的管理复杂度---调用get和set方法
 *          2、为了解决代码冗余，使代码复用，提出了继承 ---  is-a的关系
 *          3、一个对象---开辟内存、调用构造方法
 * 知识点2：子类继承了父类的什么？
 *         答：子类（派生类） exdends 父类（基类/超类）
 *             子类继承了父类的除构造放阿凡达
 */
class Animal{
    public String name;

    //构造方法
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal --- 一个参数的构造方法");
    }

    public void eat(){
        System.out.println(this.name + "Animal :: eat()");
    }

    public void sleep(){
        System.out.println(this.name + "Animal :: sleep()");
    }
}

class Cat extends Animal{
    /**
     *  子类的实例中, 也包含着父类的实例. 可以使用 super 关键字得到父类实例的引用.
     *  ---子类在构造的时候，要帮助父类进行构造父类
     */
    public Cat(String name) {
        //先构造的父类
        /**
         * super：代表父类对象的引用，必须放到第一行
         *        1、super();调用父类对象的引用
         *        2、super.data();访问父类的属性
         *        3、super.func();访问父类的成员方法
         */
        super(name);//显示调用构造方法
        super.eat();
        super.sleep();
        super.name = "aaaa";

        System.out.println("Cat--一个参数的构造方法");
    }
    //    public String name;
//
//    public void eat(){
//        System.out.println(this.name + "Cat :: eat()");
//    }
}

class Bird{
    public String name;

    public void eat(){
        System.out.println(this.name + "Bird :: eat()");
    }

    public void fly(){
        System.out.println(this.name + "Bird :: fly()");
    }
}



public class Demo_1 {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
        cat.sleep();
//        Cat cat = new Cat();
//        //继承了父类的成员属性和成员方法
//        cat.name = "mmmm";
//        cat.eat();
//        cat.sleep();
    }
}
