package com.mt;
/*
 * 3����ϵ�����
 * 			==��!=,>=,>,<=,<
 * 			��ϵ������Ľ��Ϊboolean����
 * 			ע�����ǧ��Ҫ��==д��=
 */


//��ϵ�����
public class GuanXi_OperateDemo {
	public static void main(String[] args) {
		//�������
		int a = 10;
		int b = 20;
		int c = 10;
		//==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-------------");
		//!=
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-------------");
		//>=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-------------");
		//ע������
		System.out.println(a = b);//��b��ֵ����a��Ȼ��a���
		System.out.println(a == c);
		System.out.println("-------------");
	}
}