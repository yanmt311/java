package com.mt;

import java.util.Random;

/*
 * Random:���ڲ��������
 * 
 * ʹ�ò��裺
 * 		A:����
 * 			import java.util.Random
 * 		B:��������
 * 			Random r = new Random();
 * 		C:��ȡ�����
 * 			int number = r.nextInt(10);
 * 			��ȡ����0-10֮��������������0��������10
 */

//������λ�ȡ��һ��1-100֮����������?
public class RandomDemo {
	public static void main(String[] args) {
		
		// ��������
		Random r = new Random();
		
		//��ȡ10�������
		for (int x = 0; x < 10; x++) {
			
			// ��ȡһ�������
			int number = r.nextInt(10);
			// ��������
			System.out.println("number:" + number);
			
		}
		
		System.out.println("--------------------");

		
		// ��λ�ȡ��һ��1-100֮����������?
		//��ȡ�����
		int i = r.nextInt(100) + 1;//int i = r.nextInt(100)��ȡ[0,99)������
		
		//��������
		System.out.println("i:" + i);
	}
}