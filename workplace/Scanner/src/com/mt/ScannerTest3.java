package com.mt;
/*
 * 键盘输入三个数据，获取其中最大值
 */

//导包
import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();
		
		//获取其中的最大值，先获取两个数据的最大值，在得到第三个数据
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		
		//输出最大值
		System.out.println("max:"+max);
	}
}
