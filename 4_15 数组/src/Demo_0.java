/**
 * 回顾：
 * 1、定义初始化 3种形式：
 * 2、数组名程 --- 引用
 *    参数列表 --- 队形
 * 3、数组的内存是堆
 */
public class Demo_0 {
    int[] arr = {1,2,3,4};
    int[] arr1 = new int[] {1,2,3,4,5};
    int[] arr2 = new int[100];

    /**
     * case1:将数组元素扩大2倍
     *       没有开辟一个新空间
     */
    public static void transform1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void printArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        transform1(arr);
        printArray1(arr);
    }


    /**
     * case2:将数组元素扩大2倍
     *       开辟新空间
     */

    public static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        int[] output = transform(arr);
        printArray(output);
    }

}
