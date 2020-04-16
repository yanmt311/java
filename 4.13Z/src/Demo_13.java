import java.util.Scanner;

/**
 * 作业标题
 * 递归打印数字的每一位
 *
 * 作业内容
 * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 *
 * 1234
 * 1234%10 == 4 1234/10 == 123
 * 123%10 == 3  123/10 == 12
 * 12%10 == 2 12/10 == 1
 * 1%10 == 0
 */
public class Demo_13 {
    /**
     * 顺序打印
     * @param x
     */
    public static void printNum1(int x){
        if (x>9){
            printNum1(x / 10);
            System.out.println(x % 10);
        }else{
            System.out.println(x % 10);
        }
    }
    public static void main1(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printNum1(n);
    }

    /**
     * 逆序打印
     */
    public static void printNum2(int x){
        if (x>9){

            System.out.println(x % 10);
            printNum2(x / 10);

        }else{
            System.out.println(x % 10);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printNum2(n);
    }
}
