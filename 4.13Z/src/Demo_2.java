import java.util.Scanner;

/**
 * 作业标题
 * 斐波那契数
 *
 * 作业内容
 * 求斐波那契数列的第n项。(迭代实现)
 *
 * 分析：1 1 2 3 5 8 13 21 34 55...
 *
 * f1 f2 f3=f1+f2
 *    f1  f2
 */


public class Demo_2 {
    //迭代
    public static int fib(int x) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
       for(int i = 3; i <= x; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
       return f3;
    }
    public static void main(String[] args) {
        System.out.println("请输入所求斐波那契数的位数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = fib(n);
        System.out.println(ret);
    }



    //递归
    public static int fibonacci(int x){
        if((x == 1) || (x == 2)){
            return 1;
        }else if(x <= 0){
            return 0;
        }else{
            return fibonacci(x-1) + fibonacci(x - 2);
        }
    }
    public static void main1(String[] args) {
        System.out.println("请输入所求斐波那契数的位数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = fibonacci(n);
        System.out.println(ret);
    }
}
