package com.mt;
/*
 * 需求：数组遍历(依次输出数组中的每一个元素)
 * 获取数组中元素的个数：数组名.length
 */
public class ArrayBianLi {
	public static void main(String[] args) {
		
		// 定义数组
		int[] arr = { 11, 22, 33, 44, 55 };
		
		// 方法一：原始做法，依次输出
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------------");

		// 方法二: 用for循环改进，但是需要知道数组中的元素个数，如果数组中的元素比较多，不容易得知
		for (int x = 0; x < 5; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//方法三:A：数组名.length------------获取数组元素个数
		//		 B：采用for循环实现依次输出数组中的元素个数
		
		//为了解决我们去数数组中元素个数的问题，数组就提供了一个属性：length
		//用于获取数组的长度
		//格式：
		//		数组名.length
		
		//确定元素个数
		System.out.println("数组共有："+arr.length+"个");
		System.out.println("--------------------");
	
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
}