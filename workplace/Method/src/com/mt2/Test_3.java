package com.mt2;
/*
 * 需求：写一个方法，用于对数组进行求和，并调用方法。
 */
public class Test_3 {
	public static void main(String[] args) {
		
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };
		
		// 定义求和变量
		// int sum = 0;
		// 获取数组中的每一个元素
		// for(int x=0; x<arr.length; x++) {
		// 		sum += arr[x];
		// }
		
		//用方法改进
		int sum = sum(arr);
		
		System.out.println("sum:"+sum);
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：int[] arr
	 */
	public static int sum(int[] arr) {
		int sum = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
		
		return sum;
	}
}