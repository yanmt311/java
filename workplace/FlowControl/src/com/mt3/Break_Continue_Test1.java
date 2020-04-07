package com.mt3;
/*
 * break：结束整个循环
 * continue：结束本次循环，进行下一次循环
 */

//按要求分析结果，并验证
public class Break_Continue_Test1 {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			//3 6 9
			if (x % 3 == 0) {
				// 分别写break，continue，说说输出几次
				//break;//输出2次，除过1，2
				continue;//输出7次，除过3，6，9
			}
			System.out.println("我爱林青霞");
		}
	}
}