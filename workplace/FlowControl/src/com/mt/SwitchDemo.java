package com.mt;

import java.util.Scanner;

/*
 * switch语句格式：
 * 		case 值1;
 * 			语句体1;
 * 			break;
 * 		case 值2;
 * 			语句体2;
 * 			break;
 * 		...
 * 		default:
 * 			语句体n+1;
 * 			break;
 * 
 * 格式解释：
 * 	表达式的取值：byte,short,int,char
 * 			JDK5以后可以是枚举
 * 			JDK7以后可以是String（字符串）
 * 	case后面的值：要和表达式进行匹配的值
 *  语句体部分可以是一条或多条语句
 *  break表示中断，结束的意思，可以结束switch语句
 *  default语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
 *  
 *  执行流程：
 *  	A: 首先计算出表达式的值
 *  	B：和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。
 *  	C：如果所有的case都和表达式的值不匹配，就会执行default语句体部分n+1，然后程序结束掉。
 *  
 */

//根据键盘录入的数值1，2，3，4，5，6，7输出对应的星期一，星期二，星期三，...，星期日
public class SwitchDemo {
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入一个数字(1-7):");
		int weekday = sc.nextInt();
		
		switch(weekday){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的数据有误");
			break;
		}
	}
}
