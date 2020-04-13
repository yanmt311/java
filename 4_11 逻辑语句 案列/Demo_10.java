

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。


import java.util.Scanner;
public class Demo_10{
	public static void main(String[] args) {
		System.out.println("请输入分母的范围： ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		/**
		 * 注意：sum必须为double类型
		 * 		flag 进行符号的交替
		 * 		1.0 --为了保证是浮点数
		 */
		int flag = 1;
		double sum = 0;
		for(int i = 1;i <= n; i++){
			sum = sum + 1.0 / i *flag;
			flag = -flag;
		}
		System.out.println(sum);
	}
}