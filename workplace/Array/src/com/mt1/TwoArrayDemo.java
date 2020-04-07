package com.mt1;
/*
 * 二维数组：就是元素为一维数组的数组。
 * 
 * 定义格式：
 * 		A:数据类型[][] 数组名;
 * 		B:数据类型 数组名[][];	不推荐
 * 		C:数据类型[] 数组名[];	不推荐
 * 
 * 如何初始化呢?
 * 		A:动态初始化
 * 			数据类型[][] 数组名 = new 数据类型[m][n];
 * 			m表示这个二维数组有多少个一维数组
 * 			n表示每一个一维数组的元素有多少个
 * 
 * 		B:静态初始化
 * 			a：定义格式：
 * 	      	数据类型[][] 数组名 = new 数据类型[][]{{元素...},{元素...},{元素...},...};
 * 			b：简化格式：
 * 			数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
 * 
 * 注意:
 * 		二维数组名配合索引获取每一个一维数组
 * 		每一个一维数组配个索引名获取数组中的元素
 * 
 * 		举例：
 * 			假如我有一个二维数组：arr
 * 			从中获取一维数组：arr[索引]
 * 			从中获取二维数组元素：arr[索引][索引]
 */
public class TwoArrayDemo {
	public static void main(String[] args) {
		//静态初始化
		// 数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr); // [[I@104c575 二维数组地址
		System.out.println(arr.length); // 二维数组中的一维数组的个数
		
		System.out.println(arr[0]);// [I@3fa5ac 二维数组中第一个一维数组的地址
		System.out.println(arr[0].length);
		
		System.out.println(arr[1]);// [I@95cfbe 二维数组中第二个一维数组的地址
		System.out.println(arr[2]);// [I@179dce4 二维数组中第三个一维数组的地址
		
		//我如何获取到一个二维数组的元素呢?
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
	}
}
