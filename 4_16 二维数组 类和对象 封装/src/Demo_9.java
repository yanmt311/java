/**
 * 封装：private修饰的
 */
class Student{
    public String name;
    public int age;

    //封装 -- 只能在类中进行访问，类外不能访问
    private String name1;
    private int age1;

    public  void  test(){
        System.out.println("test!");
    }

    public void show() {
    System.out.println("我叫" + name1 + ", 今年" + age1 + "岁");
    }

}
public class Demo_9 {
    public static void main(String[] args) {

        //静态方法中访问实例成员变量
        Student student = new Student();
        student.name = "YMT";
        student.age = 18;
        System.out.println(student.name);
        System.out.println(student.age);

        //private不能再类外访问
        //System.out.println(student.name1);
        //System.out.println(student.age1);

    }

}
