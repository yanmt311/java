package com.mt2;
/*
 * do...whileѭ���Ļ�����ʽ��
 * 		do {
 * 			ѭ�������;
 * 		}while(�ж��������);
 * ��չ��ʽ��
 * 		��ʼ�����;
 * 		do {
 * 			ѭ�������;
 * 			�����������;
 * 		}while(�ж��������);
 * ִ�����̣�
 * 		A:ִ�г�ʼ�����;
 * 		B:ִ��ѭ�������;
 * 		C:ִ�п����������;
 * 		D:ִ���ж�������䣬����true����false
 * 			�����true���ص�B����
 * 			�����false���ͽ���
 */

//���10��HelloWorld
public class DoWhileDemo1 {
	public static void main(String[] args) {
		
		/*
		//forѭ��
		for(int i=1;i<=10;i++){
			System.out.println("HelloWorld");
		}
		*/
		
		//do...whileѭ�����
		int i=1;
		do{
			System.out.println("HelloWorld");
			i++;
		}while(i<=10);
	}
}

