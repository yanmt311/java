package com.mt;

import java.util.Scanner;
/*
 *��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *		(1)��������int[] arr = {5,7,3,2,5};
 *		(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *		(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 *
 *������
 *		A:��������int[] arr = {5,7,3,2,5};
 *		B:Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *		C:����һ����������Ԫ�ص�һ�γ���λ�õķ���
 *			�������飬��ȡ��ÿһ��Ԫ�أ����бȽϣ������ȣ���ֱ�ӰѸô����������ء�
 *		D:���÷�����������
 */

public class IndexChaZhao {
	public static void main(String[] args) {
		// ��������int[] arr = {5,7,3,2,5};
		int[] arr = { 5, 7, 3, 2, 5 };

		//Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Ҫ���ҵ�Ԫ�أ�");
		int number = sc.nextInt();
		
		//����һ����������Ԫ�ص�һ�γ���λ�õķ���
		//���÷���
		int index =getIndex(arr, number);
		System.out.println("index:"+index);
	}
	
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		//�������飬��ȡ��ÿһ��Ԫ�أ����бȽϣ������ȣ���ֱ�ӰѸô����������ء�
		/*
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				return x;
			}
		}
		
		return -1;//(arr[x] != value)
		*/
		
		
		int index = -1;
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		return index;
	}
}