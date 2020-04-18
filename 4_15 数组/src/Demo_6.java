/**
 * 测试
 */
public class Demo_6 {
    /**
     * 测试二分查找的速度有多快  --- 最坏14次
     */

    public static int count = 0;
    public static int binarySearch1(int[] array,int key){
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            count++;
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
    public static void main(String[] args) {
        int[] arr = new int[10000];

        for(int i = 0; i< arr.length; i++){
            arr[i] = i;
        }

        int ret = binarySearch1(arr,9999);
        System.out.println("下标" + ret + " " +"找到的次数:" + count);
    }

    /**
     * 测试for循环 --- 最坏1000次
     */
    public static int findNum(int[] array ,int key){
        for(int i = 0; i < array.length; i++){
            count++;
            if(key == array[i]){
                return i;
            }
        }
        return -1;//没有这个元素，数组下标没有-1
    }
    public static void main2(String[] args) {
        int[] arr = new int[10000];

        for(int i = 0; i< arr.length; i++){
            arr[i] = i;
        }

        int ret = findNum(arr,9999);
        System.out.println("下标： " + ret +" " + "找到的次数:" + count);
    }
}
