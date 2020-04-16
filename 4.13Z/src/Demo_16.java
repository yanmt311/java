import java.util.Scanner;

/**
 * 作业标题
 * 求数组的平均值
 *
 * 作业内容
 * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 *
 */
public class Demo_16 {
    public static double avg(int[] array){
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double ret = avg(arr);
        System.out.println(ret);
    }
}
