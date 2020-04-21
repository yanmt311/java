/**
 *11、考点：构造方法的调用
 */

public class Demo_8{

    private int count;

    public static void main(String[] args) {

        Demo_8 test=new Demo_8(88);//调用了一个含参的Demo_8方法

        System.out.println(test.count);

    }

    Demo_8(int a) {

        count=a;

    }

}

