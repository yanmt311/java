import jdk.internal.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 *Java 的方法  --- C语言当中的函数
 *
 * 方法：功能的实现。
 *
 * public static  返回值   方法名(形式参数列表) {
 *      方法体;
 *  }
 *
 *  1、方法名: 要采用小驼峰的形式。maxNum
 *
 *  2、public static :因为当前所有的方法 写完之后  会在main方法中调用，因为main方法是public static 的。
 *
 *  3、返回值：可有可无 具体看业务需求。如果有返回值  那么  返回值的类型需要和方法的返回值类型匹配
 *
 * 4、形式参数列表：形参-》实参的一份拷贝。
 *
 * 5、方法体：就是具体方法的实现
 *
 * 6、return 代表函数的结束  他下面的代码 将不会被执行。
 */



/**
 * case1：求数的最大值
 * @param args
 */

public class Demo_1 {

    //求三个数的最大值
    public static int maxThreeNum(int n1,int n2,int n3){
        //return maxNum((maxNum(n1,n2)),n3);

        int max = maxNum(n1,n2);
        return maxNum(max,n3);

    }
    //求两个数的最大值
    public static int maxNum(int x,int y){
        return (x > y) ? x : y;
    }
    public static void main(String[] args) {
        System.out.println("请输入三个数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ret = maxThreeNum(a,b,c);
        System.out.println(ret);
        System.out.println(maxThreeNum(a, b, c));//快速输出 maxThreeNum(a,b,c).sout 回车

    }
}
