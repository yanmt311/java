import java.util.Arrays;

/**
 * 数组
 * Arrays. === 操作数组的工作类 === 引用import  java.util Arrays
 *
 * 1、Arrays.toString --- 将数组当中的元素以字符串形式进行输出
 *
 */
public class Demo_1 {
    /**
     * 库实现
     * @param args
     */

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }

    /**
     * 方法实现
     * @param arr
     * @return
     */
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            // 借助 String += 进行拼接字符串
            ret += arr[i];
            // 除了最后一个元素之外, 其他元素后面都要加上 ", "
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(toString(arr));
    }

}
