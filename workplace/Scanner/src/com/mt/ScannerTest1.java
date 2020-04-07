package com.mt;

//导包
import java.util.Scanner;

/*
* 键盘输入两个数据，并对其进行求和
*/
public class ScannerTest1 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//对其求和
		int sum = a + b;
		
		//输出结果
		System.out.println("sum:"+sum);
	}
}