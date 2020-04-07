package com.mt;

/*
 * 需求：写一个方法，在控制台输出10次HelloWorld案例。
 * 
 * 定义格式：
 * 		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
 * 			方法体;
 * 			return 返回值;
 * 		}
 * 格式解释：
 * 		A:修饰符:目前记住 public static
 * 		B:返回值类型: 用于限定返回值的数据类型
 * 		C:方法名:一个名字，为了方便我们调用方法
 * 		D:参数类型: 用于接收调用方法时传入的数据的类型
 * 		E:参数名:  用于接收调用方法时传入的数据的变量
 * 		F:方法体: 完成功能的代码
 * 		G:return: 结束方法，把返回值带给调用者
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：无参数
 * 
 * 如果一个方法没有明确的返回值类型，java提供了void进行修饰。
 * 
 * void修饰的方法的调用：只能使用单独调用
 */
public class VoidMethodDemo {
	
	//调用函数
	//在控制台输出10次HelloWorld案例。
	public static void printHelloWorld() {
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}
	}
	
	//主函数
	public static void main(String[] args) {
		//单独调用
		printHelloWorld();
		
		//输出调用------错误
		//System.out.println(printHelloWorld());
		//System.out.println(void);
		
		//赋值调用------错误
		//void v = printHelloWorld();
	}
}