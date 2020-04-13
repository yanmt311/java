

//输出一个整数的每一位.

import java.util.Scanner;
public class Demo_16{
	public static void main(String[] args) {
		System.out.println("请输入一个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n!=0){
			System.out.println(n%10);
			n = n / 10;
		}

		
	}
}