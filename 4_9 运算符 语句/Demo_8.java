//语句

import java.util.Scanner;
public class Demo_8{

	/**
	 * 知识点1：分支语句：
	 * 1、if ... else
	 * 2、switch
	 * 条件语句必须为boolean类型
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		int a = 10;
		if(a == 10){
			System.out.println("hello");
		}
	}


	/**
	 * 知识点2：case1：判断某一年份是否为闰年
	 * @param args [description
	 */
	
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int year = scan.nextInt();
			if((year%4==0 && year%100!=0) || (year%400==0)){
				System.out.println("闰年");
			}else{
				System.out.println("不是闰年");
			}

		}
		
	}


	/**
	 * 知识点3：悬垂else:else 和最近的if结合
	 */
	
	public static void main3(String[] args) {
		int x = 10;
		int y = 10;
		if(x == 10){
			if(y == 10){
				System.out.println("aaaa");
			}
		}else{
			System.out.println("bbbb");
		}
	}

	/**
	 * 知识点4：Switch(){case: default:}  -- 结果1
	 *
	 * 面试问题：不能做Switch参数的是：long float double boolean 
	 * 可以的是：byte int short  char 枚举 字符串
	 *
	 * break尽量不要省略
	 *  
	 */

	public static void main4(String[] args) {
		int a = 1;
		switch (a){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("错误，重新输入");
				break;

		}
	}

	/**
	 * 知识点5：Switch无break -- 结果12
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		int a = 1;
		switch (a){
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("错误，重新输入");
				break;

		}
	}





	/**
	 * 知识点6：循环语句：while for  --- 判断条件 为boolean表达式
	 */
	

	/**
	 * 知识点7：case1： 1-100和
	 */
	public static void main7(String[] args) {
		int num = 100;
		int sum = 0;
		int i = 0;
		while(i <= num){
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	/**
	 * 知识点8：case2：100！
	 */
	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		int ret = 1;
		while(i <= num){
			ret *= i;
			i++;
		}
		System.out.println(ret);
	}

	/**
	 * 知识点9：case3：1！+2！+3！ +  100！
	 */
	public static void main9(String[] args) {
		int num = 5;
		int i = 0;
		int sum = 0;
		for(i=1; i<=num; i++){
			int ret = 1;
			int j = 0;
			for (j=1 ;j<=i; j++ ) {
				ret *= j;
			}
			sum += ret;	
		}
		System.out.println(sum);
	}


	/**
	 * 知识点10：优化case3：1！+2！+3！ +  100！
	 */
	
	public static void main10(String[] args) {
		int num = 5;
		int i = 1;
		int ret = 1;
		int sum = 0;
		while(i<=num){
			ret *= i;
			sum += ret;
			i++;
		}
		System.out.println(sum);
	}



	/**
	 * 知识点11：while case3：1！+2！+3！ +  100！
	 */
	public static void main11(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 5){
			int i = 1;
			int ret = 1;
			while(i <= num){
				ret *= i;
				i++;
			}

			sum += ret;
			num++;
		}
		System.out.println(sum);
	}
}
