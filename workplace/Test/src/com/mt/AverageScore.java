package com.mt;

import java.util.Scanner;

/*
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 		 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个选手的平均值。
 * 		 请写代码实现。(不考虑小数部分)
 * 
 * 分析：
 * 		A:定义一个长度为6的数组。
 * 		B:通过键盘录入的方式给出评委的分数
 * 		C:写方法实现获取数组中的最大值，最小值
 * 		D:写方法实现数组元素的求和
 * 		E:平均分： (和-最高分-最低分)/(arr.length-2)
 * 		F:输出分数即可
 */
public class AverageScore  {
	public static void main(String[] args) {
		//定义一个长度为6的数组
		int[] arr = new int[6];
		
		//通过键盘录入的方式给出评委的分数
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据，用for循环可直接得到6个评委的分数
		for(int x=0; x<arr.length; x++) {
			// arr[x] = sc.nextInt();
			System.out.println("请给出第"+(x+1)+"个评委的分数(0-100)：");
			int number = sc.nextInt();
			arr[x] = number;
		}
		
		//写方法实现获取数组中的最大值，最小值
		int max = getMax(arr);
		int min = getMin(arr);
		
		//写方法实现数组元素的求和
		int sum = sum(arr);
		
		// (和-最高分-最低分)/(arr.length-2)
		int avg = (sum-max-min)/(arr.length-2);
		
		//输出分数即可
		System.out.println("该选手的最终得分是："+avg);
	}
	
	//数组中的最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
	
	//数组中的最小值
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		return min;
	}
	
	//数组元素求和
	public static int sum(int[] arr) {
		int sum = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
		
		return sum;
	}
	
}