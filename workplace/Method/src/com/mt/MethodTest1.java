package com.mt;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������еĽϴ�ֵ
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�int
 * 		�����б�int a,int b
 */
public class MethodTest1 {
	
	//���ú���
	// �����������еĽϴ�ֵ
	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	//������
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		//���÷���
		int max = getMax(x,y);
		System.out.println("max:"+max);
	}
}
