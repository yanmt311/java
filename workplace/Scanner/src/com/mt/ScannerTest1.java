package com.mt;

//����
import java.util.Scanner;

/*
* ���������������ݣ�������������
*/
public class ScannerTest1 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//�������
		int sum = a + b;
		
		//������
		System.out.println("sum:"+sum);
	}
}