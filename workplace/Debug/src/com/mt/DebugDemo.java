package com.mt;
/*
 * 断点调试：
 * 		A:查看程序的执行流程
 * 		B:调试程序
 * 
 * 断点：
 * 		其实就是一个标记
 * 
 * 在哪里加呢?
 * 		想加哪里就加哪里，一般是加在我们看不懂的地方
 * 
 * 如何加呢?
 * 		在代码区域的最左边双击即可
 * 
 * 如何运行加断点的程序呢?
 * 		代码区域 -- 右键 -- Debug as -- Java Application
 * 		会弹出一个页面让我们选择是否进入debug模式，选择yes。
 * 
 * 如何让程序往下执行呢?
 * 		Step Over 执行下一步 
 * 		F6
 * 
 * 看那些区域呢?
 * 		代码区域：看程序的执行步骤
 * 		Debug区域：看程序的执行步骤
 * 		Variables：看变量的创建，赋值，销毁等
 * 		Console：看程序的输入和输出
 * 
 * 如何去除断点：
 * 		A:把加断点的动作再来一遍,双击
 * 		B:在debug视图中，找到Breakpoints，选中断点，点击双x即可
 */
public class DebugDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
}