package com.mt3;
/*
 * continue:继续的意思
 * 使用场景：
 * 		循环中
 * 注意：
 * 		离开使用场景是没有意义的
 * 作用：
 * 		结束一次循环，继续下一次的循环
 * 区别：
 * 		break:退出循环
 */
public class ContinueDemo1 {
	public static void main(String[] args) {
		//continue;
		for(int x=1; x<=10; x++) {
			//x==3时结束本次循环，即除3之外，总共9次
			if(x == 3) {
				continue;
			}
			System.out.println("HelloWorld");
		}
	}
}