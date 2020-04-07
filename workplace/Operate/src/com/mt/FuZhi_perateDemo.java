package com.mt;
/*
 * 2、赋值运算符
 * 			A:基本的赋值运算符：=
 * 			B:扩展的赋值运算符：+=，-=，*=，/=，....
 */

//赋值运算符
public class FuZhi_perateDemo {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		
		//+=:是将+=左边和右边的数据做+，然后将结果给左边
		a += 20;//a = a + 20;
		System.out.println("a：" + a);
		
		//注意：扩展的赋值运算符，隐含了强制类型转换
		//有一个变量a，a+=10；
		//相当于： a = （a的数据类型）（a + 10）；
		short s = 1;
		s += 1;
		System.out.println("s：" + s);
	}	
}