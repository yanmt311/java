import java.util.Arrays;

/**
 * 作业标题
 * 创建的数组，并且赋初始值
 *
 * 作业内容
 * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
 */
public class Demo_20 {
    public static void initialization(int[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[100];

        System.out.println(Arrays.toString(arr));
        initialization(arr);
        System.out.println(Arrays.toString(arr));
    }
}
