/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-18
 * Time: 9:10
 */
class Person {
    private String name;
    private int age;

    public static int count  = 0;

    static {
        //this.name = "zhangfei";  不能访问非静态的数据成员
        count=99;
        System.out.println("静态代码块........");
    }


    {
        /*this.name = "zhangfei";
        count=99;*/
        System.out.println("实例代码块.......");
    }

    public Person() {
        //this("caocao",18);
        //this("zhangfei");只能调用一个
        System.out.println("Person<init>");
    }

    //alt+(f12)insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }

    public static void func() {
        count=99;
        //this.name = "caocao";
    }


    public void eat() {
        System.out.println(this.getName());
        System.out.println(this.age);
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo {


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.eat();
        person1.eat();
        System.out.println(person1.getName());

        new Person().eat();
        new Person().getName();
    }

    public static void main2(String[] args) {
        System.out.println(Person.count);
        /*Person person1 = new Person();
        System.out.println("==============");
        Person person2 = new Person();*/
    }
    public static void main1(String[] args) {
        Person person1 = new Person();
       /* System.out.println(person1);
        Person person2 = new Person("bit",19);
        System.out.println(person2);*/
    }
}
