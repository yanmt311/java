package com.mt3;
/*
 * continue:��������˼
 * ʹ�ó�����
 * 		ѭ����
 * ע�⣺
 * 		�뿪ʹ�ó�����û�������
 * ���ã�
 * 		����һ��ѭ����������һ�ε�ѭ��
 * ����
 * 		break:�˳�ѭ��
 */
public class ContinueDemo1 {
	public static void main(String[] args) {
		//continue;
		for(int x=1; x<=10; x++) {
			//x==3ʱ��������ѭ��������3֮�⣬�ܹ�9��
			if(x == 3) {
				continue;
			}
			System.out.println("HelloWorld");
		}
	}
}