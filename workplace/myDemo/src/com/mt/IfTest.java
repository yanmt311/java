package com.mt;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������ѧ���Ŀ��Գɼ���");
		int score = sc.nextInt();
		
		//if����ʽ3
		/*
		if(score>=90 && score<=100){
			System.out.println("��ĳɼ���������");
		}else if(score>=80 && score<90){
			System.out.println("��ĳɼ����ں�");
		}else if(score>=70 && score<80){
			System.out.println("��ĳɼ�������");
		}else if(score>=60 && score<70){
			System.out.println("��ĳɼ����ڼ���");
		}else {
			System.out.println("��ĳɼ����ڲ�����");
		}
		*/
		
		//���Ƿ��ֳ��򲻹���׳,����������ݵ��ж�
		if(score<0 || score>100){
			System.out.println("��ĳɼ��Ǵ����");
		}else if(score>=90 && score<=100){
			System.out.println("��ĳɼ���������");
		}else if(score>=80 && score<90){
			System.out.println("��ĳɼ����ں�");
		}else if(score>=70 && score<80){
			System.out.println("��ĳɼ�������");
		}else if(score>=60 && score<70){
			System.out.println("��ĳɼ����ڼ���");
		}else {
			System.out.println("��ĳɼ����ڲ�����");
		}
	}
}