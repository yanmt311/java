package com.mt;

//����
import java.util.Scanner;
/*
* ����¼���������ݣ��Ƚ������������Ƿ����
*/
public class ScannerTest2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//�Ƚ����������Ƿ����
		boolean flag = (a==b)?true:false;
//����	boolean flag = (a==b);
		
		//�������
		System.out.println("flag:"+flag);
	}
}