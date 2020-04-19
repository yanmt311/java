
//1


class Test {
    //静态成员方法
    public static void hello() {
        System.out.println("hello");
    }


}
public class Demo_1 {


    public static void main(String[] args) {


        // TODO Auto-generated method stub

        //创建了一个空对象
        Test test=null;
        test.hello();

        Test.hello();
    }
}


