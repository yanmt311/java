import java.util.Arrays;

/**
 * 数组拷贝
 * 1、for循环实现
 * 2、Arrays.copyOf() --- 注意：返回一个新的对象 --- int[]
 * 3、System.arraycopy() --- 更快
 * 4、数组名.clone()
 *
 * 面试:只要问到，都为浅拷贝
 *
 * 四种拷贝从本质来说均为浅拷贝
 * arr1 = {0x999,0x888,0x777};  0x999 中 a==10
 * arr2 = {0x999,0x888,0x777};
 *
 * 浅拷贝：如果通过引用arr2修改arr2自己的元素（对象）--- 拷贝的是地址 ，会影响到arr1引用，称为深拷贝 --- 数组当中存储引用类型
 * 如：arr2[0].a = 1234  arr1[0].a = 1234
 * 若想成为深拷贝，只需拷贝时，拷贝自己的对象即可，这样地址不一样，就不会影响
 * int arr1 == {1,2,3,4};
 * int arr2 == {1,2,3,4};
 * 深拷贝：如果通过arr2修改arr2自己的元素，不会影响到arr1引用，称为深拷贝 --- 数组当种存储简单类型
 * 如：改arr[0] == 999;arr1[0] == 1
 */
public class Demo_2 {
    /**
     * 方法1：for循环实现
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr){
        int[] arr1 =  new int[arr.length];
        for(int i = 1;i < arr.length;i++) {
            for(int j = 1;j < arr.length; j++){
                arr1[j] = arr[i];
            }
        }
        return arr1;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        copyArray(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 方法1优化：
     * @param arr
     * @return
     */
    public static int[] copyArray2(int[] arr){
        int[] arr1 =  new int[arr.length];
        for(int i = 1;i < arr.length;i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        copyArray2(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 方法2;Arrays.copyOf()
     */
    public static void main3(String[] args) {
        /**
         * 分析：返回值：int[]
         *       拷贝谁：int[] original
         *       拷贝的新的长度
         *  public static int[] copyOf(int[] original, int newLength) {
         *         int[] copy = new int[newLength];
         *         System.arraycopy(original, 0, copy, 0,Math.min(original.length, newLength));
         *         return copy;
         *     }
         *
         */
        int[] arr = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));
    }

    /**
     * 方法3：System.arraycopy()
     *
     * 分析：
     * native：c/c++代码实现的  速度快
     * Object src：源数组
     * int  srcPos：源数组当中拷贝的开始的位置
     * Object dest：目的地数组
     * int destPos：目的地数组当中拷贝到哪个位置
     * int length：拷贝的数组长度
     *
     *  public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
     *
     */
    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * 方法4：克隆 --- 数组名.clone()
     *        产生了数组名这个对象的一个副本
     *        这个方法是Object的克隆方法
     *        Object是所有类的父类。
     *
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 =  arr.clone();
        System.out.println(Arrays.toString(arr1));

    }
}

