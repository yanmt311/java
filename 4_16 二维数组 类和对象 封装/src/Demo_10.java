/**
 * 如何提供公开接口
 */
class Student1{

    //封装 -- 只能在类中进行访问，类外不能访问
    private String MyName;
    private int age;

    //提供公开的接口  ---alt + insert +set get
    public String getMyName(){
        return MyName;
    }

    public void setMyName(String name){
        MyName = name;
    }

    //注意：结果为null
    public void setMyName1(String MyName){
        // MyName = MyName;//其实就是自己给自己赋值，并没有赋值属性，局部变量优先
        this.MyName = MyName;//this代表当前对象的引用 --即当前Student1 的MyName
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public  void  test(){
        System.out.println("test!");
    }

    public void show() {
        System.out.println("我叫" + this.MyName + ", 今年" + this.age + "岁");
    }



    /**
     *  alt+insert +toString
     *
     *  重新实现了一个Object的toString方法
     *  Object是所有类的父类
     * @return
     */
    @Override //这个注解代表这个方法是重新写的
    public String toString() {
        return "Student1{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo_10 {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.getMyName();
        student.setMyName("YMT");

        student.getAge();
        student.setAge(9);

        //打印1
        String str = student.getMyName();
        System.out.println(str);
        //打印2
        System.out.println(student.getMyName());


        int a = student.getAge();
        System.out.println(a);

        System.out.println(student.getAge());

       student.show();
       //打印3
        /**
         * public void println(Object x) {
         *         String s = String.valueOf(x);
         *         synchronized (this) {
         *             print(s);
         *             newLine();
         *         }
         *     }
         */
       System.out.println(student);//打印出来类似一个数组

    }

}
