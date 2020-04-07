package com.mt;
/*
 * 定义一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = new int[3];
		
		//输出数组名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//给数组中的元素赋值
		arr[0] = 100;
		arr[2] = 200;
		
		//再次输出数组名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}