
// 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1

import java.util.Scanner;
public class Demo_14{

	public static void main(String[] args) {
		System.out.println("请输入一个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int count = 0;
		while(n!=0){
			n = n & (n-1);
			count ++;
		}
		System.out.println(count);
	}

	public static void main2(String[] args) {
		System.out.println("请输入一个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int count = 0;
		for(int i = 0; i<32;i++){
			if((((n>>i) & 1) == 1)){
				count++;
			}
		}
		System.out.println("count " + count);
	}


	public static void main1(String[] args) {
		System.out.println("请输入一个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int count = 0;

		for(int i=0; i<32; i++){

				if(n%2 == 1){
				count++;
			}
			n = n / 2;	
		}
		System.out.println(count);	
	}
}

