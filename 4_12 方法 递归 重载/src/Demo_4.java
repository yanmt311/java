/**
 * 方法的重载
 * 注意：方法的重载和重写的区别 -- 面试问题
 *
 * 重载满足的条件：
 * 1、方法名相同
 * 2、返回值不做要求 --可为int 可为double 可为void
 * 3、参数的类型或大小不同
 * 4、必须在同一类中
 *
 */
public class Demo_4 {
    /**
     * 求和
     * @return
     */

    public static int sumInt(int x,int y){
        return x+y;
    }

    public static double sumDouble(double x,double y){
        return x+y;
    }
    public static void main1(String[] args) {

        int a = 10;
        int b = 20;
        int ret = sumInt(a,b);
        System.out.println(ret);

        double d1 = 21.1;
        double d2 = 22.2;
        double ret1 = sumDouble(d1,d2);
        System.out.println(ret1);
    }

    /**
     * 重载
     */
    public static int sum(int x,int y){
        return x+y;
    }

    public static double sum(double x,double y){
        return x+y;
    }

    public static double sum(double x,double y,double z){
        return x+y+z;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int ret = sum(a,b);
        System.out.println("ret:" +ret);

        double d1 = 21.1;
        double d2 = 22.2;
        double d3 = 33.7;
        double ret1 = sum(d1,d2);
        double ret2 = sum(d1,d2,d3);
        System.out.println("ret1:" + ret1);
        System.out.println("ret2:" + ret2);
    }
}
