import java.util.Stack;

/**
 * 快速排序
 */


public class TestDemo {
    public static void swap(int[] array,int x,int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[high]
        int mid = (left + right) /2;
        if(array[left] <= array[mid]){
            swap(array,left,mid);
        }
        if(array[left] >= array[right]){
            swap(array,left,right);
        }
        if(array[mid] >= array[right]){
            swap(array,mid,right);
        }

    }

    public static int partition(int[] array,int low,int high) {
        int temp = array[low];
        while (low < high) {
            //坑：没有等号 --- 即就会造成死循环
            while (low < high && array[low] <= temp) {
                low--;
            }
            array[high] = array[low];
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
        }

        //左和右相遇时，将temp的值存放在相遇的位置
        array[high] = temp;
        return high;
    }

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        int par = partition(array,left,right);
        //递归左
        quick(array,left,par - 1);
        //递归右
        quick(array,par + 1,right);

    }
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);
    }


    /**
     * 非递归
     * @param array
     */
    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;

        int par = partition(array,left,right);

        if(par > left+1) {
            stack.push(left);
            stack.push(par - 1);
        }
        if(par < right-1) {
            stack.push(par + 1);
            stack.push(right);
        }
        while(!stack.empty()){
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);


            if(par > left+1) {
                stack.push(left);
                stack.push(par - 1);
            }
            if(par < right-1) {
                stack.push(par + 1);
                stack.push(right);
            }
        }

    }
}
