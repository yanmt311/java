


/**
 * 知识点：输入输出
 * 1.
 * println --- 输出换行
 * print --- 输出不换行
 * printf -- 格式化输出
 *
 * 2.Scanner scan = new Scanner(System.in); -- 键盘录入
 *   import java.util.Scanner; -- 导入包
 * 
 */

import java.util.Scanner;
public class Demo_2{

	//循环输入
	public static void main(String[] args) {
		while(scan.hasNextInt()){
			int num = scan.nextInt();
			System.out.println(num);
		}
	}
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		//键盘录入字符串
		System.out.println("请输入你的名字：");
		String name = scan.nextLine();

		//键盘录入整形
		System.out.println("请输入你的年龄：");
		int age = scan.nextInt();

		//键盘录入单精度
		System.out.println("请输入你的工资：");
		float salary = scan.nextFloat();


		System.out.println("姓名:" + name + "\n" + "年龄:" + age + "\n" + "工资:" + salary);
		//sc.close();//关闭任务管理器中的任务
	}


	public static void main1(String[] args) {

		System.out.println("hehehe");
		System.out.print("hehehe");
		System.out.printf("hehe\n");
	}
}