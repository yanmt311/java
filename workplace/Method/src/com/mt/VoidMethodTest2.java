package com.mt;
/*
 * дһ�������������е�ˮ�ɻ�����ӡ�ڿ���̨
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б��޲���
 */
public class VoidMethodTest2 {
	
	//���ú���
	//�����е�ˮ�ɻ�����ӡ�ڿ���̨
	public static void printFlower() {
		
		//ˮ�ɻ���
		//ȷ����Χ
		for(int x=100; x<1000; x++) {
			//�����λ��ʮλ����λ
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//�����������ݽ���ƥ��
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
				//���ƥ�䣬��Ϊˮ�ɻ���
				System.out.println(x);
			}
		}
		
	}
	
	//������
	public static void main(String[] args) {
		//���÷���
		printFlower();
	}
}