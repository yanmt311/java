/**
 *一个整型数组里除了一个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * a^a == 0   0^a == a
 */
public class Demo_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        int ret = 0;
        for (int i = 0; i < arr.length ; i++) {
           ret ^= arr[i];
        }
        System.out.println(ret);
    }
}

