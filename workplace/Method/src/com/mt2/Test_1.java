package com.mt2;
/*
 * ���󣺰ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 */
public class Test_1 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 11, 22, 33, 44, 55 };

		// ����
		// for (int x = 0; x < arr.length; x++) {
		// 		System.out.println(arr[x]);
		// }
		
		//�÷����Ľ�
		//printArray(arr);
		
		//��һ����Ȼ���ԣ������Ҿ��ø�ʽ���ÿ����ܲ��ܴ�ӡ������ĸ�ʽ��?
		//[Ԫ��1, Ԫ��2, Ԫ��3, ...]
		printArray(arr);
	}
	
	
		/*
		 * ������ȷ��
		 * 		����ֵ���ͣ�void
		 * 		�����б�int[] arr
		 */
	
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++){
			System.out.println(arr[x]);
		}
	}
	*/
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++){
			if(x==arr.length-1){
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	

}