/**
 * 6、考点：私有成员变量，只能在类中使用，不能在类外使用
 */
public class Demo_6{

    private String name = "Person";

    int age=0;

}
class Child {

    public String grade;

    public static void main(String[] args){

        Demo_6 p = new Demo_6();

        System.out.println(p.age);
        //name封装了，不能在类外使用
        //System.out.println(p.name);

    }

}

