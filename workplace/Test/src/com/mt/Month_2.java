package com.mt;

import java.util.Scanner;

/*
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 * 		һ�����ļ�
 * 		3,4,5	����
 * 		6,7,8	�ļ�
 * 		9,10,11	�＾
 * 		12,1,2	����
 * 
 * ������
 * 		A:����¼��һ���·�,��Scannerʵ��
 * 		B:�жϸ��·��Ǽ��£������·������Ӧ�ļ���
 * 			if
 * 			switch
 * 
 * case��͸��û��breakʱ�ɰ�˳�������һ�����
 */
public class Month_2 {
	public static void main(String[] args) {
		// ����¼��һ���·�,��Scannerʵ��
		Scanner sc = new Scanner(System.in);
		
		// ��������
		System.out.println("�������·�(1-12)��");
		int month = sc.nextInt();
		
		//����һ��
		// ��switch���ʵ��
		/*
		switch (month) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.out.println("�ļ�");
			break;
		case 7:
			System.out.println("�ļ�");
			break;
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
			System.out.println("�＾");
			break;
		case 10:
			System.out.println("�＾");
			break;
		case 11:
			System.out.println("�＾");
			break;
		case 12:
			System.out.println("����");
			break;
		default:
			System.out.println("��������·�����");
			break;
		}
		*/
		
		//��������
		//case ��͸��ֱ������break����������
		/*
		switch(month) {
		case 1:
			System.out.println("hello");
			//break;
		case 2:
			System.out.println("world");
			break;
		default:
			System.out.println("over");
			break;
		}
		*/
		
		//ͨ��case��͸����Ľ�����
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		default:
			System.out.println("��������·�����");
			break;
		}
	}
}