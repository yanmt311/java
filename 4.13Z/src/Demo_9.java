import java.util.Scanner;

/**
 * 作业标题
 * 青蛙跳台阶问题
 *
 * 作业内容
 * 青蛙跳台阶问题
 *
 * 分析：一个台阶 -- 1
 *      两个台阶 -- 11 2 --2
 *      三个台阶 -- 111 12 21 --3
 *      四个台阶 -- 1111 121 211 112 22 -- 5
 *
 *      1、跳一个台阶，剩余f(n-1)
 *      2、跳两个台阶，剩余f(n-2)
 */
public class Demo_9 {
    public static int jumpFloor(int x){
        if(x == 1){
            return 1;
        }else if(x == 2){
            return 2;
        }else{
            return jumpFloor(x-1) + jumpFloor(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入青蛙所跳台阶数");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = jumpFloor(n);
        System.out.println(ret);
    }

}
