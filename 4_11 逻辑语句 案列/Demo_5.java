
// 判定一个数字是否是素数
import java.util.Scanner;

public class Demo_5{
	/**
	 * 方法3：根号8 = 2*1.4 =2.8    1*8 2*4  === 肯定有一个小于2.8
	 *        根号16= 4         1*16 2*8 4*4  === 肯定有一个数小于4
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeNum = scan.nextInt();

		//由于sqrt 返回类型为static double--强制转换为int
		//import java.lang.Math --- 不需要手动导入  ---Math.sqrt(primeNum)

		for(int i = 2; i <= (int) Math.sqrt(primeNum); i++){
			if(primeNum % i == 0){
				System.out.println(primeNum + "不是素数");
				break;
			}
		}
	}

	/**
	 * 方法2：8 -- 1*8 2*4
	 */
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeNum = scan.nextInt();

		for(int i = 2; i <= primeNum / 2; i++){
			if(primeNum % i == 0){
				System.out.println(primeNum + "不是素数");
				break;
			}
		}

	}


	/**
	 * 方法1：
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeNum = scan.nextInt();

		for(int i = 2; i<primeNum; i++){
			if(primeNum % i == 0){
				System.out.println(primeNum + "不是素数");
				break;
			}else{
				System.out.println(primeNum + "是素数");
				break;
			}
		}
		
	}
}