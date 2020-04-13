

import java.util.Scanner;

public class  Demo_1 {
	/**
	 * 知识点3：do ... while();
	 *至少循环一次
	 */
	public static void main(String[] args) {
		int num = 0;
		do{
			System.out.println("hahaha");
		}while(num != 0);
		
	}


	/**
	 * case：打印1！+2！+3！+4！+5！+...
	 */
	public static void main2_1(String[] args) {
		System.out.println("请输入所求的阶乘数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int i = 0;
		int sum = 0;
		for(i=1; i<=num; i++){
			int ret = 1;
			int j = 0;
			for(j=1; j<=i; j++){
				ret *= j; 
			}
			sum += ret;
		}
		System.out.println(sum);
	}


	/**
	 * 知识点2：for循环
	 *  for(表1；表2；表3){
	 *  	循环体；
	 *  }
	 *  执行顺序：第一趟：先执行表达式1：
	 *                  表达式2；
	 *                  循环体；
	 *                  表达式3；
	 *           第二趟：表达式2：
	 *                  循环体；
	 *                  表达式3； 
	 *                    
	 *   case1：打印1-10是个数       
	 */

	public static void main2(String[] args) {
		// for的一般格式
		for(int i = 1; i<=10; i++){
			System.out.println(i);
		}

		//省略表达式1
		// int i = 1;
		// for(; i<=10; i++){
		// 	System.out.println(i);
		// }

		//省略表达式3
		// int i = 1;
		// for(; i<=10; ){
		// 	System.out.println(i);
		// 	i++;
		// }

		//省略表达式2 -- 打印1-10后，死循环 -- 因为for循环没有判断语句，默认为真
		// int i = 1;
		// for(; ; ){
		// 	if(i<=10){
		// 		System.out.println(i);
		// 		i++;
		// 	}
		// }

		//for的死循环
		// for(; ; ){
		// 	System.out.println("hehe");
		// }

		//while的死循环 --- while不能省略判断条件
		// while(true){
		// 	System.out.println("hehe");
		// }

		//死循环的范围 --- 如byte ---越界死循环 -- -128 ~ 127 之间死循环
		// for(byte i = 0; i<=130; i++){
		// 	System.out.print(i + "");
		// }
		
	}


	/**
	 * 知识点1：break continue -- 必须用再循环中或switch种
	 * 
	 *   case:打印既能被3整除，也能被5整除
	 *        
	 *        break：提前结束循环，结束所有循环
	 *        continue：结束本次循环
	 *        
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		System.out.println("请输入一个数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();//输入一个数

		while(num <= 20){
			if(num%15 == 0){
				System.out.println(num);
				break;//打印14个hehe
				//continue;//先打印14个hehe，后15死循环
			}
			System.out.println("hehe");
			num++;
		}
	}
}