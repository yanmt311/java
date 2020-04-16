import java.util.Scanner;

/**
 * 作业标题
 * 求最大值
 *
 * 作业内容
 * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
 *
 * 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
 */
public class Demo_6 {
    public static int max3(int x,int y,int z){
        //return max2((max3(n1,n2)),n3);
        int max = max2(x,y);
        return max2(max,z);
    }

    public static int max2(int m,int n){
        return m > n ? m : n;
    }
    public static void main(String[] args) {
        System.out.println("请输入三个数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ret = max3(a,b,c);
        System.out.println(ret);

    }
}
