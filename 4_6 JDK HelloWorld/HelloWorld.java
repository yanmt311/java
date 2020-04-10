//注意：HelloWorld.java ---文件名.java---HelloWorld.java
// 1、一个Java文件中只能有一个public类---public class HelloWorld
// 2、类名需要和文件名相同 ---不能是数字，中文
// 3、类名一定要采用大驼峰的命名方式 --- 首个字母大写
// 4、编程规定，左括号必须紧跟行后
// 5、大括号的内容为：类体 --字段、方法
// 6、IDEA：集成开发环境
// 7、注意字节码文件（.class）文件，一个类对应一个字节码文件 ----为什么这么设置
//    为了方便使用，如果需要HelloWorld这个类，那么就加载对应的字节码文件
//    java中，用到哪个类，就加载哪个类
// 
// 
//面试题
//1、String[] args作用是什么
//2、main方法为什么是static
//3、Java中的命令
//4、jdk jre jvm 区别  ----jdk：java开发工具-包含-jre:java运行环境-包含-jvm：Java虚拟机
//5、运行加载过程中如何加载 --- 双亲委派模型 类加载器
//
//
//如何运行一个Java程序
//过程：磁盘上的HelloWorld.java文件  通过编译（javac 文件名.java）得到字节码文件（二进制文件）HelloWorld.class  再通过运行加载到jvm虚拟机上
//1、进入文件目录:换d盘 --- d:
//            cd+路径  --- cd D:\Program Files\code\4.6
//2、编译：javac 文件名.java
//3、运行：java 文件名
//4、文档中有注释时，编译为：javac 文件名.java -encoding utf-8
//   因为字节码文件通常存储为ASCII码
//
//java中注释
//1、/* */   --块注释 ---ctrl + shift + /
//2、//      --行注释 ===ctrl + /
//3、/** */  --文档注释 --- 一般头 --姓名，日期，描述
//
//

/*
 public class HelloWorld{
	//类体
	public static void main(String[] args) {
		//方法体
		System.out.println("HelloWorld");//c中的输出函数printf("\n");

	}
}*/

public class HelloWorld{

	public static void main(String[] args) {
		
		//变量：int 四个字节  默认有符号---范围：-2^31 ~ 2^31-1
		//第一位为符号位 不是数值位，0代表正数，1代表负数
		

		int a;
		System.out.println(a);


		/*
		//max min 越界 --- 可以理解为一个圆进行数的连接
		//
		int max = Integer.MAX_VALUE+1;//-2147483648
		int min = Integer.MIN_VALUE-1;//2147483647
		System.out.println(max);
		System.out.println(min);


		/*
		int a = 10;
        //MAX ==  2147483647
        //MIN == -2147483648
		System.out.println(Integer.MAX_VALUE);//Integer 为包装类 ----int
		System.out.println(Integer.MIN_VALUE);
		
		/*
		System.out.println(a);//打印换行
		System.out.print(a);//打印不换行
		System.out.printf("%d\n",a);//以格式化进行输出内容
		*/
	}
}



