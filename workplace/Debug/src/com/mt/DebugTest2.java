package com.mt;

import java.util.Scanner;

/*
 * 需求：看方法的调用流程
 * 
 * 有方法调用的时候，要想看到完整的流程，每个方法都要加断点，建议方法进入的第一条有效语句加断点
 */
public class DebugTest2 {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		// 调用方法
		int result = sum(a, b);

		// 输出结果
		System.out.println("result:" + result);
	}

	// 求和方法
	public static int sum(int a, int b) {
		return a + b;
	}
}