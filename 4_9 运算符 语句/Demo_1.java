//算数运算符 

public class Demo_1{
	/**
	 * 知识点3：自增/自减运算符 ++ --
	 */

	public static void main(String[] args) {
		
		int a = 10; 
		int b = ++a; // a+1;b = 11;a = 11
		System.out.println(b); 
		int c = a++; //c=11; a+1; a=12
		System.out.println(c);

		//陷阱
		int i = 10;
		i = i++;
		System.out.println(i);//10

	}


	/**
	 * 知识点2：增量赋值运算符 += -= *= /= %=
	 * @param args [description]
	 */
	public static void main2(String[] args) {
		//++
		int a = 10;
		a += 1;
	    a = a + 1;
		System.out.println(a);
	}


	/**
	 * 知识点1：基本四则运算 + - * / % 
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		// /除号 --除数不嫩为0
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println((float)5/2);//2.5
		System.out.println((float)(5/2));//2.0

		System.out.println(11 / 0);

		//% -- 对小数可以进行求余
		System.out.println(10%3);//1  商3
		System.out.println(10%-3);//1  商-3
		System.out.println(-10%3);//-1 商-3
		System.out.println(-10%-3);//-1 商3

		System.out.println(11.5 % 2.0);

	}
}