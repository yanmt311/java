package com.mt;

/*
 * ���������ȡ��ֵ(��ȡ�����е����ֵ)
 */

public class ArrayMax {
	public static void main(String[] args) {
		//��������
		int[] arr = {12,98,45,73,60};
		
		//���������
		int max = arr[0];
		
		//�������飬��ȡ����0���������Ԫ�أ����бȽ�
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("�����е����ֵ�ǣ�"+max);
	}
}