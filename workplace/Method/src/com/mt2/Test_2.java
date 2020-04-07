package com.mt2;
/*
 * 需求：把获取数组最值改进为方法实现，并调用方法
 */
public class Test_2 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 34, 67, 10, 28, 59 };
		
		//获取数组中的最大值
		// //定义参照物
		// int max = arr[0];
		// //遍历，依次比较，大的留下来
		// for(int x=1; x<arr.length; x++) {
		// 		if(arr[x] > max) {
		// 			max = arr[x];
		// 		}
		// }
		
		//用方法改进
		int max = getMax(arr);
		System.out.println("max:"+max);
		
		//获取数组中的最小值，用方法实现
		int min = getMin(arr);
		System.out.println("min:"+min);
		
	}
	
	//获取数组中的最小值的方法
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		return min;
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：int[] arr
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
}