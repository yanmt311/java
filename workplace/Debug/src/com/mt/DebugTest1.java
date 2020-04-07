package com.mt;
/*
 * 需求：看循环的执行流程(1-5求和案例)
 */
public class DebugTest1 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;

		// 循环获取每一个数据
		for (int x = 1; x <= 5; x++) {
			sum += x;
		}

		System.out.println("sum:" + sum);
	}
}