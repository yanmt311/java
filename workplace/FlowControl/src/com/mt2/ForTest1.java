package com.mt2;

/*
 * ���󣺻�ȡ����1-5��5-1
 */

public class ForTest1 {
	public static void main(String[] args) {
		//��ȡ1-5������
		//ԭʼ����
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("-------------");
		
		//��ѭ���Ľ�
		for(int x=1; x<=5; x++) {
			System.out.println(x);
		}
		System.out.println("-------------");
		
		//��ȡ5-1������
		for(int x=5; x>=1; x--){
			System.out.println(x);
		}
	}
}