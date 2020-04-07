package com.mt;
/*
 * 写一个方法，把所有的水仙花数打印在控制台
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：无参数
 */
public class VoidMethodTest2 {
	
	//调用函数
	//把所有的水仙花数打印在控制台
	public static void printFlower() {
		
		//水仙花数
		//确定范围
		for(int x=100; x<1000; x++) {
			//输出个位、十位、百位
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//立方和与数据进行匹配
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
				//如果匹配，则为水仙花数
				System.out.println(x);
			}
		}
		
	}
	
	//主函数
	public static void main(String[] args) {
		//调用方法
		printFlower();
	}
}