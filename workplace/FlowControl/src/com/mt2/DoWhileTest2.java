package com.mt2;
/*
 * 统计水仙花个数
 * 	
 * 分析：
 * 		A：初始化统计量为0；
 * 		B：确定范围100-999；
 * 		C：求个位、十位、百位数
 * 		D；求立方和与变量匹配，则输出
 * 		E：输出统计结果
 */
public class DoWhileTest2 {
	public static void main(String[] args) {
		//初始化统计变量
		int count = 0;
		
		//循环体语句
		//确定范围
		int i = 100;
		do{
			//求个位、十位、百位
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			//匹配
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i){
				count++;
			}
			
			//控制语句
			i++;
			
		}while(i<=999);
		
		//输出统计结果
		System.out.println("水仙花个数:"+count+"个");
	}
}

