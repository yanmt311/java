package com.mt;
/*
 * ���������������ݣ���ȡ�������ֵ
 */

//����
import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		System.out.println("��������������ݣ�");
		int c = sc.nextInt();
		
		//��ȡ���е����ֵ���Ȼ�ȡ�������ݵ����ֵ���ڵõ�����������
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		
		//������ֵ
		System.out.println("max:"+max);
	}
}
