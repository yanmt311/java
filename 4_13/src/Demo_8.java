import java.util.Arrays;

/**
 * 将数组元素扩大2倍
 */


public class Demo_8 {
    /**
     * 在数组的基础上进行更改，没有开辟新的内存空间
     */
    public static void expan(int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i] = 2 * array[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String ret = Arrays.toString(arr);
        System.out.println(ret);

        expan(arr);
        String ret1 = Arrays.toString(arr);
        System.out.println(ret1);
    }

    /**
     * 开辟了一个新的内存空间
     * @param array
     * @return
     */
    public static int[] expansion(int[] array){
        int[] temp = new int[array.length];//开辟一个和array数组等大的空间为temp
        for (int i = 0; i <array.length ; i++) {
            temp[i] = 2 * array[i];
        }
        String ret = Arrays.toString(temp);
        return temp;//返回值为int[]
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String ret = Arrays.toString(arr);
        System.out.println(ret);

        int[] ret2 = expansion(arr);
        System.out.println(Arrays.toString(ret2));
    }
}
