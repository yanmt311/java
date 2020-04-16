import java.util.Scanner;

/**
 * 作业标题
 * 求最大值方法的重载
 *
 * 作业内容
 * 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
 *
 */
public class Demo_7 {
    public static double max(double x,double y){
        return x>y ? x:y;
    }
    public static int max(int x,int y){
        return x>y ? x:y;
    }
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println("请输入两个小数");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println(max(m,n));
        System.out.println(max(a,b));

    }
}
