package com.mt2;
/*
 * whileѭ�����Ļ�����ʽ��
 * 		while(�ж��������) {
 * 			ѭ�������;
 * 		}
 * 
 * ��չ��ʽ��
 * 		��ʼ�����;
 * 		while(�ж��������) {
 * 			ѭ�������;
 * 			�����������;
 * 		}
 * 
 * �ع�forѭ��������ʽ��
 * 		for(��ʼ�����;�ж��������;�����������) {
 * 			ѭ�������;
 * 		}
 */
public class WhileDemo1 {
	public static void main(String[] args) {
		//���10��HelloWorld
		/*
		for(int x=1; x<=10; x++) {	
			System.out.println("HellloWorld");
		}
		*/
		
		//whileѭ��ʵ��
		int x=1;
		while(x<=10) {
			System.out.println("HellloWorld");
			x++;
		}
	}
}