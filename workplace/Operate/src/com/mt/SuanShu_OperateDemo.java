package com.mt;
/*
 * 运算符:用于对常量和变量进行操作的运算符
 * 
 * 表达式：用运算符连接起来的符合java语法的式子。
 * 		不同的运算符连接起来的表达式是不同类型的表达式
 * 运算分类：
 * 		1、算数运算符
 * 			A：基本运算：+、-、*、/、%、++、--
 * 				%：用于获取两个数据相除时的余数
 * 				/：用于获取两个数据相除时的商
 * 			B:字符参与运算：是拿字符在计算机中存储的数据值来参与运算
 * 				'A' 65		'a' 97		'0' 48
 * 			C：字符串参与加法运算：其实做的不是加法运算，而是字符串的拼接
 * 			D：++，--：自增自减，用于对变量加1或者减1
 * 				a:单独使用的时候，++或者--放在变量的前面或者后面，结果都一样
 * 				b：参与其他操作的时候：
 * 					++，--在后面，先拿变量做操作，变量再++，--
 * 					++，--在前面，变量先++，--，再拿变量做操作，
 */

//算数运算符
public class SuanShu_OperateDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 3;
		int b = 4;
		char c = 'A';
		//算术运算符的基本使用
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		//注释：整数相除只能得到整数，要想得到小数，必须浮点数参与运算
		System.out.println(3.0 / 4);
		System.out.println(b / a);//商
		System.out.println(b % a);
		//字符参与算术运算
		System.out.println(c + a);
		//字符串参与算术运算
		System.out.println("hello" + a);//拼接
		System.out.println("hello" + a + b);//拼接
		System.out.println(a + b + "hello");//先加再拼接
		
		//单独使用
		int d = 10;
		System.out.println("d：" + d);
		d++;
		//++d;
		System.out.println("d：" + d);
		
		//参与其他操作时的运算
		int e = 10;
		//int f = e++;
		int h = ++e;
		//System.out.println("f：" + f);
		System.out.println("h：" + h);
	}
}
