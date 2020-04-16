import java.util.Scanner;

/**
 * 作业标题
 * 递归求 N 的阶乘
 *
 * 作业内容
 * 递归求 N 的阶乘
 */
public class Demo_15 {
    public static int factorial(int x){
        if(x == 1){
            return 1;
        }else {
            return x * factorial(x - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入所求阶乘数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = factorial(n);
        System.out.println(ret);
    }
}
