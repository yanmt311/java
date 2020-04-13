

//输出乘法口诀表
//
import java.util.Scanner;
public class Demo_8{
	public static void main(String[] args) {
		System.out.println("请输入乘法: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 0;
		for(i = 1; i <=n; i++){
			int j = 0;
			for(j = 1; j <= i; j++){
				System.out.printf(i + "*" + j + "=" + i*j + "   ");
			}
			System.out.println();
		}
	}
}