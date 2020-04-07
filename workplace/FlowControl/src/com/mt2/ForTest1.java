package com.mt2;

/*
 * 需求：获取数据1-5和5-1
 */

public class ForTest1 {
	public static void main(String[] args) {
		//获取1-5的数据
		//原始做法
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("-------------");
		
		//用循环改进
		for(int x=1; x<=5; x++) {
			System.out.println(x);
		}
		System.out.println("-------------");
		
		//获取5-1的数据
		for(int x=5; x>=1; x--){
			System.out.println(x);
		}
	}
}