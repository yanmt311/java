package com.mt;
/*
 * 两个常见小问题：
 * 
 * 		A:java.lang.ArrayIndexOutOfBoundsException
 * 			数组越界异常
 * 			产生的原因：就是你访问了不存在的索引元素。
 * 
 * 		B:java.lang.NullPointerException
 * 			空指针异常
 * 			产生的原因：数组已经不指向堆内存的数据了，你还使用数组名去访问元素。
 * 
 * 为什么我们要记住这样的小问题呢?
 * 		编程不仅仅是把代码写出来，还得在出现问题的时候能够快速的解决问题。
 */
public class ArrayQuestion {
	public static void main(String[] args) {
		// 定义数组
		//静态初始化
		int[] arr = { 1, 2, 3 };
		
		//问题1：数组越界
		//System.out.println(arr[3]);
		
		//问题2：数组空指针异常
		//引用类型：类,接口,数组
		//常量：空常量 null，是可以赋值给引用类型的
		//arr = null;
		
		//正确输出
		System.out.println(arr[1]);
	}
}