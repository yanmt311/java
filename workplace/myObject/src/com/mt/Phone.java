package com.mt;

/*
 * �ֻ��ࣺ
 * 		��Ա������Ʒ�ƣ��۸���ɫ...
 * 		��Ա��������绰��������...
 */
public class Phone {
	//Ʒ��
	String brand;
	//�۸�
	int price;
	//��ɫ
	String color;
	
	//��绰
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
	
	//������
	public void sendMessage() {
		System.out.println("Ⱥ������");
	}
}