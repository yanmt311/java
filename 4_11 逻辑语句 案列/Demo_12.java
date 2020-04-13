

//求出0～999之间的所有“水仙花数”并输出。
//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)

import java.util.Scanner;
public class Demo_12{
	public static void main(String[] args) {
		System.out.println("请输入所求水仙花数范围: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= 999999;i++){
			//确定是几位数
			//123 -- 123/10=12 12/10=1 1/10=0
			
			int count = 0;
			int temp = i;//如果不存i，会使i=0
			while (temp != 0){
				count++;
				temp = temp / 10;
			}

			//求得每一位进行运算
			//123%10==3 123/10 ==12
			//12%10==2 12/10==1
			//1%10==1 1/10==0
			
			temp = i;
			int sum = 0;
			while (temp != 0){
				sum += Math.pow(temp%10 , count);
				temp = temp /10;
			}

			//判断是否相等
			if(sum == i){
				System.out.println(sum + " 水仙花数");
			}
		}
	}
}