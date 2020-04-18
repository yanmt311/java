import java.util.Arrays;

/**
 * 查找数组当中指定元素
 *
 * 二分查找：Arrays.binarySearch
 */
public class Demo_5 {
    /**
     * 方法1：顺组查找，最坏情况遍历完所有元素
     * @param array
     * @param key
     * @return
     */
    public static int findNum(int[] array ,int key){
        for(int i = 0; i < array.length; i++){
            if(key == array[i]){
                return i;
            }
        }
     return -1;//没有这个元素，数组下标没有-1
    }
    public static void main1(String[] args) {
        int[] arr = {12,211,34,24,56,78};
        int ret = findNum(arr,34);
        System.out.println("下标： " + ret);
    }

    /**
     * 方法2：二分查找
     * 注意：是中间元素和key进行比较
     *      结束的条件是：right<left
     */
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length - 1;

       while(left <= right) {
           int mid = (left + right) / 2;

           //int mid = (left + right) >>> 1;//无符号右移，右移速度最快，右移类似除法

            if (array[mid] < key) {
                left = mid + 1;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
       return -1;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,6,8,9};
        int ret = binarySearch(arr,5);
        System.out.println("下标" + ret);
    }

    /**
     * Java中的二分查找
     *
     *
     * public static int binarySearch(int[] a, int key) {
     *         return binarySearch0(a, 0, a.length, key);
     *     }
     *
     *
     *
     *      private static int binarySearch0(int[] a, int fromIndex, int toIndex,
     *                                      int key) {
     *         int low = fromIndex;
     *         int high = toIndex - 1;
     *
     *         while (low <= high) {
     *             int mid = (low + high) >>> 1;
     *             int midVal = a[mid];
     *
     *             if (midVal < key)
     *                 low = mid + 1;
     *             else if (midVal > key)
     *                 high = mid - 1;
     *             else
     *                 return mid; // key found
     *         }
     *         return -(low + 1);  // key not found.
     *     }
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //默认从0号下标开始
        System.out.println(Arrays.binarySearch(arr, 4));
        //从2号下标开始，到5号下标之间找元素4
        //[fromIndex,toIndex) --- 左闭右开
        System.out.println(Arrays.binarySearch(arr, 2,4,4));

    }

}



