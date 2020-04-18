import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Demo_9 {
    public static void bubbleSort1(int[] array){
        //趟数执行len - 1;
        for (int i = 0; i < array.length -1 ; i++) {

            //趟数每次较上一次少1
            for (int j = 0; j < array.length - 1 -i; j++) {

                //如果前者大于后者---交换
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void main1(String[] args) {
        int[] arr = {2,5,3,8,2,1,10,4};
        bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 优化：若数组有序
     *
     * 每一趟完成后，去看看，是否已经有序了，
     * 如果某一趟已经有序了，就不需要剩下的趟数了
     */

    public static void bubbleSort(int[] array){
        //趟数执行len - 1;

        for (int i = 0; i < array.length -1 ; i++) {
            boolean flag = false;//没有发生交换
            //趟数每次较上一次少1
            for (int j = 0; j < array.length - 1 -i; j++) {

                //如果前者大于后者---交换
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;//交换后为true
                }
            }

            if(flag == false){
                break;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {2,5,3,8,2,1,10,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


