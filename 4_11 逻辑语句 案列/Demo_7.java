

//输出 1000 - 2000 之间所有的闰年

import java.util.Scanner;
public class Demo_7{
	public static void main(String[] args) {
		System.out.println("请输入闰年的范围: ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		int count = 0;
		int i = 0;
		for(i = 1000; i <= year; i++){
			if(((i % 100 != 0) && (i % 4 == 0)) || (i % 400 == 0)){
				System.out.println(i + "是闰年");
				count ++;
			}
		}
		System.out.println(count);
	}
}