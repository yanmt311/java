package com.mt2;
/*
 * 需求：把遍历数组改进为方法实现，并调用方法
 */
public class Test_1 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 11, 22, 33, 44, 55 };

		// 遍历
		// for (int x = 0; x < arr.length; x++) {
		// 		System.out.println(arr[x]);
		// }
		
		//用方法改进
		//printArray(arr);
		
		//这一次虽然可以，但是我觉得格式不好看，能不能打印成下面的格式呢?
		//[元素1, 元素2, 元素3, ...]
		printArray(arr);
	}
	
	
		/*
		 * 两个明确：
		 * 		返回值类型：void
		 * 		参数列表：int[] arr
		 */
	
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++){
			System.out.println(arr[x]);
		}
	}
	*/
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++){
			if(x==arr.length-1){
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	

}