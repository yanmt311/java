/**
 * 3
 */


public class Demo_3 {

    public int aMethod(){
        //static int i = 0;
        int i = 0;
        i++;
        return i;
    }


    public static void main(String args[]){
        Demo_3 test = new Demo_3();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }

}

