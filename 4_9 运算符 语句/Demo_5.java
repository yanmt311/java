
//移位运算符：<< >> >>>

public class Demo_5{
	/**
	 * << 左移 -- 右补0
	 * >> 右移 -- 左补符号位
	 * >>> 无符号右移，左补0
	 * 位运算符的速度大于* /
	 * @param args [description]
	 */
	public static void main(String[] args) {
		
		int a = 11;
		int b = -1;
		//右移相当于除法
		System.out.println(a>>1);//5
		System.out.println(a>>2);//2
		System.out.println(b>>2);//-1
		System.out.println(b>>>1);//2147483647


		//左移相当于乘法
		System.out.println(a<<1);//22
		System.out.println(a<<2);//44

	}
}