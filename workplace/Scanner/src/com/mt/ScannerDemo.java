package com.mt;

//����
import java.util.Scanner;

/*
* Ϊ����߳��������ԣ����ǽ����ݸ�Ϊ����¼��
* ʵ�ּ���¼������ֻ��ʹ��JDK�ṩ��Scanner
* ʹ��Scanner��ȡ����¼�����ݵĲ���Ϊ��
* 	A������
* 		import java.util.Scanner;
* 		��һ������˳��Ϊ��package > import > class
* 	B:��������¼�����
* 		Scanner sc = new Scanner(System.in);
* 	C:��������
* 		int i = sc.nextInt();
*/

public class ScannerDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������һ�����ݣ�");
		int i = sc.nextInt();
		
		//������
		System.out.println("i:"+i);
	}
}