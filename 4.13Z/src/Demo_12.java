import java.util.Scanner;

/**
 * 作业标题
 * 返回的数字之和
 *
 * 作业内容
 * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
 *
 * 1234 == 1+2+3+4 == 10
 */
public class Demo_12 {
    public static int makeSum(int x){
        if(x < 10){
            return x;
        }else {
            return x%10 + makeSum(x/10);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = makeSum(n);
        System.out.println(ret);
    }

}
