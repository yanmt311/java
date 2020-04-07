package com.mt;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，返回两个数中的较大值
 * 
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b
 */
public class MethodTest1 {
	
	//调用函数
	// 返回两个数中的较大值
	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		
		//调用方法
		int max = getMax(x,y);
		System.out.println("max:"+max);
	}
}
