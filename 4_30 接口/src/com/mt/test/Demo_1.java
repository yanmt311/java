package com.mt.test;

import java.util.Arrays;
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
        //简单类型
        public int age;

        //引用类型
        Money m = new Money();

        @Override
        protected Object clone() throws CloneNotSupportedException {
            //1、克隆person
            Person person = (Person)super.clone();
            //2、克隆当前Money对象 money
            person.m = (Money) this.m.clone();
            return person;
        }
}
/**
 * 浅拷贝
 */
//class Money{
//    double money = 12.5;
//}
//
//class Person implements Cloneable{
//        //简单类型
//        public int age;
//
//        //引用类型
//        Money m = new Money();
//
//        @Override
//        protected Object clone() throws CloneNotSupportedException {
//            return super.clone();
//        }
//}

public class Demo_1 {
    public static void main3(String[] args) {

    }
    /**
     * 浅拷贝：引用类型 改变数值 --- 同时指向一个地址
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        Person person1 =(Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person1.m.money);

        person.m.money = 99;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
    }

    /**
     * 克隆接口是一个空接口（标记接口）---标记这个类，这个类是可以进行克隆的
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        /**
         * 由Object类型转换为Person
         *
         */
        Person person2 = (Person) person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);

        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);

    }
    /**
     * 深拷贝:简单类型，不改变 --- 分别指向不同的地址
     * @param args
     */
    public static void main1(String[] args) {
         int[] array = {1,2,3,4,5,6};
         int[] array2 = array.clone();
         array2[0] = 99;
         System.out.println(Arrays.toString(array));
         System.out.println(Arrays.toString(array2));

    }
}


