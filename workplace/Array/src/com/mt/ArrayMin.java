package com.mt;

public class ArrayMin {
	public static void main(String[] args) {
		//��������
		int[] arr = {1,2,3,4,5};
		
		//���ò�����
		int min = arr[0];
		
		//��������0���⡣��ȡ��Сֵ
		for(int i = 1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		//�����Сֵ
		System.out.println("������Сֵ:"+min);
	}
}
