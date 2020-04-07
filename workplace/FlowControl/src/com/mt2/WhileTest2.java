package com.mt2;
/*
 * 统计水仙花个数
 * 	分析：
 * 		A:确定范围100-999，用for循环
 * 		B:	求个位数153%10=
 * 			求十位数153/10%10=
 * 			求百位数153/10/10%10=
 * 		C:求其立方和,若等于原始数据则为水仙花数
 * 		D:输出求和的数据
 */
public class WhileTest2 {
	public static void main(String[] args) {
		//初始化
		int count = 0;
		int i = 100;
		while (i<=999){
			
			//循环体语句
			//获取个位，十位，百位
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
				
			//让每个位上的立方和相加，并和该数据进行比较
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i) {
				count++;
			}
			
			//控制语句
			i++;
		}
		//统计数据输出
		System.out.println("水仙花个数"+count+"个");
	}
}
