import java.util.Arrays;

/**
 * 作业标题
 * 奇数放到数组后面
 *
 * 作业内容
 * 给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 */
public class Demo_11 {
    /**
     * 偶数在前，奇数在后
     * @param array
     */
    public static void swapArray(int[] array){
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            //从左找偶数，偶数不动，奇数交换
            while((left < right) && array[left] % 2  == 0){
                left++;
            }
            //第一个while循环结束，肯定是遇到奇数了


            //从右往左找奇数，奇数不动，偶数交换位置
            while((left < right) && array[right] % 2 != 0){
                right--;
            }
            //第二个while循环结束right肯定遇到偶数了

            if(left < right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,6,5,6};
        swapArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
