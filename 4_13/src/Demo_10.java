import java.util.Arrays;

/**
 *自己写一个myToString的方法遍历数组
 * [1,2,3,4,5,6,7,8]
 */
public class Demo_10 {
    /**
     * 方法1：无返回类型
     * @param arr
     */
    public static void myToStringOne(int[] arr){
        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
            if(i < arr.length - 1){
                System.out.print(arr[i] + ",");
            }
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        myToStringOne(arr);
    }

    /**
     * 方法2：有返回类型
     */
    public static String myToStringTwo(int[] array){
        String ret = "[";
        for (int i = 0; i <array.length ; i++) {
            ret += array[i];
            if(i != array.length ){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {2,13,2,4,34,24,15,67};

        String ret = myToStringTwo(arr);
        System.out.println(ret);
    }

}
