package com.mt;
/*
 * �����������(������������е�ÿһ��Ԫ��)
 * ��ȡ������Ԫ�صĸ�����������.length
 */
public class ArrayBianLi {
	public static void main(String[] args) {
		
		// ��������
		int[] arr = { 11, 22, 33, 44, 55 };
		
		// ����һ��ԭʼ�������������
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------------");

		// ������: ��forѭ���Ľ���������Ҫ֪�������е�Ԫ�ظ�������������е�Ԫ�رȽ϶࣬�����׵�֪
		for (int x = 0; x < 5; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//������:A��������.length------------��ȡ����Ԫ�ظ���
		//		 B������forѭ��ʵ��������������е�Ԫ�ظ���
		
		//Ϊ�˽������ȥ��������Ԫ�ظ��������⣬������ṩ��һ�����ԣ�length
		//���ڻ�ȡ����ĳ���
		//��ʽ��
		//		������.length
		
		//ȷ��Ԫ�ظ���
		System.out.println("���鹲�У�"+arr.length+"��");
		System.out.println("--------------------");
	
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
}