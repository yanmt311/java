package com.mt;
/*
 * ��ϰ2�� ��ȡ���������е����ֵ
 */

public class SanMu_Test2 {
	public static void main(String[] args) {
		//������������
		int a = 10;
		int b = 30;
		int c = 20;
		
		//�Ȼ�ȡ�����������ֵ���ٺ͵����������бȽ�
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;		
		System.out.println("max:"+max);
	}
}
