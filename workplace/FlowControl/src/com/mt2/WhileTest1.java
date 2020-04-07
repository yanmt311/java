package com.mt2;
/*
 * while循环实现1-100之间数据求和
 */
public class WhileTest1 {
	public static void main(String[] args) {
		
		//回顾for循环实现
		
		/*
		//定义求和变量
		int sum = 0;
		
		//获取1-100之间的数据
		for(int x=1; x<=100; x++) {
		
			//累加求和
			sum += x;
		}
		System.out.println("1-100的和是："+sum);
		*/
		
		//while循环实现
		//定义求和变量
		int sum = 0;
		int i = 1;
		while (i<=100){
			sum += i;
			i++;
		}
		System.out.println("1-100的和是："+sum);
	}
}
