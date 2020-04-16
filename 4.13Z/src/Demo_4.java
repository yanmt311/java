import java.util.Scanner;

/**
 * 作业标题
 * 求 N 的阶乘 。
 *
 * 作业内容
 * 求 N 的阶乘 。
 */
public class Demo_4 {
    public static int factorial(int x){
        int ret = 1;
        for(int i = 1; i <= x; i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println("请输入所求阶乘数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = factorial(n);
        System.out.println(ret);
    }
}
