package com.mt;
/*
 * �����:���ڶԳ����ͱ������в����������
 * 
 * ���ʽ������������������ķ���java�﷨��ʽ�ӡ�
 * 		��ͬ����������������ı��ʽ�ǲ�ͬ���͵ı��ʽ
 * ������ࣺ
 * 		1�����������
 * 			A���������㣺+��-��*��/��%��++��--
 * 				%�����ڻ�ȡ�����������ʱ������
 * 				/�����ڻ�ȡ�����������ʱ����
 * 			B:�ַ��������㣺�����ַ��ڼ�����д洢������ֵ����������
 * 				'A' 65		'a' 97		'0' 48
 * 			C���ַ�������ӷ����㣺��ʵ���Ĳ��Ǽӷ����㣬�����ַ�����ƴ��
 * 			D��++��--�������Լ������ڶԱ�����1���߼�1
 * 				a:����ʹ�õ�ʱ��++����--���ڱ�����ǰ����ߺ��棬�����һ��
 * 				b����������������ʱ��
 * 					++��--�ں��棬���ñ�����������������++��--
 * 					++��--��ǰ�棬������++��--�����ñ�����������
 */

//���������
public class SuanShu_OperateDemo {
	public static void main(String[] args) {
		//�������
		int a = 3;
		int b = 4;
		char c = 'A';
		//����������Ļ���ʹ��
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		//ע�ͣ��������ֻ�ܵõ�������Ҫ��õ�С�������븡������������
		System.out.println(3.0 / 4);
		System.out.println(b / a);//��
		System.out.println(b % a);
		//�ַ�������������
		System.out.println(c + a);
		//�ַ���������������
		System.out.println("hello" + a);//ƴ��
		System.out.println("hello" + a + b);//ƴ��
		System.out.println(a + b + "hello");//�ȼ���ƴ��
		
		//����ʹ��
		int d = 10;
		System.out.println("d��" + d);
		d++;
		//++d;
		System.out.println("d��" + d);
		
		//������������ʱ������
		int e = 10;
		//int f = e++;
		int h = ++e;
		//System.out.println("f��" + f);
		System.out.println("h��" + h);
	}
}
