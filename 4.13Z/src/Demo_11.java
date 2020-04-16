import java.util.Scanner;

/**
 * 作业标题
 * 递归求斐波那契数列的第 N 项
 *
 * 作业内容
 * 递归求斐波那契数列的第 N 项
 *
 * 分析：1 1 2 3 5 8 13 21 34 55...
 *
 * 终止条件：x == 1 && x == 2  -- return 1
 */
public class Demo_11 {
    /**
     * 递归
     * @param x
     * @return
     */
    public static int fib1(int x){
        if((x == 1) || (x == 2)){
            return 1;
        }else{
            return fib1(x-1) + fib1(x-2);
        }
    }
    public static void main1(String[] args) {
        System.out.println("请输入所求斐波那契数的位数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = fib1(n);
        System.out.println(ret);
    }

    /**
     * 迭代
     * f1 f2 f3
     * 1  1  2
     *    1  2  3
     */
    public static int fib2(int x){
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

        int ret = fib2(n);
        System.out.println(ret);
    }
}
