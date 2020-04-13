

//编写程序数一下 1到 100 的所有整数中出现多少个数字9。

//如果找一个十进制数字的每一位数是几，只需要除10 模10
//如果找一个二进制数字的每一位是几，只需要除2，模2
import java.util.Scanner;
public class Demo_11{


	public static void main(String[] args) {
		System.out.println("请输入数的范围: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//个位 9 19 29 39 49 59 69 79 89 99
		//十位 90 91 92 93 94 95 96 97 98 99
		int count = 0;
		int i = 0;
		for(i = 1 ; i <= n; i++){
			if(i /10 == 9){
				System.out.print(i + "  ");
				count++;
			}else if(i % 10 == 9){
				System.out.print(i + "  ");
				count++;			
			}

		}
		System.out.println();
		System.out.println(count);
	}


	public static void main1(String[] args) {
		System.out.println("请输入数的范围: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//个位 9 19 29 39 49 59 69 79 89 99
		//十位 90 91 92 93 94 95 96 97 98 99
		int count = 0;
		int i = 0;
		for(i = 1 ; i <= n; i++){
			if(i /10 == 9){
				System.out.print(i + "  ");
				count++;
			}
			

			if(i % 10 == 9){
				System.out.print(i + "  ");
				count++;			
			}

		}
		System.out.println(count);
	}
}