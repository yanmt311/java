package com.mt;

/*
 * Student��һ��ѧ�����������࣬main�������ʺϷ��������档
 * 
 * ʹ��һ���࣬��ʵ����ʹ�ø���ĳ�Ա��(��Ա�����ͳ�Ա����)
 * ������Ҫ��ʹ��һ����ĳ�Ա���ͱ�������ӵ�и���Ķ���
 * �������ӵ��һ����Ķ�����?
 * 		��������Ϳ�����?
 * ������δ���������?
 * 		��ʽ������ ������ = new ����();
 * ������η��ʳ�Ա��?
 * 		��Ա������������.������
 * 		��Ա������������.������(...)
 */
public class StudentDemo_02 {
	public static void main(String[] args) {
		//��ʽ������ ������ = new ����();
		Student s = new Student();
		//System.out.println("s:"+s); //com.itheima_02.Student@193c0cf
		
		//ֱ�������Ա����ֵ
		System.out.println("������"+s.name); //null
		System.out.println("���䣺"+s.age); //0
		System.out.println("----------");
		
		//����Ա������ֵ
		s.name = "����ϼ";
		s.age = 28;
		
		//�ٴ������Ա������ֵ
		System.out.println("������"+s.name); //����ϼ
		System.out.println("���䣺"+s.age); //28
		System.out.println("----------");
		
		//���ó�Ա����
		s.study();
		s.eat();
	}
}