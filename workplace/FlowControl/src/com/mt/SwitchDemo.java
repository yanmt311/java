package com.mt;

import java.util.Scanner;

/*
 * switch����ʽ��
 * 		case ֵ1;
 * 			�����1;
 * 			break;
 * 		case ֵ2;
 * 			�����2;
 * 			break;
 * 		...
 * 		default:
 * 			�����n+1;
 * 			break;
 * 
 * ��ʽ���ͣ�
 * 	���ʽ��ȡֵ��byte,short,int,char
 * 			JDK5�Ժ������ö��
 * 			JDK7�Ժ������String���ַ�����
 * 	case�����ֵ��Ҫ�ͱ��ʽ����ƥ���ֵ
 *  ����岿�ֿ�����һ����������
 *  break��ʾ�жϣ���������˼�����Խ���switch���
 *  default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
 *  
 *  ִ�����̣�
 *  	A: ���ȼ�������ʽ��ֵ
 *  	B����case���αȽϣ�һ���ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬��ִ�еĹ����У�����break�ͻ������
 *  	C��������е�case���ͱ��ʽ��ֵ��ƥ�䣬�ͻ�ִ��default����岿��n+1��Ȼ������������
 *  
 */

//���ݼ���¼�����ֵ1��2��3��4��5��6��7�����Ӧ������һ�����ڶ�����������...��������
public class SwitchDemo {
	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������һ������(1-7):");
		int weekday = sc.nextInt();
		
		switch(weekday){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("���������������");
			break;
		}
	}
}
