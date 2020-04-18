import java.util.Arrays;

/**
 * 给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
 * 例如          {1, 2, 3, 4}
 * 调整后得到     {4, 2, 3, 1}
 *
 * 分析：
 * 设定两个下标分别指向第一个元素和最后一个元素.
 * 用前一个下标从左往右找到第一个奇数,
 * 用后一个下标从右往左找到第一个偶数,
 * 然后交换两个位置的元素.
 * 依次循环即可.
 */
public class Demo_11 {
    /**
     * 偶数在前，奇数在后
     * @param array
     */
    public static void swap1(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left< right && array[left] % 2 == 0) {
                //偶数
                left++;
            }
            //第一个while循环结束，肯定是遇到奇数了


            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            //第二个while循环结束right肯定遇到偶数了


            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {2,3,1,6,7};
        swap1(array);
        System.out.println(Arrays.toString(array));
    }



    public static void swap(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left< right && array[left] % 2 != 0) {
                //奇数
                left++;
            }
            //第一个while循环结束，肯定是遇到偶数了


            while (left < right && array[right] % 2 == 0) {
                //偶数
                right--;
            }
            //第二个while循环结束right肯定遇到奇数了


            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
}
