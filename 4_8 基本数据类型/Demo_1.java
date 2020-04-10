

public class Demo_1{
	/**
	 * 知识点12:数据类型转换
	 * 显示类型转换：把一个大类型转换为一个小类型 -- 强制类型转换
	 * 隐式类型转换：把一个小类型转换为一个大类型 
	 */
	public static void main(String[] args) {
		//1、int long double相互转换
		int a = 10;
		long b = a;//小转大
		System.out.println(b);//10

		double c = a;
		System.out.println(c);//10.0

		//2、int boolean 不能相互转换
		/*
		int a = 10; 
		boolean b = true; 
		b = a; // 编译出错, 提示不兼容的类型
		a = b;// 编译出错, 提示不兼容的类型
		*/
		
		//3、int byte--byte 表示的数据范围是 -128 -> +127 ，超过不能转换
		//byte a = 100; // 编译通过
		//byte b = 256; // 编译报错, 提示 从int转换到byte可能会有损失
		
		int m = 0; 
		double n = 10.5; 
		m = (int)n;
		System.out.println(m);//10
	}



	/**
	 * 知识点11：常量：字面常量，final修饰的常量
	 * 
	 */
	public static void main11(String[] args) {
		
		final int NUM = 10;//常量名全为大写，只能初始化一次，使用时一定要初始化

		final int MAX;
		MAX = 11;
		//MAX = 12;//eror,只能初始化一次
		System.out.println(NUM);
		System.out.println(MAX);
	}

	/**
	 * 知识点10：整形提升
	 *   int long --- int提升为1ong
	 *   byte 和byte -- 提升为int
	 */

	public static void main10(String[] args) {
		int i = 2147483647 + 1;
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648

		int i1 = Integer.MAX_VALUE + 1;
		System.out.println(i);//-2147483648
		System.out.println(i1);//-2147483648

		//整形提升
		/*
		byte b = 127 + 1;//超过范围后，127 + 1为整形了，从int转换到byte可能会有损失
		byte a = Byte.MAX_VALUE + 1;//Byte.MAX_VALUE + 1为整形了，从int转换到byte可能会有损失
		System.out.println(b);
		System.out.println(a);
		*/
	
		byte a1 = 10;
		byte a2 = 20;
		//byte c = a1 + a2;//error -- a1 + a2整形提升 为int 不能给byte
		//System.out.println(c);
		//修改：
		byte c1 = (byte) (a1 + a2);
		int c2 = a1 + a2;
		
		System.out.println(c1);
		System.out.println(c2);

	}


	/**
	 * 知识点9：字符串类型：String
	 */
	public static void main9(String[] args) {
		String str1 = "hello";
		String str2 = "\"hello\""; //双引号
		String str3 = "\'hello\'"; //单引号
		String str4 = "\\\\hello\\\\"; //双\\
		String str5 = "\\hello\\";//单\

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

	}


	/**
	 * 知识点8：布尔类型 boolean -- 没有明确大小
	 *         只有两个取值，ture false
	 *         java中没有0是假，非0为真的说法
	 *         真只有true  假只有false
	 */
	public static void main8(String[] args) {
		boolean flag = false;
		System.out.println(flag);
	}



	/**
	 * 知识点7：短整型 short  2字节
	 */
	public static void main7(String[] args) {
		short a = 12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
	


	/**
	 * 知识点6：字节数据类型 byte 1个字节 数值类型--可取负数
	 *       取值范围 -- -128 ~127  == -2^7 ~ 2^7-1
	 */ 
	public static void main6(String[] args) {
		byte a = 10;
		byte b = 12;
		System.out.println(a + " " + b);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		/*
		byte c = MAX_VALUE + 1； //MAX_VALUE + 1 为整形 --- int到byte有损失
		System.out.println(c);//error 报错
		*/
	
		//println 默认以整形进行打印 ---所以不是-128
		System.out.println(Byte.MAX_VALUE + 1);//128   但预期结果-128 ，不一样

		//每一种数据类型，给其赋值时，一定不能超过其范围
		
		/*
		byte d =  130;//报错，int到byte有损失 -- 不能byte范围
		System.out.println(d);
		int e = 2147483647
		System.out.println(e);
		*/
	}



	/**
	 * 知识点5：字符数据类型 2个字节 --- 0~65535 没有负数 是字符类型 不是数值类型
	 * char --Unicode字符集 -- 包含很多 -- 中文也可以 -- 一个汉字，两个字节
	 * @param args [description]
	 */

	public static void main5(String[] args) {
		
		char ch = 'a';
		char ch1 = '高';
		char ch2 = 97;
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);

	}



