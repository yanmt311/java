package com.mt;

/*
 * ����дһ���������ڿ���̨���10��HelloWorld������
 * 
 * �����ʽ��
 * 		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
 * 			������;
 * 			return ����ֵ;
 * 		}
 * ��ʽ���ͣ�
 * 		A:���η�:Ŀǰ��ס public static
 * 		B:����ֵ����: �����޶�����ֵ����������
 * 		C:������:һ�����֣�Ϊ�˷������ǵ��÷���
 * 		D:��������: ���ڽ��յ��÷���ʱ��������ݵ�����
 * 		E:������:  ���ڽ��յ��÷���ʱ��������ݵı���
 * 		F:������: ��ɹ��ܵĴ���
 * 		G:return: �����������ѷ���ֵ����������
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б��޲���
 * 
 * ���һ������û����ȷ�ķ���ֵ���ͣ�java�ṩ��void�������Ρ�
 * 
 * void���εķ����ĵ��ã�ֻ��ʹ�õ�������
 */
public class VoidMethodDemo {
	
	//���ú���
	//�ڿ���̨���10��HelloWorld������
	public static void printHelloWorld() {
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}
	}
	
	//������
	public static void main(String[] args) {
		//��������
		printHelloWorld();
		
		//�������------����
		//System.out.println(printHelloWorld());
		//System.out.println(void);
		
		//��ֵ����------����
		//void v = printHelloWorld();
	}
}