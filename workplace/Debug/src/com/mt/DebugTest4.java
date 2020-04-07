package com.mt;
/*
 * 方法的参数是引用类型：
 * 		形式参数的改变直接影响实际参数
 */
public class DebugTest4 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };
		// 遍历数组
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("----------------------------");
		
		change(arr);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	
	
	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			// 如果元素是偶数，值就变为以前的2倍
			if (arr[x] % 2 == 0) {
				arr[x] *= 2;
			}
		}
	}
	
}