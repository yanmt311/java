
//位运算符


public class Demo_4{
	/**
	 * 二进制 ~ 十进制 ： 0000 1010  --- 2^3+2^1 = 10
	 * 二进制 ~ 八进制 ： 三个看成1个整体,不够左边补0 --- 000 001 010 -- 0012 --第一个0代表八进制
	 * 二进制 ~ 十六进制 : 四个看成一个整体，不够左边补0 -- 0000 1010 -- 0X0a --整形四个字节 或者写成0X00 00 00 0a
	 * 十进制 ~ 二进制 ：短除法，除2，从下往上
	 * 
	 * @param args [description]
	 */
	public static void main(String[] args) {
		//0000 1010
		//0000 1101
		//0000 1000 --&
		//0000 1111 --|
		//0000 0111 --^
		int a = 10;
		int b = 13;
		System.out.println(a&b);//8
		System.out.println(a|b);//15
		System.out.println(a^b);//7

	}
}