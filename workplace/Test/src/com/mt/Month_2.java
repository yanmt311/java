package com.mt;

import java.util.Scanner;

/*
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 * 
 * 分析：
 * 		A:键盘录入一个月份,用Scanner实现
 * 		B:判断该月份是几月，根据月份输出对应的季节
 * 			if
 * 			switch
 * 
 * case穿透，没有break时可按顺序进行下一条语句
 */
public class Month_2 {
	public static void main(String[] args) {
		// 键盘录入一个月份,用Scanner实现
		Scanner sc = new Scanner(System.in);
		
		// 接收数据
		System.out.println("请输入月份(1-12)：");
		int month = sc.nextInt();
		
		//方法一：
		// 用switch语句实现
		/*
		switch (month) {
		case 1:
			System.out.println("冬季");
			break;
		case 2:
			System.out.println("冬季");
			break;
		case 3:
			System.out.println("春季");
			break;
		case 4:
			System.out.println("春季");
			break;
		case 5:
			System.out.println("春季");
			break;
		case 6:
			System.out.println("夏季");
			break;
		case 7:
			System.out.println("夏季");
			break;
		case 8:
			System.out.println("夏季");
			break;
		case 9:
			System.out.println("秋季");
			break;
		case 10:
			System.out.println("秋季");
			break;
		case 11:
			System.out.println("秋季");
			break;
		case 12:
			System.out.println("冬季");
			break;
		default:
			System.out.println("你输入的月份有误");
			break;
		}
		*/
		
		//方法二：
		//case 穿透，直到遇到break才跳出程序
		/*
		switch(month) {
		case 1:
			System.out.println("hello");
			//break;
		case 2:
			System.out.println("world");
			break;
		default:
			System.out.println("over");
			break;
		}
		*/
		
		//通过case穿透现象改进代码
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("你输入的月份有误");
			break;
		}
	}
}