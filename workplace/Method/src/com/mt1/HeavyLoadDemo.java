package com.mt1;
/*
 * �������أ���ͬһ�����У������˷�������ͬ�ķ���������Ƿ������ء�
 * 
 * ���������ص㣺
 * 		��������ͬ�������б�ͬ���뷵��ֵ�����޹ء�
 * 		�����б�ͬ��
 * 			�����ĸ�����ͬ��
 * 			������Ӧ�����Ͳ�ͬ��
 * ע�⣺
 * 		�ڵ��÷�����ʱ��java�������ͨ�������б�Ĳ�ͬ������ͬ���ķ�����
 */
public class HeavyLoadDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// �����������
		int result = sum(a, b);
		System.out.println("result:" + result);

		int c = 30;
		// �����������
		int result2 = sum2(a,b,c);
		System.out.println("result2:"+result2);
		
		result = sum(a,b,c);
		System.out.println("result:"+result);
	}
	
	
	//����float���͵��������
	public static float sum(float a,float b) {
		return a + b;
	}
	
	// �������������
	public static int sum(int a, int b) {
		return a + b;
	}
		
	// �������������
	
	public static int sum2(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
}