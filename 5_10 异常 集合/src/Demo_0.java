/**
 * 异常：
 */
public class Demo_0 {
    /**
     * 4、空指针异常
     */
    public static void main4(String[] args) {
        int[] array = {1,2,3};
        array = null;
        System.out.println(array[2]);
    }
    /**
     * 3、数组下标越界异常
     */
    public static void main3(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[3]);
    }
    /**
     * 2、栈溢出错误
     */
    public static void func(){
        func();
    }
    public static void main2(String[] args) {
        func();
    }
    /**
     * 1、算数异常
     * @param args
     */
    public static void main1(String[] args) {
        int a = 10/0;
        System.out.println(a);
    }
}
