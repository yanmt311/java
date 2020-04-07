package com.mt;

import java.util.Scanner;

/*
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 * 
 * 分析：
 * 		A:定义一个长度为5的数组
 * 		B:通过键盘录入数据给数组中的元素赋值
 * 		C:定义方法将arr数组中的内容反转
 * 			什么是反转?如何反转?
 * 		D:定义方法对反转数据进行遍历
 * 
 * 注意：参数传递时是引用类型，返回值类型一般设置为void
 */
public class RollBack {
	public static void main(String[] args) {
		// 定义一个长度为5的数组
		int[] arr = new int[5];

		// 通过键盘录入数据给数组中的元素赋值
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < arr.length; x++) {
			System.out.println("请给出第" + (x + 1) + "个元素");
			arr[x] = sc.nextInt();
		}
		
		System.out.println("反转前的数组元素：");
		printArray(arr);

		// 定义方法将arr数组中的内容反转
		// 类型为void时，用单独调用的方法
		reverse(arr);
		
		System.out.println("反转后的数组元素：");
		//定义方法遍历数组
		printArray(arr);
	}
	
	//遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length; x++){
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/*
	 * 两个明确： 
	 * 		返回值类型：void （注意：参数传递时是引用类型，返回值类型一般设置为void）
	 * 		参数列表：int[] arr
	 */
	//reverse是反转的意思
	public static void reverse(int[] arr) {
		for(int startIndex=0,endIndex=arr.length-1;startIndex<=endIndex;startIndex++,endIndex--) {
			//两数进行交换
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
}