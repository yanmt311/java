package com.mt;

/*
 * �ֻ���Ĳ�����
 */
public class PhoneDemo_02 {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		
		//�����Ա����ֵ
		System.out.println("Ʒ�ƣ�"+p.brand);//null
		System.out.println("�۸�"+p.price);//0
		System.out.println("��ɫ��"+p.color);//null
		System.out.println("------------");
		
		//����Ա������ֵ
		p.brand = "����";
		p.price = 2999;
		p.color = "��ɫ";
		
		//�ٴ������Ա����ֵ
		System.out.println("Ʒ�ƣ�"+p.brand);//����
		System.out.println("�۸�"+p.price);//2999
		System.out.println("��ɫ��"+p.color);//��ɫ
		System.out.println("------------");
		
		//���ó�Ա����
		p.call("����ϼ");
		p.sendMessage();
	}
}