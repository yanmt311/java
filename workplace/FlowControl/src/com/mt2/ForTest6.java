package com.mt2;
/*
 * ����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
 * 
 * ������
 * 		A:����ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:��ȡ��λ������forѭ��ʵ��
 * 		C:��ȡ��λ���ĸ�λ��ʮλ����λ
 * 		D:�ж������λ���Ƿ���ˮ�ɻ���������ǣ�ͳ�Ʊ���++
 * 		E:���ͳ�ƽ��
 */
public class ForTest6 {
	public static void main(String[] args) {
		
		//����ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;
		
		//��ȡ��λ������forѭ��ʵ��
		for(int x=100; x<1000; x++) {
			
			//��ȡ��λ���ĸ�λ��ʮλ����λ
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//�ж������λ���Ƿ���ˮ�ɻ���������ǣ�ͳ�Ʊ���++
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				count++;
			}
		}
		
		//���ͳ�ƽ��
		System.out.println("ˮ�ɻ������У�"+count+"��");
	}
}