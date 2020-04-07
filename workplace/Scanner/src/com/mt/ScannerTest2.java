package com.mt;

//导包
import java.util.Scanner;
/*
* 键盘录入两个数据，比较这两个数据是否相等
*/
public class ScannerTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//比较这两个数是否相等
		boolean flag = (a==b)?true:false;
//或者	boolean flag = (a==b);
		
		//输出数据
		System.out.println("flag:"+flag);
	}
}