package com.mt;

//����
import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ����
 *		ϵͳ����һ��1-100֮������������³���������Ƕ��١�
 * ������
 * 		A:ϵͳ����һ�������1-100֮��ġ�
 * 			int number = r.nextInt(100) + 1;
 * 		B:����¼������Ҫ�µ�����
 * 			��Scannerʵ��
 *		C:�Ƚ�����������(��if���)
 *			���ˣ�������ʾ����
 *			С�ˣ�������ʾС��
 *			�����ˣ�������ʾ����ϲ�㣬������
 *		D:��β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô����?
 *			while(true) {ѭ��������}
 */
public class RandomTest1 {
	public static void main(String[] args) {
		// ϵͳ����һ�������1-100֮��ġ�
		Random r = new Random();
		int number = r.nextInt(100) + 1;

		while(true){
			// ����¼������Ҫ�µ�����
			Scanner sc = new Scanner(System.in);
			//��������
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();
	
			// �Ƚ�����������(�����������if���)
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			} else {
				System.out.println("��ϲ��,������");
				break;
			}
		}	
	}
}

/*
 * 1������¼��
 * 		A������
 * 			import java.util.Scanner;
 * 		B����������
 * 			Scanner sc = new Scanner(System.in);
 * 		c����������
 * 			int i = sc.nextInt();
 * 2�����������
 * 		A������
 * 			import java.util.Random;
 * 		B����������
 * 			Random r = new Random();
 * 		C����ȡ�����
 * 			int number = r.nextInt(10);
 */
