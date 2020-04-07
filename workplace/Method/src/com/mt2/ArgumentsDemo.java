package com.mt2;
/*
 * 方法的参数是基本类型的时候：形式参数的改变不影响实际参数。
 * 			形式参数：用于接收实际数据的变量
 *			实际参数：实际参与运算的变量
 */
public class ArgumentsDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
	}
	
	//形式参数的改变
	public static void change(int a, int b) { // a=10,b=20
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		a = b; // a=20;
		b = a + b;// b=40;
		System.out.println("a:" + a + ",b:" + b);// a:20,b:40
	}

}