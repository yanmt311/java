package com.mt2;
/*
 * whileѭ��ʵ��1-100֮���������
 */
public class WhileTest1 {
	public static void main(String[] args) {
		
		//�ع�forѭ��ʵ��
		
		/*
		//������ͱ���
		int sum = 0;
		
		//��ȡ1-100֮�������
		for(int x=1; x<=100; x++) {
		
			//�ۼ����
			sum += x;
		}
		System.out.println("1-100�ĺ��ǣ�"+sum);
		*/
		
		//whileѭ��ʵ��
		//������ͱ���
		int sum = 0;
		int i = 1;
		while (i<=100){
			sum += i;
			i++;
		}
		System.out.println("1-100�ĺ��ǣ�"+sum);
	}
}
