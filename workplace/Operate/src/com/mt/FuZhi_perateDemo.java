package com.mt;
/*
 * 2����ֵ�����
 * 			A:�����ĸ�ֵ�������=
 * 			B:��չ�ĸ�ֵ�������+=��-=��*=��/=��....
 */

//��ֵ�����
public class FuZhi_perateDemo {
	public static void main(String[] args) {
		//�������
		int a = 10;
		
		//+=:�ǽ�+=��ߺ��ұߵ�������+��Ȼ�󽫽�������
		a += 20;//a = a + 20;
		System.out.println("a��" + a);
		
		//ע�⣺��չ�ĸ�ֵ�������������ǿ������ת��
		//��һ������a��a+=10��
		//�൱�ڣ� a = ��a���������ͣ���a + 10����
		short s = 1;
		s += 1;
		System.out.println("s��" + s);
	}	
}