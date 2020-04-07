package com.mt;

public class ArrayMin {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3,4,5};
		
		//设置参照物
		int min = arr[0];
		
		//遍历，除0以外。获取最小值
		for(int i = 1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		//输出最小值
		System.out.println("数组最小值:"+min);
	}
}
