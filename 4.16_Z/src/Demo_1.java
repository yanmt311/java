
/**
 * 1、考点：
 *     1、static，创建空对象，可以进行打印；
 *     2、不加static，创建空对象，编译失败，产生空指针异常
 *     3、静态不依赖对象，实例依赖对象，且不能为空
 *         
 * 
 */


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
        test.hello();//有警告

        Test.hello();//正确方式
    }
}


