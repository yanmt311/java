package com.mt1;
/*
 * 需求：比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
 *       并在main方法中进行测试
 */
public class HeavyLoadTest1 {
	
	// 调用函数
	// 两个byte类型
	public static boolean compare(byte a, byte b) {
		System.out.println("byte---");
		// 第一种写法
		// boolean flag = a==b?true:false;
		// return flag;
		// 第二种写法
		// boolean flag = a == b;
		// return flag;
		// 第三种写法
		return a == b;
	}

	// 两个short类型
	public static boolean compare(short a, short b) {
		System.out.println("short---");
		return a == b;
	}

	// 两个int类型
	public static boolean compare(int a, int b) {
		System.out.println("int---");
		return a == b;
	}

	// 两个long类型
	public static boolean compare(long a, long b) {
		System.out.println("long---");
		return a == b;
	}
	
	// 主函数
	public static void main(String[] args) {
		// 调用方法
		//整数
		System.out.println(compare(10, 20));
		System.out.println("-----------------------------------");
		//字节
		System.out.println(compare((byte)10, (byte)20));
		System.out.println("-----------------------------------");
		//短整型
		System.out.println(compare((short)10, (short)20));
		System.out.println("-----------------------------------");
		//长整型
		//System.out.println(compare((long)10, (long)20));
		System.out.println(compare(10L, 20L));
	}

	
}