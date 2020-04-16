import java.util.Scanner;

/**
 * 作业标题
 * 求和的重载
 *
 * 作业内容
 * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
 */
public class Demo_8 {
    public static double sum(double x,double y,double z){
        return x+y+z;
    }
    public static int sum (int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println("请输入三个小数");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        System.out.println(sum(m,n));
        System.out.println(sum(x,y,z));


    }
}
