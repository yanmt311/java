package com.mt;

import java.util.Scanner;

/*
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * 		 ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ����4��ѡ�ֵ�ƽ��ֵ��
 * 		 ��д����ʵ�֡�(������С������)
 * 
 * ������
 * 		A:����һ������Ϊ6�����顣
 * 		B:ͨ������¼��ķ�ʽ������ί�ķ���
 * 		C:д����ʵ�ֻ�ȡ�����е����ֵ����Сֵ
 * 		D:д����ʵ������Ԫ�ص����
 * 		E:ƽ���֣� (��-��߷�-��ͷ�)/(arr.length-2)
 * 		F:�����������
 */
public class AverageScore  {
	public static void main(String[] args) {
		//����һ������Ϊ6������
		int[] arr = new int[6];
		
		//ͨ������¼��ķ�ʽ������ί�ķ���
		//��������
		Scanner sc = new Scanner(System.in);
		
		//�������ݣ���forѭ����ֱ�ӵõ�6����ί�ķ���
		for(int x=0; x<arr.length; x++) {
			// arr[x] = sc.nextInt();
			System.out.println("�������"+(x+1)+"����ί�ķ���(0-100)��");
			int number = sc.nextInt();
			arr[x] = number;
		}
		
		//д����ʵ�ֻ�ȡ�����е����ֵ����Сֵ
		int max = getMax(arr);
		int min = getMin(arr);
		
		//д����ʵ������Ԫ�ص����
		int sum = sum(arr);
		
		// (��-��߷�-��ͷ�)/(arr.length-2)
		int avg = (sum-max-min)/(arr.length-2);
		
		//�����������
		System.out.println("��ѡ�ֵ����յ÷��ǣ�"+avg);
	}
	
	//�����е����ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
	
	//�����е���Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		return min;
	}
	
	//����Ԫ�����
	public static int sum(int[] arr) {
		int sum = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
		
		return sum;
	}
	
}