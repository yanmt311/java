package com.mt;
/*
 * 4���߼���������������ӹ�ϵ���ʽ
 * 			&,|,^,!
 * 			&&,||
 * 				A:&:��false��false
 * 				B:|����true��true
 * 				C:^����ͬ��false����ͬ��true��
 * 				D:����true��false��false��true
 * 				E:&&����&�����ͬ
 * 				F:||����|�����ͬ
 * 			&&��&����&&�ж�·Ч�������Ϊfalse���ұ߲�ִ�У�
 * 					  &���������ʲô���ұ߶���ִ��
 * 			||��|����||�ж�·Ч�������Ϊtrue���ұ߲�ִ�У�
 * 					  |���������ʲô���ұ߶���ִ��
 */


//�߼������
public class LuoJi_OperateDemo {
	public static void main(String[] args) {
		//�������
		int a = 3;
		int b = 4;
		int c = 5;
		//&
		System.out.println((a>b) & (a>c));//false & false
		System.out.println((a<b) & (a>c));//true & false
		System.out.println((a>b) & (a<c));//false & true
		System.out.println((a<b) & (a<c));//true & true
		System.out.println("--------------------");
		
		//|
		System.out.println((a>b) | (a>c));//false | false
		System.out.println((a<b) |  (a>c));//true | false
		System.out.println((a>b) | (a<c));//false | true
		System.out.println((a<b) | (a<c));//true | true
		System.out.println("-------------------");
		
		//^
		System.out.println((a>b) ^ (a>c));//false ^ false
		System.out.println((a<b) ^ (a>c));//true ^ false
		System.out.println((a>b) ^ (a<c));//false ^ true
		System.out.println((a<b) ^  (a<c));//true ^ true
		System.out.println("------------------");
		
		//!
		System.out.println((a>b));//false
		System.out.println(!(a>b));//true
		System.out.println(!!(a>b));//false
		
		//&&
		System.out.println((a>b) && (a>c));//false && false
		System.out.println((a<b) && (a>c));//true && false
		System.out.println((a>b) && (a<c));//false && true
		System.out.println((a<b) && (a<c));//true && true
		System.out.println("--------------------");
		
		//||
		System.out.println((a>b) || (a>c));//false || false
		System.out.println((a<b) ||  (a>c));//true ||false
		System.out.println((a>b) || (a<c));//false || true
		System.out.println((a<b) || (a<c));//true || true
		System.out.println("-------------------");
		
		//&&��&����
		//�������
		int x = 10;
		int y = 20;
		//System.out.println((x++ > 10) & (y++ > 10));//false & false = false
		//��x = 10,��x++�����ж�>10������&
		//System.out.println("x��" + x);//11
		//System.out.println("y��" + y);//21
  	System.out.println((x++ > 10) && (y++ > 10));//false & false = false
		System.out.println("x��" + x);//11
		System.out.println("y��" + y);//20
	}
}