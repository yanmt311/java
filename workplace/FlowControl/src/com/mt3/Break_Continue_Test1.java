package com.mt3;
/*
 * break����������ѭ��
 * continue����������ѭ����������һ��ѭ��
 */

//��Ҫ��������������֤
public class Break_Continue_Test1 {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			//3 6 9
			if (x % 3 == 0) {
				// �ֱ�дbreak��continue��˵˵�������
				//break;//���2�Σ�����1��2
				continue;//���7�Σ�����3��6��9
			}
			System.out.println("�Ұ�����ϼ");
		}
	}
}