	/**
	 *	知识点4：单精度 float
	 *	@param args [description]
	 */
	
	//Java中是强类型转换  c中是弱类型转换
	public static void main4(String[] args) {
		
		//Java中，不允许把一个double类型的值，直接赋值给float，编译错误！ -- 体现java的安全性
		//float a = 11.1;//编译错误 --- double到float会有精度损失
		float f = 12.4f;//必须写f 不加f会报错

		System.out.println(f);

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
	}




	/**
	 * 知识点3：double
	 * @param args [description]
	 */

	//Java中默认浮点数为double双精度类型
	public static void main3(String[] args) {

		//Double是double的包装类
		//double类型为8个字节
		double d = 12.5;
		System.out.println(d);//12.5
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		//要想打印小数，必须一个为double
		//float 精确表示小数点后6位 --- 4个字节
		//遇到小数，建议使用double
		//小数没有精确值 ，只有一个范围
		//float 和0比较  >= -0.000001 && <=0.000001
		int a = 1;
		int b = 2;
		System.out.println(a / b);//结果为0 

		double num = 1.1;
		System.out.println(num * num);//1.2100000000000002

	}




	/**
	 *知识点2：main 函数考点：
	 *	1、String[] args 作用 ---运行时命令行参数
	 *  2、static 
	 * @param args [description]
	 */ 
	
	//
	//case1:数组
	//c语言 -- int arr[10] = {0};//数组类型为int [10]
	//Java中数组在堆，c在栈
	//
	//在运行时java 类型名 后加任何字符串  --- 打印字符串 + 开心 
	//
	
	public static void main2(String[] args) {
		for(int i = 0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}

		System.out.println("开心"); //结果为开心 没有打印数组内容
	}




	/**
	 * 知识点1：长整形
	 * 长整形  long  8个字节 -2^63 ~ 2^63-1    Long（包装类）     long a = 10L;
	 * @param args [description]
	 */
	
 	//java 中没有无符号 --均为有符号
	public static void main1(String[] args) {

		//10后面一定要写L --代表长整形 --若不写，默认整形
		long a = 10L;

		System.out.println(a);
		System.out.println("最大值：" + Long.MAX_VALUE);//+为拼接
		System.out.println("最小值：" + Long.MIN_VALUE);//Long是long的包装类

		//任何类型的数据和字符串进行拼接，结果都是字符串
		int b = 1;
		int c = 2;
		System.out.println("拼接" + b + c);//拼接12
		System.out.println( b + c);//3
		System.out.println("拼接" + (b + c));//拼接3

	}
}



//8种基本数据类型
//整形    int     4个字节  -2^31 ~ 2^31-1    Integer(包装类)    int a = 10;
//长整形  long    8个字节  -2^63 ~ 2^63-1    Long               long a = 10L;
//双精度  double  8个字节                    Double             double num = 1.1
//单精度  float   4个字节                    Float              float f = 12.4f
//字符    char    2个字节   0-65535          Character                  char ch1 = '高'
//字节    byte    1个字节   -2^7 ~ 2^7-1     Byte               byte a = 10
//短整型  short   2个字节   -2^15 ~ 2^15-1   Short              short a = 12;
//布尔    boolean 无明确规定                 Boolean            boolean flag = false;
//
//引用数据类型
//类 String 数组 抽象类 接口 枚举