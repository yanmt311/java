package com.mt;

import java.util.Scanner;

/*
 * ���󣺿������ĵ�������
 * 
 * �з������õ�ʱ��Ҫ�뿴�����������̣�ÿ��������Ҫ�Ӷϵ㣬���鷽������ĵ�һ����Ч���Ӷϵ�
 */
public class DebugTest2 {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		// ���÷���
		int result = sum(a, b);

		// ������
		System.out.println("result:" + result);
	}

	// ��ͷ���
	public static int sum(int a, int b) {
		return a + b;
	}
}