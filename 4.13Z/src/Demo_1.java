/**
 * 作业标题
 * 找出出现一次的数字
 *
 * 作业内容
 * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 *  a^0 == a;a^a == 0
 */
public class Demo_1 {
    public static void findNum(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,9,3,4,4};
        findNum(arr);
    }
}

