package com.mt;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，比较两个数是否相等
 * 
 * 两个明确：
 * 		返回值类型：boolean(由于只有true和false两个结果)
 * 		参数列表：int a,int b
 */
public class MethodTest2 {
	
	//调用函数
	//比较两个数是否相等
	public static boolean compare(int a,int b){	
		//方法体
		if(a==b){
			return true;
		}else {
			return false;
		}
	}
	
	//主函数
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		//调用方法
		boolean flag = compare(a,b);
		
		//输出结果
		System.out.println("flag:"+flag);
	}
}