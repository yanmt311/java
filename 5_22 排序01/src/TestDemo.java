
public class TestDemo {
    public static void shell(int[] array,int gap) {
        int len = array.length;
        for (int i = gap; i < len; i++) {
            int temp = array[i];
            for (int j = i-gap; j >=0 ; j = j - gap) {
                if (array[j] > temp) {
                    array[j + gap] = array[j];

                } else {
                    break;
                }
                array[j + gap] = temp;
            }
        }

    }

    public static  void  shellSort(int[] array) {

        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }



    public static void selectSort(int[] array){
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

    }

}
