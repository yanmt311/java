package com.mt;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//采用if语句格式2实现
		/*
		if(a>b){
			System.out.println("较大的值是："+a);
		}else {
			System.out.println("较大的值是："+b);
		}
		*/
		
		//拿到较大的值之后，我未必想直接输出，所以我们定义变量接收这个较大的值
		int max;
		if(a>b){
			max = a;
		}else {
			max = b;
		}
		//可能做其他的操作
		//max += 100;
		System.out.println("较大的值是："+max);
	}
}
