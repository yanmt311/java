
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int i=0;
        //为了能在本地IDE上面运行，需要加上一个终止条件。输入stop循环终止
        while(!scanner.hasNext("stop") ){
            a[i] = scanner.nextInt();
            i++;
        }
        int[] arr = new int[--i];
        System.arraycopy(a,0,arr,0,i);
        Arrays.sort(arr);//数组排序
        for(int j=0; j<a[i]; j++){
            if(j == a[i]-1){
                System.out.print(arr[j]);
            }else{
                System.out.print(arr[j] + " ");
            }
        }
    }
}