

//求两个正整数的最大公约数

import java.util.Scanner;
public class Demo_9{
	public static void main(String[] args) {
		System.out.println("请输入两个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		//辗转相除法求最大公约数
		//18 12
		//18%12 = 1 .. 6
		//12%6 = 2... 0 
		// 6为余数
		int c = m;
		while(n%m != 0){
			c = n%m;
			n = m;
			m = c;
		}
		System.out.println(c);
	}
}