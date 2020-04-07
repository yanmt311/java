package com.mt2;
/*do...while 格式：
 * 
 * 		初始化语句;
 * 		do {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}while(判断条件语句);
 * 1-100求和案例
 * 分析：
 * 		A：初始化求和变量
 * 		B：确定求和范围1-100，do...while循环
 * 		C：输出求和结果
 */
public class DoWhileTest1 {
	public static void main(String[] args) {
		//初始化求和变量
		int sum = 0;
		
		//确定求和变量
		int i = 1;
		do{
			sum += i;
			i++;
		}while(i<=100);
		
		//输出求和结果
		System.out.println("1-100求和："+sum);
	}
}
