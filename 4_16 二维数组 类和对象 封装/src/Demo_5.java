/**
 * 1、如何访问静态成员变量
 * 2、如何访问静态成员方法
 * 3、访问静态成员初始化问题
 */
class Person1{
    /**
     * 静态成员变量在方法区
     *
     * 不初始化依旧默认为 对应的0值
     *
     * 静态成员变量不等于对象，存放在方法区
     */

    public static int size = 10;
    public static int size1;

    /**
     * 加static 称静态成员方法
     */
    public static void eat(){
        int a = 10;//局部变量必须初始化才可以使用
        System.out.println("eat!");
    }

    public static void sleep(){
        System.out.println("sleep!");
    }


}

public class Demo_5 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Person1 per = new Person1();
        Person1.eat();
        Person1.sleep();

    }

    public static void main1(String[] args) {
        /**
         * 如何访问静态成员变量
         *
         * 类名.静态成员变量
         */
        Person1 per = new Person1();
        System.out.println(Person1.size);
        System.out.println(Person1.size1);

        /**
         * 静态成员变量内部不能访问非静态成员变量,
         * 非静态可以访问静态成员变量
         */
        //System.out.println(Person1.name); -- error
    }
}
