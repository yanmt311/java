import java.util.Scanner;

/**
 * 阶乘：1！+2！+3！+4！...
 *
 *
 */
public class Demo_3 {

    /**
     * 方法2：求阶乘和--调用某个数的阶乘
     * @param num1
     * @return
     */
    public static int factoril(int num1){
        int sum = 0;
        for(int j = 1;j<=num1;j++){
            sum += fac(j);
        }
        return sum;
    }

    /**
     * 求某个数的阶乘
     * @param x
     * @return
     */
    public static int fac(int x){
        int ret = 1;
        for (int i = 1; i <= x; i++) {
            ret *= i;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = factoril(n);
        System.out.println(ret);

    }


    /**
     * 方法1：求阶乘和
     * @param x
     * @return
     */
    public static int factorial(int x){
        int i = 0;
        int sum = 0;
        for(i = 1; i <= x; i++){
            int j = 0;
            int ret = 1;
            for(j = 1;j <= i;j++){
                ret *= j;
            }
        sum += ret;
        }
        return sum;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = factorial(n);
        System.out.println(ret);

    }
}

