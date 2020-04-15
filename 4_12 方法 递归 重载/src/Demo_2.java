/**
 * 实参和形参的关系
 *      1、形参是实参的一份临时拷贝
 *      2、Java当中，只有按值传递，没有按地址传递
 *      3、return 后面的语句不在执行
 *      4、参数存在堆中
 *      5、一个方法可被多次调用
 *
 *
 */

import java.util.Scanner;



public class Demo_2 {

    /**
     * case：求两个数的
     */
    public static int sumNum(int x,int y){
        return x+y;
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int ret = sumNum(a,b);
        System.out.println(ret);
        int ret2 = sumNum(30,40);
        System.out.println(ret2);

    }

    /**
     * case：两个数的交换 --- 代码没有实现功能 -- 因为形参只是实参的一份临时拷贝，传值调用。
     */
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        swap(a,b);
        System.out.println(a + " " + b +" ");
    }

    /**
     * case:交换的正确方法
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {10, 20};
        swap(arr);
        System.out.println("a = " + arr[0] + " b = " + arr[1]);
    }
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}



