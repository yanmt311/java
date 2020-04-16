import java.util.Scanner;

/**
 * 作业标题
 * 递归求和
 *
 * 作业内容
 * 递归求 1 + 2 + 3 + ... + 10
 */
public class Demo_14 {
    public static int sum(int x){
        if(x == 1){
            return 1;
        }else {
            return x + sum(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入所求数字之和的位数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = sum(n);
        System.out.println(ret);
    }
}
