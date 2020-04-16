/**
 * 作业标题
 * 数组所有元素之和
 *
 * 作业内容
 * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
 */
public class Demo_17 {
    public static double sum(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double ret = sum(arr);
        System.out.println(ret);
    }
}
