package com.mt;
/*
 * 三元运算符的练习
 * 练习1：比较两个整数是否相同
 */

public class SanMu_Test1 {
	public static void main(String[] args) {
		//定义两个变量
		int a = 10;
		int b = 20;
		
		boolean flag = (a == b)?true:false;
		//boolean flag = (a == b);//因为boolean只有true和false两个值
		System.out.println("flag:"+flag);
	}
}

