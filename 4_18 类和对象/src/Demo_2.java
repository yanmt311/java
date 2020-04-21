import javax.imageio.plugins.jpeg.JPEGImageReadParam;

/**
 * 代码块：1、实例代码快/构造代码块
 *        2、静态代码块
 *        3、本地代码块
 *
 * 注意：1、静态的内容，只能被执行一次，且是最早被执行的
 *      2、如果静态成员变量、静态方法都是静态的，根据其定义的先后顺序进行访问
 *      3、静态的方法和静态的成员是不依赖于对象的，可以直接由-- 类名.静态成员变量/静态成员方法 --进行访问静态成员变量/静态成员方法
 *         如果静态方法里面访问了实例成员变量，那么这个实例成员变量/方法是依赖对象的，但是静态成员变量/方法不依赖。
 *
 *         访问静态成员变量/静态成员方法：类名.静态成员变量名/静态成员方法名
 *         访问实例成员变量/实例成员方法：对象的引用.静态成员变量名/静态成员方法名 --- 必须创建一个对象Student stu = new Student();
 *
 *
 */
class Student{

    /**
     * 实例成员变量和静态成员变量
     */
    public String name;
    public int age;
    public static String sex;

    public void sleep(){
        System.out.println("sleep()!");
    }

    public static void eat(){
        System.out.println("eat()!");
    }

    /**
     * 静态成员方法中不能访问实例成员变量
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static{

        //this.name = "abc";
        //name = "ccc";
    }

    /**
     * 验证Static
     */
    public static int count  = 0;

    static {
        count=99;
        count1 = 88;
    }
    public static int count1  = 0;

    /**
     * 代码快
     */
    static{
        System.out.println("静态代码块------------");
    }

    {
        System.out.println("实例代码快/构造代码块-------------");
    }

    public Student() {
        {
            System.out.println("本地代码块------------");
        }
    }
}
public class Demo_2 {

    /**
     * 实例成员变量和静态成员变量的访问
     */
    public static void main(String[] args) {
        //实例成员变量和方法
        Student stu = new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.sleep();

        //静态成员变量和方法
        System.out.println(Student.sex);
        Student.eat();
    }

    /**
     * 验证如果静态成员变量、静态方法都是静态的，根据其定义的先后顺序进行访问
     */
    public static void main2(String[] args) {
        System.out.println(Student.count);//打印99
        System.out.println(Student.count1);//打印0

    }
    /**
     * 静态内容，只会被执行一次，且是最早被执行的
     */
    public static void main1(String[] args) {
       Student stu = new Student();
       System.out.println("-----------------");
       Student stu1 = new Student();

    }
}
