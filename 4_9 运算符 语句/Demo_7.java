
//键盘输入

import java.util.Scanner;//引入包装类

public class Demo_7{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//键盘输入
		int a = scan.nextInt();//nextInt -- 录入整形
		System.out.println(a);

		String str = scan.nextLine();//不会遇到空格结束
		System.out.println(str);

		String str1 = scan.next(); //next 遇到空格会结束
		System.out.println(str1);

	}
}