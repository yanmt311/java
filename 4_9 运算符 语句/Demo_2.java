

//关系运算符 ---表达结果：boolean类型
//注意: 关系运算符的表达式返回值都是 boolean 类型.

public class Demo_2{
	/**
	 * 关系运算符：== != < > <= >=
	 * @param args [description]
	 */
	public static void main(String[] args) {
		
		int a = 10; 
		int b = 20; 
		System.out.println(a == b); //false 
		System.out.println(a != b); //true
		System.out.println(a < b); //true
		System.out.println(a > b); //false
		System.out.println(a <= b); //true
		System.out.println(a >= b); //false
	}
}