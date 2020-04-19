import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 类和对象
 *
 * 面试问题;OOP语言（面向对象编程）的三大特征：封装性、继承性、多态性。
 *
 * 1、封装性：封装是指将一个计算机系统中的数据以及与这个数据相关的一切操作语言组装到一起，
 *          一并封装在一个有机的实体中，把它们封装在一个“模块”中，也就是一个类中，为软件
 *          结构的相关部件所具有的模块性提供良好的基础。
 *
 * 2、继承性：是面向对象技术中的另外一个重要特点，其主要指的是两种或者两种以上的类之间的联
 *          系与区别。继承，顾名思义，是后者延续前者的某些方面的特点，而在面向对象技术则是
 *          指一个对象针对于另一个对象的某些独有的特点、能力进行复制或者延续。
 *
 * 3、多态性：从宏观的角度来讲，多态性是指在面向对象技术中，当不同的多个对象同时接收到同一
 *            个完全相同的消息之后，所表现出来的动作是各不相同的，具有多种形态；
 *
 *          从微观的角度来讲，多态性是指在一组对象的一个类中，面向对象技术可以使用相同的调
 *          用方式来对相同的函数名进行调用，即便这若干个具有相同函数名的函数所表示的函数是
 *          不同的。
 *
 * 类：自定义类型
 * 对象：实体---是一类对象的统称。对象就是这一类具体化的一个实例。
 * 面向对象：思考问题的一种思考方式，是一种思想。比如：概念与实例。理论与实践。名和实等等。
 *
 *      // 创建类
 *      class <class_name>{  
 *         field;//成员属性
 *         method;//成员方法
 *      }
 *      // 实例化对象
 *     <class_name> <对象名> = new <class_name>();
 *
 *
 * 访问修饰限定符：
 * public：公有的
 * private：私有的
 * protecte：受保护的
 * 什么都不写---默认权限---访问权限
 *
 */

/**
 * 1、如何访问实例成员变量
 * 2、如何访问实例成员方法
 * 3、访问实例成员初始化问题
 */
class Person{

    /**
     * 成员变量定义在方法外边，类的里边
     * 字段 --- 成员变量 ---属性
     * 实例成员变量在对象里面 -- 对象在堆上
     *
     * 实例成员没有初始化，默认值为对应的0值
     *
     * 引用类型 默认为 null
     * 简单类型 默认为 0
     * boolean -- false
     * char -- '\u0000'  --- 空格
     * double -- 0.0
     *
     *
     * 一般不在这进行实例化成员变量的初始化
     */
    public String  name = "YMT";
    public int age = 24;
    public char ch;
    public boolean flag;


    /**
     * 没有加static 称实例成员方法
     */
    //方法 --- 成员方法 --- 行为
    public  void eat(){
        int a = 10;//局部变量必须初始化才可以使用,局部变量和变量名（引用）放在栈中
        System.out.println("eat!");
    }

    public void sleep(){
        System.out.println("sleep!");
    }

}


public class Demo_4 {
    /**
     * 实例成员方法如何调用
     * @param args
     */
    public static void main(String[] args) {
        Person per = new Person();
        per.eat();
        per.sleep();
    }



    /**
     * 如何访问对象当中的实例成员变量
     *
     * 对象的引用（变量名）.成员变量
     * @param args
     */
    public static void main2(String[] args) {

        Person per = new Person();
        /**
         * 一般实例化成员在这赋值
         */
        per.name = "Hello";
        per.age = 14;

        System.out.println(per.age);
        System.out.println(per.name);
        System.out.println(per.ch);
        System.out.println(per.flag);
    }



    /**
     * 一个类可以产生多个对象
     * 实例化一个对象  ---通过关键字new
     */
    public static void main1(String[] args) {

        Person per1 = new Person();
        Person per2 = new Person();
        Person per3 = new Person();
        Person per4 = new Person();
        Person per5 = new Person();

    }
}
