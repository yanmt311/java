package com.mt;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
 * 90-100	����
 * 80-90	��
 * 70-80	��
 * 60-70	����
 * 60���� 	������
 * 
 * ������
 * 		A:����¼��ѧ�����Գɼ�
 * 			������
 * 		B:ͨ���򵥵ķ��������Ǿ�������if����ʽ3��ʵ��
 * 
 * ����һ��Ҫ������ȫ�ˡ�
 * 		��ȫ����
 * 		�߽�����
 * 		��������
 */
public class IfTest2 {
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
		
		//���Ƿ��ֳ��򲻹�����,����������ݵ��ж�
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