/**
 * 13、考点、匿名对象的引用
 */
class Test1{

    public String toString() {

        System.out.print("aaa");

        return "bbb";

    }

}
public class Demo_10 {
    public static void main(String[] args) {

        System.out.println(new Test1());//匿名对象
    }

}
