import java.util.Arrays;

/**
 *一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * 分析：
 * 1、对于出现两次的元素，使用“异或”操作后结果肯定为0，那么我们就可以遍历一遍数组，对所有元素使用异或操作，那么得到的结果就是两个出现一次的元素的异或结果。
 *
 * 2、因为这两个元素不相等，所以异或的结果肯定不是0，也就是可以再异或的结果中找到1位不为0的位，例如异或结果的最后一位不为0。
 *
 * 3、这样我们就可以最后一位将原数组元素分为两组，一组该位全为1，另一组该位全为0。
 *
 * 4、再次遍历原数组，最后一位为0的一起异或，最后一位为1的一起异或，两组异或的结果分别对应着两个结果。
 */
public class Demo_3 {

    public static int[] findNum(int[] arr) {
        if(arr.length < 2)
            return arr;

        int[] result = new int[2];  //要返回的结果
        int res = arr[0];  //第一次对所有元素进行亦或操作结果

        for(int i=1; i<arr.length; i++) {
            res ^= arr[i];
        }

        int one = 0;
        for(int i=0; i<32; i++) {  //找出亦或结果为1的位。
            if((res>>i & 1) == 1) {
                one  = i;
                break;
            }
        }

        for(int i=0; i<arr.length; i++) { //根据bitIndex为1，将元素分为两组
            if((arr[i] >> one & 1) == 1)
                result[0] ^= arr[i];   //对应位为1，亦或得到的结果
            else
                result[1] ^= arr[i];   //对应位为0，亦或得到的结果
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,6,1,2,3,5};
        int[] ret = findNum(arr);
        System.out.println(Arrays.toString(ret));
    }

}

