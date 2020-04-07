package com.mt;
/*
 * 4、逻辑运算符：用于连接关系表达式
 * 			&,|,^,!
 * 			&&,||
 * 				A:&:有false则false
 * 				B:|：有true则true
 * 				C:^：相同则false，不同则true。
 * 				D:！：true则false，false则true
 * 				E:&&：与&结果相同
 * 				F:||：与|结果相同
 * 			&&与&区别：&&有短路效果，左边为false，右边不执行；
 * 					  &左边无论是什么，右边都会执行
 * 			||与|区别：||有短路效果，左边为true，右边不执行；
 * 					  |左边无论是什么，右边都会执行
 */


//逻辑运算符
public class LuoJi_OperateDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 3;
		int b = 4;
		int c = 5;
		//&
		System.out.println((a>b) & (a>c));//false & false
		System.out.println((a<b) & (a>c));//true & false
		System.out.println((a>b) & (a<c));//false & true
		System.out.println((a<b) & (a<c));//true & true
		System.out.println("--------------------");
		
		//|
		System.out.println((a>b) | (a>c));//false | false
		System.out.println((a<b) |  (a>c));//true | false
		System.out.println((a>b) | (a<c));//false | true
		System.out.println((a<b) | (a<c));//true | true
		System.out.println("-------------------");
		
		//^
		System.out.println((a>b) ^ (a>c));//false ^ false
		System.out.println((a<b) ^ (a>c));//true ^ false
		System.out.println((a>b) ^ (a<c));//false ^ true
		System.out.println((a<b) ^  (a<c));//true ^ true
		System.out.println("------------------");
		
		//!
		System.out.println((a>b));//false
		System.out.println(!(a>b));//true
		System.out.println(!!(a>b));//false
		
		//&&
		System.out.println((a>b) && (a>c));//false && false
		System.out.println((a<b) && (a>c));//true && false
		System.out.println((a>b) && (a<c));//false && true
		System.out.println((a<b) && (a<c));//true && true
		System.out.println("--------------------");
		
		//||
		System.out.println((a>b) || (a>c));//false || false
		System.out.println((a<b) ||  (a>c));//true ||false
		System.out.println((a>b) || (a<c));//false || true
		System.out.println((a<b) || (a<c));//true || true
		System.out.println("-------------------");
		
		//&&与&区别
		//定义变量
		int x = 10;
		int y = 20;
		//System.out.println((x++ > 10) & (y++ > 10));//false & false = false
		//先x = 10,后x++，后判断>10不，再&
		//System.out.println("x：" + x);//11
		//System.out.println("y：" + y);//21
  	System.out.println((x++ > 10) && (y++ > 10));//false & false = false
		System.out.println("x：" + x);//11
		System.out.println("y：" + y);//20
	}
}