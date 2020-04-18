/**
 *给定一个整型数组, 判断是否该数组是有序的(升序)
 */
public class Demo_8 {
    public static boolean isUp(int[] array){
        for(int i = 0;i < array.length - 1 ;i++){
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,4,30,5};
        boolean ret = isUp(arr);
        System.out.println(ret);
    }
}
