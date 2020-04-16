import java.util.Arrays;

/**
 * 数组作为参数的方法
 * 1、c语言传递过去是指针，而Java只有值传递，引用是指针，但也是一个值
 * 2、改变值时，一般采用数组传参，不能一般传参，一般传参不改变值
 *    数组传参--类似于两个引用，共用一块内存
 */
public class Demo_6 {
    /**
     * 方法实现打印数组元素
     * @param array
     */
    public static void printArray(int[] array){
        for (int x:array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4};
        printArray(arr);
    }

    /**
     * 方法实现交换两个数
     * @param args
     */
    public static void swap(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
    public static void main2(String[] args) {
        int[] arr = {10,20};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }

    /**
     * 打印数组的简单方法
     * String n = Arrays.toString(数组名称) ---返回类型为String
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String ret = Arrays.toString(arr);
        System.out.println(ret);

        System.out.println(Arrays.toString(arr));

    }
}
