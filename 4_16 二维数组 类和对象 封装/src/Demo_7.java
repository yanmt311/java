/**
 *静态成员变量 如何访问 实例成员变量
 *
 * 同一工程不能建立相同的类名 均为class Test{}
 */
class Test1{
    public  void func(){
        System.out.println("dadada");
    }
    public static void func1(){
        System.out.println("hehehe");
    }
}
public class Demo_7 {
    public static void main(String[] args) {
        /**
         * 静态方法不能直接使用非静态数据成员或调用非静态方法
         * (非静态数据成员和方法都是和实例相关的).
         */
        //func();//error
        Test1.func1();

        //静态成员变量 如何访问 实例成员变量
        Test1 test = new Test1();
        test.func();

    }
}
