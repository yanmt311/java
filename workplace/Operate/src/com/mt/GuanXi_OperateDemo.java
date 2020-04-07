package com.mt;
/*
 * 3、关系运算符
 * 			==，!=,>=,>,<=,<
 * 			关系运算符的结果为boolean类型
 * 			注意事项：千万不要把==写成=
 */


//关系运算符
public class GuanXi_OperateDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		int b = 20;
		int c = 10;
		//==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-------------");
		//!=
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-------------");
		//>=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-------------");
		//注意事项
		System.out.println(a = b);//将b的值赋给a，然后将a输出
		System.out.println(a == c);
		System.out.println("-------------");
	}
}