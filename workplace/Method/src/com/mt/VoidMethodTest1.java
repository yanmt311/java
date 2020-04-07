package com.mt;
/*
 * 需求：写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值。
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：int n
 */

public class VoidMethodTest1 {
	
	//调用函数
	//在控制台打印1到该数据n的值
	public static void printNumber(int n) {
		//输出1-n的数
		for(int x=1; x<=n; x++) {
			System.out.println(x);
		}
	}
	
	//主函数
	public static void main(String[] args) {
		//单独调用方法
		printNumber(10);
		System.out.println("-------------------");
		printNumber(100);
	}
}


