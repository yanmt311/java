

// 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
// 
// 
// 

import java.util.Scanner;
public class Demo_15{

	public static void main(String[] args) {
		System.out.println("请输入一个整数: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();


		//00000000 00000000 00000000 00000110
		//下标：31 - 0
		//从左到右 
		//奇数：0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
		//偶数：0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0
		//从右到左
		//奇数：0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		//偶数：1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		
		//打印奇数
		System.out.println("奇数是：");
		for(int i = 31; i >= 1; i -= 2){
			System.out.print(((n>>i)&1) + " ");
		}
		System.out.println();

		//打印偶数
		System.out.println("偶数是：");
		for(int i = 30; i >= 0; i -= 2){
			System.out.print(((n>>i)&1) + " ");
		}

	}
}