package com.mt;
/*
 * 练习2： 获取三个整数中的最大值
 */

public class SanMu_Test2 {
	public static void main(String[] args) {
		//定义三个变量
		int a = 10;
		int b = 30;
		int c = 20;
		
		//先获取两个数的最大值，再和第三个数进行比较
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;		
		System.out.println("max:"+max);
	}
}
