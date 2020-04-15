import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *       数组 : 存放相同数据类型的集合。内存是连续的。
 *       new:实例化一个对象   内存
 * 栈上的地址  是拿不到的
 * 堆上的地址  可以打印 但是不是真实的   但是  你可以当做是真时的。地址也是唯一的。
 *     hash
 * User: GAOBO堆上
 * Date: 2020-04-13
 * Time: 19:40
 */
public class TestDemo2 {

    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1) {
                ret+=",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        System.out.println(myToString(array));
    }


    public static void func2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static int[] func(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }

    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        //Arrays 把他叫做  操作数组的工具类
        System.out.println(Arrays.toString(ret));
    }

    public static void main5(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] array = null;//array引用的是个空对象
        System.out.println(array[0]);
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //将数组  以字符串的形式进行输出
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] arr) {
        for (int x :arr) {
            System.out.print(x+" ");
        }
    }

    public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    /**
     * 数组进行参数传递：
     * @param args
     */
    public static void main3(String[] args) {
        /*int[] array = {1,2,3,4};
        printArray(array);*/
        int[] array2 = {10,20};
        System.out.println(array2[0]+" " + array2[1]);
        swap(array2);
        System.out.println(array2[0]+" " + array2[1]);

    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        //System.out.println(array[100]);
        /* int len = array.length;//属性
        System.out.println(len);*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("================");
        for ( int val : array) {
            System.out.print(val+" ");
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[]{11,22,33,44};
        int[] array3 = new int[4];//0
        array3[0] = 1;
        array3[1] = 2;
    }
}
