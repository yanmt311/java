package com.mt2;
/*
 * ͳ��ˮ�ɻ�����
 * 	������
 * 		A:ȷ����Χ100-999����forѭ��
 * 		B:	���λ��153%10=
 * 			��ʮλ��153/10%10=
 * 			���λ��153/10/10%10=
 * 		C:����������,������ԭʼ������Ϊˮ�ɻ���
 * 		D:�����͵�����
 */
public class WhileTest2 {
	public static void main(String[] args) {
		//��ʼ��
		int count = 0;
		int i = 100;
		while (i<=999){
			
			//ѭ�������
			//��ȡ��λ��ʮλ����λ
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
				
			//��ÿ��λ�ϵ���������ӣ����͸����ݽ��бȽ�
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i) {
				count++;
			}
			
			//�������
			i++;
		}
		//ͳ���������
		System.out.println("ˮ�ɻ�����"+count+"��");
	}
}
