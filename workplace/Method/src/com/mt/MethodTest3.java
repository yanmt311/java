package com.mt;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������е����ֵ
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�int
 * 		�����б�int a,int b,int c
 */
public class MethodTest3 {
	
	//���ú���
	// �����������е����ֵ
	public static int getMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	//������
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		System.out.println("��������������ݣ�");
		int c = sc.nextInt();
		
		//���÷���
		int max = getMax(a,b,c);
		
		//������
		System.out.println("max:"+max);
	}
}