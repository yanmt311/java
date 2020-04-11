
//逻辑运算符：&& || ！

public class Demo_3{
	public static void main(String[] args) {
		//&& 必须保证两个表达式都为真，整体才为真
		//短路：如果左侧表达式值为 false, 则表达式的整体的值一定是 false, 无需计算右侧表达式
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a<b && b<c);//true
		System.out.println(10 > 20 && 10 / 0 == 0); // false 

		//|| 只有一个表达式为真，整体就是真
		//短路：如果左侧表达式值为 true, 则表达式的整体的值一定是 true, 无需计算右侧表达式
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		System.out.println(a1<b1 || b1<c1);//true
		System.out.println(10 < 20 || 10 / 0 == 0); // true 


		//！ 只能作用于boolean类型
		int a2 = 10; 
		int b2 = 20; 
		//System.out.println(!a < b); //error a为整形
		System.out.println(!(a2 < b2)); //false

		boolean flag = true;
		System.out.println(!flag);//false


	}
}