package com.mt;

import java.util.Scanner;
/*
 *需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *		(1)给定数组int[] arr = {5,7,3,2,5};
 *		(2)要查询的元素通过键盘录入的方式确定
 *		(3)定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 *
 *分析：
 *		A:给定数组int[] arr = {5,7,3,2,5};
 *		B:要查询的元素通过键盘录入的方式确定
 *		C:定义一个查找数组元素第一次出现位置的方法
 *			遍历数组，获取到每一个元素，进行比较，如果想等，就直接把该处的索引返回。
 *		D:调用方法，输出结果
 */

public class IndexChaZhao {
	public static void main(String[] args) {
		// 给定数组int[] arr = {5,7,3,2,5};
		int[] arr = { 5, 7, 3, 2, 5 };

		//要查询的元素通过键盘录入的方式确定
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要查找的元素：");
		int number = sc.nextInt();
		
		//定义一个查找数组元素第一次出现位置的方法
		//调用方法
		int index =getIndex(arr, number);
		System.out.println("index:"+index);
	}
	
	
	/*
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		//遍历数组，获取到每一个元素，进行比较，如果想等，就直接把该处的索引返回。
		/*
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				return x;
			}
		}
		
		return -1;//(arr[x] != value)
		*/
		
		
		int index = -1;
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		return index;
	}
}