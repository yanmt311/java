package com.mt2;
/*
 * ����дһ�����������ڶ����������ͣ������÷�����
 */
public class Test_3 {
	public static void main(String[] args) {
		
		// ��������
		int[] arr = { 1, 2, 3, 4, 5 };
		
		// ������ͱ���
		// int sum = 0;
		// ��ȡ�����е�ÿһ��Ԫ��
		// for(int x=0; x<arr.length; x++) {
		// 		sum += arr[x];
		// }
		
		//�÷����Ľ�
		int sum = sum(arr);
		
		System.out.println("sum:"+sum);
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 */
	public static int sum(int[] arr) {
		int sum = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
		
		return sum;
	}
}