package com.mt;
/*
 * if����ʽ2
 * 	
 * 		if(��ϵ���ʽ){
 * 			�����1;
 * 		}else{
 * 			�����2;
 * 		}
 * 		
 * ִ������
 * A:�����жϹ�ϵ���ʽ��������true����false
 * B:�����true��ִ�������1
 * C:�����false��ִ�������2
 */

public class IfDemo2 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		// �жϸ�������������������ż��
		// �������
		int a = 100;
		// ��a���¸�ֵ
		// a = 99;

		if (a % 2 == 0) {
			System.out.println("a��ż��");
		} else {
			System.out.println("a������");
		}
		
		System.out.println("����");
	}
}
