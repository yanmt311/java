package com.mt;

/*
 * 需求：数组获取最值(获取数组中的最大值)
 */

public class ArrayMax {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {12,98,45,73,60};
		
		//定义参照物
		int max = arr[0];
		
		//遍历数组，获取除了0以外的所有元素，进行比较
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("数组中的最大值是："+max);
	}
}