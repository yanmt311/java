package com.mt;
/*
 * ��������С���⣺
 * 
 * 		A:java.lang.ArrayIndexOutOfBoundsException
 * 			����Խ���쳣
 * 			������ԭ�򣺾���������˲����ڵ�����Ԫ�ء�
 * 
 * 		B:java.lang.NullPointerException
 * 			��ָ���쳣
 * 			������ԭ�������Ѿ���ָ����ڴ�������ˣ��㻹ʹ��������ȥ����Ԫ�ء�
 * 
 * Ϊʲô����Ҫ��ס������С������?
 * 		��̲������ǰѴ���д�����������ڳ��������ʱ���ܹ����ٵĽ�����⡣
 */
public class ArrayQuestion {
	public static void main(String[] args) {
		// ��������
		//��̬��ʼ��
		int[] arr = { 1, 2, 3 };
		
		//����1������Խ��
		//System.out.println(arr[3]);
		
		//����2�������ָ���쳣
		//�������ͣ���,�ӿ�,����
		//�������ճ��� null���ǿ��Ը�ֵ���������͵�
		//arr = null;
		
		//��ȷ���
		System.out.println(arr[1]);
	}
}