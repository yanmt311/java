package com.mt;
/*
 * ����дһ������������һ������(����1)���ڿ���̨��ӡ1�������ݵ�ֵ��
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б�int n
 */

public class VoidMethodTest1 {
	
	//���ú���
	//�ڿ���̨��ӡ1��������n��ֵ
	public static void printNumber(int n) {
		//���1-n����
		for(int x=1; x<=n; x++) {
			System.out.println(x);
		}
	}
	
	//������
	public static void main(String[] args) {
		//�������÷���
		printNumber(10);
		System.out.println("-------------------");
		printNumber(100);
	}
}


