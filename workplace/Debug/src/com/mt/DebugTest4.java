package com.mt;
/*
 * �����Ĳ������������ͣ�
 * 		��ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */
public class DebugTest4 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 1, 2, 3, 4, 5 };
		// ��������
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("----------------------------");
		
		change(arr);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	
	
	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			// ���Ԫ����ż����ֵ�ͱ�Ϊ��ǰ��2��
			if (arr[x] % 2 == 0) {
				arr[x] *= 2;
			}
		}
	}
	
}