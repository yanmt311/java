

// 打印 1 - 100 之间所有的素数
import java.util.Scanner;

public class Demo_6{
	public static void main(String[] args) {
		//录入一个数
		System.out.println("请输入所求素数的范围：");
		Scanner scan = new Scanner (System.in);
		int primeNum = scan.nextInt();

		//产生1-100的数
		int i = 0;
		int count = 0;
		for(i = 1; i<=primeNum; i++){
			//素数判断
			int j = 0;
			for(j = 2; j <= (int) Math.sqrt(i); j++){
				if(i%j == 0){
					//System.out.println(i + "不是素数");
					break;
				}
			}

			//两种情况：
			//1、break
			//2、不满足j <= (int) Math.sqrt(primeNum)
			if(j > (int) Math.sqrt(i)){
					System.out.println(i + "是素数");
					count ++;
			}
			
		}
		System.out.println(count);
	}
}