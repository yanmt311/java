package com.mt;

/*
 * if��������ָ�ʽ
 * 
 * 	if����ʽ1��
 * 		if(��ϵ���ʽ){
 * 			�����;
 * 		}
 * 	ִ�����̣�
 * 		A�����ȼ����ϵ���ʽ��ֵ������true����false
 * 		B�������true����ִ������壻
 * 		C�������false���Ͳ�ִ�������
 */

public class IfDemo1 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//������������
		int a = 10;
		int b = 20;
		int c = 10;
		
		if(a == b){
			System.out.println("a����b");
		}
		
		if(a == c){
			System.out.println("a����c");
		}
		
		System.out.println("����");
	}
}

