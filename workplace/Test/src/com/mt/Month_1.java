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
 */
public class Month_1 {
	public static void main(String[] args) {
		// 键盘录入一个月份,用Scanner实现
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入一个月份(1-12)：");
		int month = sc.nextInt();
		
		//方法一：
		// 判断该月份是几月，根据月份输出对应的季节
		/*
		if (month == 1) {
			System.out.println("冬季");
		} else if (month == 2) {
			System.out.println("冬季");
		} else if (month == 3) {
			System.out.println("春季");
		} else if (month == 4) {
			System.out.println("春季");
		} else if (month == 5) {
			System.out.println("春季");
		} else if (month == 6) {
			System.out.println("夏季");
		} else if (month == 7) {
			System.out.println("夏季");
		} else if (month == 8) {
			System.out.println("夏季");
		} else if (month == 9) {
			System.out.println("秋季");
		} else if (month == 10) {
			System.out.println("秋季");
		} else if (month == 11) {
			System.out.println("秋季");
		} else if (month == 12) {
			System.out.println("冬季");
		} else {
			System.out.println("你输入的月份有误");
		}
		*/
		
		//方法二：
		//代码太长了，能不能简单一些呢?
		//能，如何简单一些呢?
		//我们可以把相同季节的月份放到一起来判断
		//(month==3 || month==4 || month==5)
		
		if(month==1 || month==2 || month==12) {
			System.out.println("冬季");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("春季");
		}else if(month==6 || month==7|| month==8) {
			System.out.println("夏季");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("秋季");
		}else {
			System.out.println("你输入的月份有误");
		}
	}
}