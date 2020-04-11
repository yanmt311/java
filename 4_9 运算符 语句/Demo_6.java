
//条件运算符 ：表达式1 ? 表达式2 : 表达式3 
//当表达式1的值为true时, 整个表达式的值为表达式2的值; 
//当表达式1的值为false时, 整个表达式的值为表达式3的值.

public class Demo_6{
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = -1;
		
		int max = a>b ? a : b;
		System.out.println(max);//11

	}
}