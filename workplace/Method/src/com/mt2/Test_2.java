package com.mt2;
/*
 * ���󣺰ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 */
public class Test_2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 34, 67, 10, 28, 59 };
		
		//��ȡ�����е����ֵ
		// //���������
		// int max = arr[0];
		// //���������αȽϣ����������
		// for(int x=1; x<arr.length; x++) {
		// 		if(arr[x] > max) {
		// 			max = arr[x];
		// 		}
		// }
		
		//�÷����Ľ�
		int max = getMax(arr);
		System.out.println("max:"+max);
		
		//��ȡ�����е���Сֵ���÷���ʵ��
		int min = getMin(arr);
		System.out.println("min:"+min);
		
	}
	
	//��ȡ�����е���Сֵ�ķ���
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		return min;
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
}