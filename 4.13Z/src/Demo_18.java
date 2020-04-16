import java.util.Arrays;

/**
 * 作业标题
 * 改变原有数组元素的值
 *
 * 作业内容
 * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
 * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 *
 */
public class Demo_18 {
    public static void transform(int[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = 2*array[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}
