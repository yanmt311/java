package com.mt1;
/*
 * ��ά�������
 * 
 * System.out.println():������ݲ�����
 * System.out.print():������ݲ�����
 * 
 */
public class TwoArrayTest1 {
	public static void main(String[] args) {
		// �����ά����
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		/*
		//����һ��ԭʼ������
		//��һ��һά�����Ԫ��
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		//�ڶ���һά�����Ԫ��
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
				
		//������һά�����Ԫ��
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);	
		
		System.out.println("----------------------------");
		*/
		
		
		/*
		//������������ÿһ��arr[0][x],�����ά�����еĵ�һ��һά���飬����forѭ���Ľ�
		//��ά�����е�һά�������ƣ���ά������[����]
		//arr[0] ��ʵ���Ƕ�ά�����еĵ�һ��һά���������
		//arr[1] ��ʵ���Ƕ�ά�����еĵڶ���һά���������
		//arr[2] ��ʵ���Ƕ�ά�����еĵ�����һά���������
	
		//forѭ���Ľ���һ��
		// ��һ��һά�����Ԫ��
		for (int x = 0; x < arr[0].length; x++) {
			System.out.print(arr[0][x] + "  ");
		}
		System.out.println();

		// �ڶ���һά�����Ԫ��
		for (int x = 0; x < arr[1].length; x++) {
			System.out.print(arr[1][x] + "  ");
		}
		System.out.println();

		// ������һά�����Ԫ��
		for (int x = 0; x < arr[2].length; x++) {
			System.out.print(arr[2][x] + "  ");
		}
		System.out.println();
		
		System.out.println("--------------------------------");
		*/
		
		/*
		//����������������forѭ��ֻ��һ����ͬ�������һ����forѭ���Ľ���
		//       ����3�����״Ӷ�ά�����е�֪��һά���������һά����ϴ�ʱ���׵õ�
		for(int y=0; y<3; y++) {
			for (int x = 0; x < arr[y].length; x++) {
				System.out.print(arr[y][x] + "  ");
			}
			System.out.println();
		}			
		System.out.println("-----------------------------------");
		*/
		
		
		//�����ģ� ��ά���顢һά����ĳ��Ⱦ��ø�ʽ��
		//                     ������.length������
		for(int i=0; i<arr.length;i++) {
			for (int x = 0; x < arr[i].length; x++) {
				System.out.print(arr[i][x] + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		//���ֲ�ͬ�����
		System.out.println("hello");//����
		System.out.println("world");//����
		System.out.print("hello");//������
		System.out.print("world");//������
	}
}
