package com.mt;
/*
 * 5����Ԫ�����
 * 			��ʽ����ϵ���ʽ�����ʽ1�����ʽ2
 * 				A�������ϵ���ʽ��ֵ������true����false
 * 				B�������true�����ʽ1���ǽ��
 * 				      �����false�����ʽ2���ǽ��
 */

//��Ŀ�����
public class SanMu_OperateDemo {
	public static void main(String[] args) {
		//�������
		int a = 10;
		int b = 20;
		
		int c = (a>b)?a:b; 
		System.out.println("c��" + c);
	}
}