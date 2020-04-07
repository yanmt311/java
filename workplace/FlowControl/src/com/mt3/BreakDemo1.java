package com.mt3;
/*
 * break:中断的意思
 * 使用场景：
 * 		A:switch语句中,用于结束程序
 * 		B:循环中
 * 注意：
 * 		离开使用场景是没有意义的。不能单独使用
 * 作用：
 * 		跳出循环，让循环提前结束
 */
public class BreakDemo1 {
	public static void main(String[] args) {
		//break;
		for(int x=1; x<=10; x++) {
			//x==3时就结束循环，即总共2次
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
	}
}