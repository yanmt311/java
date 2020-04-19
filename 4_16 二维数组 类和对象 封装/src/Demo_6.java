/**
 * 理解静态成员变量 和 实例化成员变量
 *
 * 静态成员变量 只有一份
 * 实例化成员变量  有多个对象
 *
 * 1、静态方法不能直接使用非静态数据成员或调用非静态方法(非静态数据成员和方法都是和实例相关的).
 * 2、this和super两个关键字不能在静态上下文中使用(this 是当前实例的引用, super是当前实例父类实例的引用, 也
 * 是和当前实例相关).
 */
class Test{
    public int a;
    public static int count;
}


public class Demo_6 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);
        System.out.println(Test.count);

        System.out.println("-----------------------");

        Test t2 = new Test();
        t2.a++;//1 -- 每new一次，成员变量都有一份
        Test.count++;// -- 静态成员变量在方法区 ，只有一份
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
}
