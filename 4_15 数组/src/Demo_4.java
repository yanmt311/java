/**
 * 求数组的平均值
 */
public class Demo_4 {
    public static double average(int[] array){
       double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
//        for (int x : array) {
//            sum += x;
//        }
        return (double)sum / (double)array.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double ret = average(arr);
        System.out.println(ret);
    }
}
