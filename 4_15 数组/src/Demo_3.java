/**
 * 找数组中的最大值
 */
public class Demo_3 {
    public static int  maxArray(int[] array){
        int max = array[0];
        for(int i = 1;i<array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,34,4,5};
        int ret = maxArray(arr);
        System.out.println(ret);
    }
}
