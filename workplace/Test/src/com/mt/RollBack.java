package com.mt;

import java.util.Scanner;

/*
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 * 
 * ������
 * 		A:����һ������Ϊ5������
 * 		B:ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
 * 		C:���巽����arr�����е����ݷ�ת
 * 			ʲô�Ƿ�ת?��η�ת?
 * 		D:���巽���Է�ת���ݽ��б���
 * 
 * ע�⣺��������ʱ���������ͣ�����ֵ����һ������Ϊvoid
 */
public class RollBack {
	public static void main(String[] args) {
		// ����һ������Ϊ5������
		int[] arr = new int[5];

		// ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < arr.length; x++) {
			System.out.println("�������" + (x + 1) + "��Ԫ��");
			arr[x] = sc.nextInt();
		}
		
		System.out.println("��תǰ������Ԫ�أ�");
		printArray(arr);

		// ���巽����arr�����е����ݷ�ת
		// ����Ϊvoidʱ���õ������õķ���
		reverse(arr);
		
		System.out.println("��ת�������Ԫ�أ�");
		//���巽����������
		printArray(arr);
	}
	
	//��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length; x++){
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/*
	 * ������ȷ�� 
	 * 		����ֵ���ͣ�void ��ע�⣺��������ʱ���������ͣ�����ֵ����һ������Ϊvoid��
	 * 		�����б�int[] arr
	 */
	//reverse�Ƿ�ת����˼
	public static void reverse(int[] arr) {
		for(int startIndex=0,endIndex=arr.length-1;startIndex<=endIndex;startIndex++,endIndex--) {
			//�������н���
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
}