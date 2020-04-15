import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 递归：调用自己
 *
 * 满足的条件：1、调用自己本身
 *            2、要有一个趋近于终止的条件--若没有终止条件，会存在栈溢出异常
 *            3、推导出递归的公式
 * 思想：将大事情化解为小事情 --并且大问题和小问题的处理方式相同
 *
 * 函数的调用要在栈上开辟内存的，给这个函数开辟栈帧，栈是先进后出
 */
public class Demo_5 {
    /**
     * 某个数阶乘
     * 5! = 5*4!
     * 4! = 4*3!
     */
    public static int factorial(int x){

        if(x == 1){
            return 1;
        }else{
            int temp = x * factorial(x - 1);
            return temp;
        }
    }

    public static void main1(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int ret = factorial(a);
        System.out.println(ret);
    }


    /**
     * case：按顺序打印一个数字的每一位
     *123 == 123/10=12 123%10=3
     * 12 == 12/10 =1 12%10=2
     * 1==1/10 =0 1%10 = 1
     */
    public static void printNum(int x){
        if(x>9){
            printNum(x/10);
        }
        System.out.println(x%10);
    }
    public static void main2(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        printNum(a);
    }



    /**
     * case：求1+2+3+4+5+6...+10
     */
    public static int sumNum(int x){
        if(x!=1){
            return (x+sumNum(x-1));
        }else{
            return 1;
        }
    }
    public static void main3(String[] args) {
        System.out.println("请输入求和的范围：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = sumNum(a);
        System.out.println(sum);
    }

    /**
     * case：输入一个非负数，返回组成他的数字之和，输入1729 输出1+7+2+9=19
     * 1729%10==9
     * 9+function(172%10)
     * 终止条件只有一位数的时候
     */
    public static int sumMakeNum(int x){
        if(x > 9){
            return (x%10 + sumMakeNum(x/10));
        }else{
            return x;
        }
    }
    public static void main4(String[] args) {
        System.out.println("请输入一个非负数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ret = sumMakeNum(a);
        System.out.println(ret);
    }

    /**
     * case：斐波拉且数列 1 1 2 3 5 8 13 21 34 55
     * 单路递归能用递归，多路递归效率差只能进行迭代 -- 二叉树
     * @param args
     */
    public static int fibonacci(int x){
        if((x==1) || (x==2)){
            return 1;
        }
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main5(String[] args) {
        System.out.println("请输入所求斐波拉且数列的位数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fibonacci(a));
    }

    /**
     * 迭代求斐波拉且数列
     * 50 --- 输出为-298632863 --因为超过了int的最大值
     * @param x
     * @return
     */
    public static int fib(int x){
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for(int i = 3;i <= x; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println("请输入所求斐波拉且数列的位数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fib(a));
    }

}
