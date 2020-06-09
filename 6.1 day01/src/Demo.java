

import java.util.*;

public class  Demo {
    public int findKth(int[] a, int n, int K) {
        return quickSort(a,0,n-1,K);
    }

    public int quickSort(int[] arr,int low, int high,int K) {
        int p = partion(arr, low, high);

        if (K == p - low + 1) {
            return arr[p];
        } else if (K < p - low + 1) {
            return quickSort(arr, low, p - 1, K);
        } else {
            return quickSort(arr, p + 1, high, K - (p - low + 1));


        }
    }
        public int partion(int[] arr,int low,int high){
            int temp = arr[low];

            while(low < high){
                while(low < high && arr[high] <= temp){
                    high--;
                }

                if(low == high){
                    break;
                }else{
                    arr[low] = arr[high];
                }

                while(low < high && arr[low] >= temp){
                    low++;
                }

                if(low == high){
                    break;
                }else{
                    arr[high] = arr[low];
                }

            }

            arr[low] = temp;
            return low;
        }
    }

