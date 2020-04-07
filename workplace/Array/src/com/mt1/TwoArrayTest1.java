package com.mt1;
/*
 * 二维数组遍历
 * 
 * System.out.println():输出内容并换行
 * System.out.print():输出内容不换行
 * 
 */
public class TwoArrayTest1 {
	public static void main(String[] args) {
		// 定义二维数组
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		/*
		//方法一：原始方法：
		//第一个一维数组的元素
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		//第二个一维数组的元素
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
				
		//第三个一维数组的元素
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);	
		
		System.out.println("----------------------------");
		*/
		
		
		/*
		//方法二：由于每一个arr[0][x],代表二维数组中的第一个一维数组，即用for循环改进
		//二维数组中的一维数组名称：二维数组名[索引]
		//arr[0] 其实就是二维数组中的第一个一维数组的名称
		//arr[1] 其实就是二维数组中的第二个一维数组的名称
		//arr[2] 其实就是二维数组中的第三个一维数组的名称
	
		//for循环改进第一次
		// 第一个一维数组的元素
		for (int x = 0; x < arr[0].length; x++) {
			System.out.print(arr[0][x] + "  ");
		}
		System.out.println();

		// 第二个一维数组的元素
		for (int x = 0; x < arr[1].length; x++) {
			System.out.print(arr[1][x] + "  ");
		}
		System.out.println();

		// 第三个一维数组的元素
		for (int x = 0; x < arr[2].length; x++) {
			System.out.print(arr[2][x] + "  ");
		}
		System.out.println();
		
		System.out.println("--------------------------------");
		*/
		
		/*
		//方法三：上述三个for循环只有一处不同，因此再一次用for循环改进，
		//       但是3是容易从二维数组中得知的一维数组个数，一维数组较大时不易得到
		for(int y=0; y<3; y++) {
			for (int x = 0; x < arr[y].length; x++) {
				System.out.print(arr[y][x] + "  ");
			}
			System.out.println();
		}			
		System.out.println("-----------------------------------");
		*/
		
		
		//方法四： 二维数组、一维数组的长度均用格式：
		//                     数组名.length求解个数
		for(int i=0; i<arr.length;i++) {
			for (int x = 0; x < arr[i].length; x++) {
				System.out.print(arr[i][x] + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		//两种不同的输出
		System.out.println("hello");//换行
		System.out.println("world");//换行
		System.out.print("hello");//不换行
		System.out.print("world");//不换行
	}
}
