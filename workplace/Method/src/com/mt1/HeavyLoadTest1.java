package com.mt1;
/*
 * ���󣺱Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�
 *       ����main�����н��в���
 */
public class HeavyLoadTest1 {
	
	// ���ú���
	// ����byte����
	public static boolean compare(byte a, byte b) {
		System.out.println("byte---");
		// ��һ��д��
		// boolean flag = a==b?true:false;
		// return flag;
		// �ڶ���д��
		// boolean flag = a == b;
		// return flag;
		// ������д��
		return a == b;
	}

	// ����short����
	public static boolean compare(short a, short b) {
		System.out.println("short---");
		return a == b;
	}

	// ����int����
	public static boolean compare(int a, int b) {
		System.out.println("int---");
		return a == b;
	}

	// ����long����
	public static boolean compare(long a, long b) {
		System.out.println("long---");
		return a == b;
	}
	
	// ������
	public static void main(String[] args) {
		// ���÷���
		//����
		System.out.println(compare(10, 20));
		System.out.println("-----------------------------------");
		//�ֽ�
		System.out.println(compare((byte)10, (byte)20));
		System.out.println("-----------------------------------");
		//������
		System.out.println(compare((short)10, (short)20));
		System.out.println("-----------------------------------");
		//������
		//System.out.println(compare((long)10, (long)20));
		System.out.println(compare(10L, 20L));
	}

	
}