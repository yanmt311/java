package com.mt2;
/*do...while ��ʽ��
 * 
 * 		��ʼ�����;
 * 		do {
 * 			ѭ�������;
 * 			�����������;
 * 		}while(�ж��������);
 * 1-100��Ͱ���
 * ������
 * 		A����ʼ����ͱ���
 * 		B��ȷ����ͷ�Χ1-100��do...whileѭ��
 * 		C�������ͽ��
 */
public class DoWhileTest1 {
	public static void main(String[] args) {
		//��ʼ����ͱ���
		int sum = 0;
		
		//ȷ����ͱ���
		int i = 1;
		do{
			sum += i;
			i++;
		}while(i<=100);
		
		//�����ͽ��
		System.out.println("1-100��ͣ�"+sum);
	}
}
