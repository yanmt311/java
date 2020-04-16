import java.util.Scanner;

/**
 * 青蛙跳台阶
 * 可跳一阶台阶 也可跳两阶台阶
 *
 * 分析：
 * 一个台阶：1   --- 1
 * 两个台阶：11 2   --- 2
 * 三个台阶：111 12 21  --- 3
 * 四个台阶：1111 121 22 211 112 --- 5
 *
 * 当n>2时，第一次跳时，有两种选择，
 * 1、第一次仅仅跳一个台阶，跳法数目等于后面剩下的（n-1）个台阶的跳法数目 即jumpFloor（n-1）
 * 2、第一次跳两个台阶，跳法数目等于后面剩下的（n-2）个台阶的跳法数目 即jumpFloor（n-2）
 */


public class Demo_2 {
    public static int jumpFloor(int target){
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入青蛙跳的台阶个数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = jumpFloor(n);
        System.out.println(ret);
    }

}
