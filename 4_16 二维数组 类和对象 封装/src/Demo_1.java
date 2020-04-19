import java.util.Arrays;
import java.util.jar.JarOutputStream;

/**
 *二维数组的初始化、遍历
 *
 * 规则二维数组
 *
 * 不规则二维数组
 */
public class Demo_1 {
    /**
     * 规则二维数组的初始化
     */
    public static void main1(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8}};
        int[][] arr1 = new int[][]{{1,2,3,4},{5,6,7,8}};
        int[][] arr2 = new int[2][4];
    }

    /**
     * 规则二维数组的遍历
     *
     * java当中的二维数组实际上是一个一维数组中的每个元素的一位数组
     */
    public static void main2(String[] args) {
       int[][] arr = {{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main3(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main4(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr));//打印的是地址   [[I@677327b6, [I@14ae5a5]
    }

    public static void main5(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        //进入一维数组
        for (int[] temp : arr) {
            //打印一维数组中的元素
            for (int x : temp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    /**
     * 不规则二维数组的初始化、遍历
     */
    public static void main(String[] args) {
        //c语言，必须指定列，行可以自动推导
        //java中，行必须指定，列不能自动推导
        int[][] arr = new int[2][];  //--出现空指针异常 --引用默认为null
        //arr[0] = new int[3];
        //arr[1] = new int[2];
        arr[0] = new int[]{1,2,3,4};
        arr[1] = new int[]{2,3,4};
       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
