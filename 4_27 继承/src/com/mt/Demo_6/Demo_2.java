package com.mt.Demo_6;

/**
 * 两个方法组成了重写：方法名相同，返回值相同、参数列表相同，但在不同的类种 进行继承
 */
class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal构造方法");
    }

    public void eat(){
        System.out.println("eat方法1111111111111111");
    }
}

class Cat extends com.mt.Demo_6.Animal {
    int count = 99;
    public Cat(String name) {
        super(name);
        System.out.println("Cat构造方法");
    }

    public void eat(){
        System.out.println("eat方法22222222222222");
    }
}

class Bird extends com.mt.Demo_6.Animal {
    public Bird(String name) {
        super(name);
        System.out.println("Bird构造方法");
    }

    public void fly(){
        System.out.println("fly方法");
    }
}
public class Demo_2 {
    /**
     * 不安全转换---此段代码运行时会发生类型转换异常
     *
     * 引入关键字instanceof 进行判断
     * @param args
     */
    public static void main(String[] args) {

        Animal animal = new Cat("mimi");

        //A instanceof B 判断A是不是B的一个实例
        if(animal instanceof Bird){
            Bird bird = (Bird)animal;
            System.out.println(bird.name);
            bird.fly();
            bird.eat();
        }else{
            System.out.println("向下转型实例化不一致");
        }


    }


    public static void main2(String[] args) {
        Animal animal = new Bird("bage");
        System.out.println(animal.name);
        animal.eat();

        /**
         * 向下转型，父类的引用，赋值给了子类
         *
         * 向下转型非常不安全
         *
         */
        Bird bird = (Bird)animal;
        System.out.println(bird.name);
        bird.fly();
        bird.eat();
    }




    public static void main1(String[] args) {
        Animal animal = new Cat("mimi");
        animal.eat();// --- 调用猫的eat，而不是animal，这就是多态
        /**
         * 运行时绑定：父类引用，引用子类对象，同时通过父类引用调用同名的覆盖方法，
         * 此时会发生运行时绑定。
         *
         *
         * javap -c 类名    反汇编编译
         *
         * 运行时绑定：动态绑定，编译时调用父类，运行结果为子类
         */
    }
}
