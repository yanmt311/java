package com.mt;
/*
 * ���󣺿�ѭ����ִ������(1-5��Ͱ���)
 */
public class DebugTest1 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;

		// ѭ����ȡÿһ������
		for (int x = 1; x <= 5; x++) {
			sum += x;
		}

		System.out.println("sum:" + sum);
	}
}