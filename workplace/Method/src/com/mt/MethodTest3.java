package com.mt;

import java.util.Scanner;

/*
 * 需求：键盘录入三个数据，返回三个数中的最大值
 * 
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b,int c
 */
public class MethodTest3 {
	
	//调用函数
	// 返回三个数中的最大值
	public static int getMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();
		
		//调用方法
		int max = getMax(a,b,c);
		
		//输出结果
		System.out.println("max:"+max);
	}
}