package com.mt;

import java.util.Scanner;

/*
 * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * 		 ÿλ���ֶ�����5,Ȼ�����10���������������,
 * 		 �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * 		 ��Ѽ��ܺ���������������̨
 * 
 * ������
 * 		A:����¼��һ����λ��
 * 			������4567	
 * 		B:�����ݽ��м���
 * 			a���������λ���ֳɸ���ʮ���٣�ǧ�洢��������
 * 				int[] arr = {4,5,6,7};
 * 						int ge = number%10;
 * 						int shi = number/10%10;��
 * 						int bai = number/10/10%10;
 * 						int qian = number/10/10/10%10;
 * 			b��ÿλ���ֶ�����5��
 * 				arr[x] += 5;	{9,10,11,12}
 * 			c��Ȼ�����10��������������֣�
 * 				arr[x] %= 10;	{9,0,1,2}
 * 			d���ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ������
 * 					{9,0,1,2}		{2,1,0,9}
 * 		C:������ܺ������
 * 				�������ܺ������
 */
public class Code {
	public static void main(String[] args) {
		//����¼��һ����λ��
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("������һ����λ����");
		int number = sc.nextInt();
		
		//�ֱ�õ������ݵ�ÿһ��λ�ϵ�����
		int ge = number%10;
		int shi = number/10%10;
		int bai = number/10/10%10;
		int qian = number/10/10/10%10;
		
		//����һ������
		int[] arr = new int[4];
		arr[0] = qian;
		arr[1] = bai;
		arr[2] = shi;
		arr[3] = ge;
		
		//���ܹ���
		//ÿλ���ֶ�����5,Ȼ�����10���������������
		for(int x=0; x<arr.length; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		
		//������ܺ������
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]);//������
		}
		System.out.println();//����
	}
}