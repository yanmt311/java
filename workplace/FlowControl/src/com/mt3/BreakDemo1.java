package com.mt3;
/*
 * break:�жϵ���˼
 * ʹ�ó�����
 * 		A:switch�����,���ڽ�������
 * 		B:ѭ����
 * ע�⣺
 * 		�뿪ʹ�ó�����û������ġ����ܵ���ʹ��
 * ���ã�
 * 		����ѭ������ѭ����ǰ����
 */
public class BreakDemo1 {
	public static void main(String[] args) {
		//break;
		for(int x=1; x<=10; x++) {
			//x==3ʱ�ͽ���ѭ�������ܹ�2��
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
	}
}