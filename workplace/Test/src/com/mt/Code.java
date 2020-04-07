package com.mt;

import java.util.Scanner;

/*
 * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 		 每位数字都加上5,然后除以10的余数代替该数字,
 * 		 再将第一位和第四位交换,第二位和第三位交换,
 * 		 请把加密后的数据输出到控制台
 * 
 * 分析：
 * 		A:键盘录入一个四位数
 * 			举例：4567	
 * 		B:对数据进行加密
 * 			a：把这个四位数分成个，十，百，千存储到数组中
 * 				int[] arr = {4,5,6,7};
 * 						int ge = number%10;
 * 						int shi = number/10%10;、
 * 						int bai = number/10/10%10;
 * 						int qian = number/10/10/10%10;
 * 			b；每位数字都加上5：
 * 				arr[x] += 5;	{9,10,11,12}
 * 			c：然后除以10的余数代替该数字：
 * 				arr[x] %= 10;	{9,0,1,2}
 * 			d：再将第一位和第四位交换,第二位和第三位交换：
 * 					{9,0,1,2}		{2,1,0,9}
 * 		C:输出加密后的数据
 * 				遍历加密后的数组
 */
public class Code {
	public static void main(String[] args) {
		//键盘录入一个四位数
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入一个四位数：");
		int number = sc.nextInt();
		
		//分别得到该数据的每一个位上的数据
		int ge = number%10;
		int shi = number/10%10;
		int bai = number/10/10%10;
		int qian = number/10/10/10%10;
		
		//定义一个数组
		int[] arr = new int[4];
		arr[0] = qian;
		arr[1] = bai;
		arr[2] = shi;
		arr[3] = ge;
		
		//加密规则
		//每位数字都加上5,然后除以10的余数代替该数字
		for(int x=0; x<arr.length; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//再将第一位和第四位交换,第二位和第三位交换
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		
		//输出加密后的数据
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]);//不换行
		}
		System.out.println();//换行
	}
}