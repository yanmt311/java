package com.mt2;
/*
 * �����Ĳ����ǻ������͵�ʱ����ʽ�����ĸı䲻Ӱ��ʵ�ʲ�����
 * 			��ʽ���������ڽ���ʵ�����ݵı���
 *			ʵ�ʲ�����ʵ�ʲ�������ı���
 */
public class ArgumentsDemo {
	public static void main(String[] args) {
		// �������
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
	}
	
	//��ʽ�����ĸı�
	public static void change(int a, int b) { // a=10,b=20
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		a = b; // a=20;
		b = a + b;// b=40;
		System.out.println("a:" + a + ",b:" + b);// a:20,b:40
	}

}