import java.util.Arrays;

/**
 * 作业标题
 * 交换两个数组
 *
 * 作业内容
 * 给定两个整型数组, 交换两个数组的内容.
 */
public class Demo_12 {
    public static void swap(int[] arr,int[] arr1){
        int temp = 0;
        for (int i = 0; i < arr.length ;i++){
            temp = arr[i];
            arr[i] = arr1[i];
            arr1[i] = temp;
        }
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9,10};
        swap(arr,arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
