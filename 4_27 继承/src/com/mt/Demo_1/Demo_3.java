package com.mt.Demo_1;

class Test{
    int a;//默认权限--包访问权限--只能在同一个包中进行访问
}
public class Demo_3 {
    public static void main(String[] args) {
        //只能在同一个包中进行访问
        Test test = new Test();
        test.a = 10;
    }
}
