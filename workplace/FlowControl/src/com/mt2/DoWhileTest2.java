package com.mt2;
/*
 * ͳ��ˮ�ɻ�����
 * 	
 * ������
 * 		A����ʼ��ͳ����Ϊ0��
 * 		B��ȷ����Χ100-999��
 * 		C�����λ��ʮλ����λ��
 * 		D���������������ƥ�䣬�����
 * 		E�����ͳ�ƽ��
 */
public class DoWhileTest2 {
	public static void main(String[] args) {
		//��ʼ��ͳ�Ʊ���
		int count = 0;
		
		//ѭ�������
		//ȷ����Χ
		int i = 100;
		do{
			//���λ��ʮλ����λ
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			//ƥ��
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i){
				count++;
			}
			
			//�������
			i++;
			
		}while(i<=999);
		
		//���ͳ�ƽ��
		System.out.println("ˮ�ɻ�����:"+count+"��");
	}
}

