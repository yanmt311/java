/**
 * 构造方法
 * 1、构造方法的方法名 和 类名相同
 * 2、没有返回值
 * 3、构造方法不止一个 -- 可以和重载进行理解
 *
 * 注意：1、当没有提供构造方法的时候，编译器会自动提供一个，不带有参数的构造方法
 *      2、当已经提供了构造方法，编译器就不会自动生成一个构造方法。
 *
 * 构造方法的作用：实例化一个对象（构造一个对象）。
 *
 * 一个对象的产生分为几步，如何产生？
 *  答：1、为对象分配内存
 *      2、调用合适的构造方法
 *
 *
 * 面试问题：this这个关键字代表对象，对不对，为什么？
 *  答：不对，this代表当前对象的引用，
 *     因为一个对象的产生有两步，1、为对象分配内存，2、调用合适的构造方法
 *     在第二步构造方法中已经使用了this这个关键字
 *
 * this的作用：
 * 1、this() : --调用自己的构造方法
 * 2、this.data: --调用自己当前对象的属性
 * 3、this.func(): --调用自己当前对象的方法
 *
 * 注意：只有在构造方法里面写
 *      只能调用一次
 *      只能写在第一行
 *      习惯使用this
 *
 *
 * 构造方法支持重载
 *
 * 重载：1、方法名相同
 *      2、参数列表不同
 *      3、返回值不做要求
 *      4、在同一个类中
 *
 */
class Person{
    private String name;
    private int age;
    // this的作用
    public void eat() {

        //this("abc",12);//error 只有在构造方法里面写

        //调用自己当前对象的属性
        this.name = name;
        this.age = age;
        //调用自己当前对象的方法
        this.setName("abc");
    }
    //创建一个构造方法
    public Person(){
        //调用自己的构造方法
        //注意：1、只有在构造方法里面写
        //     2、只能调用一次
        //     3、只能写在第一行
        //     4、习惯使用this

        //System.out.println("hehe");//error 只能写在第一行
        //this(12);//只能调用一次 ---调用这个，就不能调用另一个
        this("abc",12);
        System.out.println("hehe");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    //创建toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    //创建get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo_1 {

    public static void main(String[] args) {
        //调用构造方法
        Person per1 = new Person();
        Person per2 = new Person("YMT",19);
        Person per3 = new Person("Ymt");
        Person per4 = new Person(20);

        per2.getAge();
        per2.getName();
        per2.setAge(17);
        per2.setName("mt");


        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);

    }

}
