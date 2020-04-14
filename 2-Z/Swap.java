//给定两个 int 变量, 交换变量的值.
//
import java.util.Scanner;
public class Swap{

	// public static void main1(String[] args) {
	// 	int x = 10;
	// 	int y = 20;
	// 	int temp = 0;
	// 	System.out.println(x);
	// 	System.out.println(y);

	// 	temp = x;
	// 	x = y;
	// 	y = temp;
	// 	System.out.println(x);
	// 	System.out.println(y);

	public static void main (String[] args) {

		System.out.println("输入两个整数");
		Scanner scan = new Scanner(System.in);//键盘输入
		int a = scan.nextInt();//nextInt -- 录入整形
		int b = scan.nextInt();
		System.out.println(a);
		System.out.println(b);

		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}


	