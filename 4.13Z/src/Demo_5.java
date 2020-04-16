import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * 作业标题
 * 奇数位于偶数之前
 *
 * 作业内容
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 *
 */
public class Demo_5 {
    public static void adjustOrder(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1;j < arr.length; j++){
                if(arr[j]%2 != 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,9,34,56};
        System.out.println(Arrays.toString(arr));
        adjustOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
