import java.util.Arrays;

/**
 * 给定一个数组, 将里面的元素逆序排列.
 *
 * 分析：设定两个下标, 分别指向第一个元素和最后一个元素. 交换两个位置的元素.
 *     然后让前一个下标自增,
 *     后一个下标自减, 循环继续即可.
 */
public class Demo_10 {
    public static void reverse(int[]  arr){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
