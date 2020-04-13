
//猜数字游戏
//import java.util.*;
import java.util.Scanner 
import java.util.Random 
public class Demo_3{
	public static void main(String[] args) {
		
		//产生一个随机数
		
		Random random = new Random();//Random random = new Random(202002);//时间戳会使得每次的随机数一样，不能使用随机戳
		int randNum = random.nextInt(100);//[0,100) 
		int randNum = random.nextInt(100)+100;//[100,200) 


		System.out.println(randNum);

		//利用死循环--使没有猜对继续，直到猜正确，退出
		
		while(true){
			System.out.println("请输入你要猜的数字：");
			//键盘录入
			Scanner scan = new Scanner(System.in); 
			int num = scan.nextInt();

			if(num < randNum){
				System.out.println("你猜的小了！");
			}else if(num > randNum){
				System.out.println("你猜的数字大了！");
			}else{
				System.out.println("你猜对了！");
				break;
			}
		}
	}
}