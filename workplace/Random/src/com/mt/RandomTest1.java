package com.mt;

//导包
import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏案例
 *		系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 * 分析：
 * 		A:系统产生一个随机数1-100之间的。
 * 			int number = r.nextInt(100) + 1;
 * 		B:键盘录入我们要猜的数据
 * 			用Scanner实现
 *		C:比较这两个数据(用if语句)
 *			大了：给出提示大了
 *			小了：给出提示小了
 *			猜中了：给出提示，恭喜你，猜中了
 *		D:多次猜数据，而我们不知道要猜多少次，怎么办呢?
 *			while(true) {循环的内容}
 */
public class RandomTest1 {
	public static void main(String[] args) {
		// 系统产生一个随机数1-100之间的。
		Random r = new Random();
		int number = r.nextInt(100) + 1;

		while(true){
			// 键盘录入我们要猜的数据
			Scanner sc = new Scanner(System.in);
			//接收数据
			System.out.println("请输入你要猜的数字(1-100)：");
			int guessNumber = sc.nextInt();
	
			// 比较这两个数据(三种情况则用if语句)
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你,猜中了");
				break;
			}
		}	
	}
}

/*
 * 1、键盘录入
 * 		A：导包
 * 			import java.util.Scanner;
 * 		B：创建对象
 * 			Scanner sc = new Scanner(System.in);
 * 		c：接收数据
 * 			int i = sc.nextInt();
 * 2、随机数产生
 * 		A：导包
 * 			import java.util.Random;
 * 		B：创建对象
 * 			Random r = new Random();
 * 		C：获取随机数
 * 			int number = r.nextInt(10);
 */
