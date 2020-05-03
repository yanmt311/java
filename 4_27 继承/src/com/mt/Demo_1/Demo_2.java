package com.mt.Demo_1;

/**
 * 知识点1：extends
 *
 * 继承：1、Java 中一个子类只能继承一个父类 (而C++/Python等语言支持多继承).
 *      2、子类会继承父类的所有 public 的字段和方法.
 *      3、对于父类的 private 的字段和方法, 子类中是无法访问的.但可以继承，
 *          private只能访问类内，在类外不能访外
 *      4、子类的实例中, 也包含着父类的实例. 可以使用 super 关键字得到父类实例的引用.
 *
 *
 */
class Base{
    public int a;

    public Base(int a) {
        this.a = a;
        System.out.println("父类aaaaaaaaa");
    }
}

class Derive extends Base{
    public int b;

    public Derive(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("子类bbbbbbbbbbbbbbbb");
    }
}

public class Demo_2 {
    public static void main(String[] args) {
        //此时必须进行传参
        Derive derive = new Derive(99,88);
        //派生类继承了基类 --- 既包含了派生类的b，又包含了基类的a
        System.out.println(derive.b);
        System.out.println(derive.a);
    }
}
