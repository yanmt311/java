package com.mt;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//����if����ʽ2ʵ��
		/*
		if(a>b){
			System.out.println("�ϴ��ֵ�ǣ�"+a);
		}else {
			System.out.println("�ϴ��ֵ�ǣ�"+b);
		}
		*/
		
		//�õ��ϴ��ֵ֮����δ����ֱ��������������Ƕ��������������ϴ��ֵ
		int max;
		if(a>b){
			max = a;
		}else {
			max = b;
		}
		//�����������Ĳ���
		//max += 100;
		System.out.println("�ϴ��ֵ�ǣ�"+max);
	}
}
