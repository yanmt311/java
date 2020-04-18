

import java.util.Arrays;

/**
 * Arrays工具类当中的常用方法介绍：
 * Arrays.toString()
 * Arrays.binarySearch()
 * Arrays.copyOf()
 * Arrays.fill
 * Arrays.sort
 * Arrays.equals
 *
 * [fromIndex,  toIndex) -- 左闭右开
 *
 * 面试：Arrays.sort底层是什么排序？
 * @param args
 */

public class Demo_7 {
    /**
     * Arrays.toString()
     * @param args
     */

    public static void main1(String[] args) {

        int[] array = {1,21,13,4,52,46,7,18,9};
        System.out.println(Arrays.toString(array));
    }

    /**
     * Arrays.binarySearch()
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(array, 4));
        System.out.println(Arrays.binarySearch(array, 2,4,4));
    }

    /**
     * Arrays.copyOf()
     * @param args
     */
    public static void main3(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] ret = Arrays.copyOfRange(array,2,5);
        int[] ret1 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(ret1));

    }

    /**
     * Arrays.fill
     * @param args
     */
    public static void main4(String[] args) {

        int[] array = new int[10];
        Arrays.fill(array,2,5,8);
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,8);
        System.out.println(Arrays.toString(array));

    }

    /**
     * Arrays.sort
     * @param args
     */
    public static void main5(String[] args) {
        int[] array = {11,21,343,41,5,62,7222,811,92};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Arrays.equals
     * 相等 -- true
     * 不等 -- false
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.equals(array, array2));

    }
}
