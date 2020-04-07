package com.mt;
/*
 * 定义两个数组，先定义一个数组，赋值，输出。
 * 然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
 * 然后给第二个数组赋值，再次输出两个数组的名及元素。
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		// 先定义一个数组，赋值，输出
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("---------");

		// 然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组
		//地址赋值可以将数组名直接赋值
		int[] arr2 = arr;
		// 然后给第二个数组赋值
		arr2[0] = 111;
		arr2[1] = 222;
		arr2[2] = 333;

		// 再次输出两个数组的名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("---------");
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}