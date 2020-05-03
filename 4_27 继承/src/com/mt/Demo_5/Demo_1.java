package com.mt.Demo_5;

class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal构造方法");
    }

    public void eat(){
        System.out.println("eat方法");
    }
}

class Cat extends Animal{
    int count = 99;
    public Cat(String name) {
        super(name);
        System.out.println("Cat构造方法");
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
        System.out.println("Bird构造方法");
    }

    public void fly(){
        System.out.println("fly方法");
    }
}
public class Demo_1 {
    /**
     * 方法三：向上转型 --- 返回值
     * @return
     */
    public static Animal func(){
        Cat cat = new Cat("xixi");
        return cat;
        //return new Cat("xixi");
    }
    public static void main(String[] args) {
        Animal animal = func();
        System.out.println(animal.name);
        animal.eat();
    }
    /**
     * 方法二：向上转型--传参
     * @param animal
     */
    public static void func(Animal animal){
        System.out.println(animal.name);
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("xixi");
        func(cat);
    }
    public static void main2(String[] args) {
        /**
         * 向上转型 -- 父类引用，引用子类对象
         *
         * 向上转型之后，通过父类的引用，只能访问父类自己的方法和属性
         *
         *
         * 方法1：直接赋值
         */
        Animal animal = new Cat("xixi");
        System.out.println(animal.name);
        animal.eat();
        //animal.count;error --- 父类引用，只能访问自己特有的

    }

    public static void main1(String[] args) {
        Animal animal = new Animal("haha ");
        Cat cat = new Cat("mimi");
        Bird bird = new Bird("heihei");
    }

}
