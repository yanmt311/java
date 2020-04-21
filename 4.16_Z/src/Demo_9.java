/**
 * 12、考点：静态的按出现顺序依次执行
 */

public class Demo_9{
    static int cnt = 6;//6

    static{
        cnt += 9;//15
    }

    public static void main(String[] args){

        System.out.println("cnt =" + cnt);//5

    }

    static{
        cnt /=3;//5
    };
}

