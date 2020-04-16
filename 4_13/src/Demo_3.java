import java.util.Scanner;

/**
 * 变态青蛙跳台阶：一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 分析：
 *  当n = 1 时，f(1) = 1;即只有一个台阶时，只跳一次
 *  当n = 2 时， 可能一次跳1阶跳两次或一次跳2阶，f(2) = f(2-1) + f(2-2),
 *  f(2-1)可理解为跳了一步之后还有2-1阶台阶，f(2-2)可理解为跳了一步之后还剩2-2阶台阶。
 *  f(3) = f(3-1) + f(3-2) +f(3-3);
 *  f(n) = f(n-1) + f(n-2) +f(n-3) + … + f(n-(n-1)) + f(n-n)
 *  f(n) = f(n-1) + f(n-2) + f(n-3) +… + f(2) + f(1) + f(0)
 *
 *  f(n) = f(n-1) + f(n-2) + f(n-3) …f(2) + f(1) + f(0)
 *  f(n-1) = f[ (n-1) -1 ] + f[ f(n-1) - 2] + f[ (n-1) - 3] + … + f(1) + f(0)
 *  f(n-1) = f(n-2) + f(n-3) + f(n-4) + … + f(1) + f(0)
 *  f(n) = 2 * f(n-1)
 */
public class Demo_3 {

    public static int jumpFloor(int target) {
        if(target == 1) {
            return 1;
        }else{
            return 2 * jumpFloor(target - 1);
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
