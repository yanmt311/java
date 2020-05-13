/**
 * 泛型的意义:
 *1-- 可以自动及逆行类型的检查
 *2-- 可以自动及逆行类型的转换
 *
 */
class Person{

}
public class TestMain2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);//Person@1540e19d --- 类型+地址

        System.out.println("----------------------------------");

        MyArrayList2<String> myArrayList2 = new MyArrayList2<>();
        System.out.println(myArrayList2);//MyArrayList2@677327b6 -- 省略了<String>--只在编译中参与,运行中已经擦除
    }
    public static void main1(String[] args) {
        MyArrayList2<String> myArrayList2 = new MyArrayList2<>();
        //由于为Object，所以可以为任意类型，但是需要进行强转 所以引入泛型
        myArrayList2.add("hello");
        myArrayList2.add("ss");

        MyArrayList2<Integer> myArrayList3 = new MyArrayList2<>();
        myArrayList3.add(1);

        String val = myArrayList2.getVal(1);//本来一号位置就是整形，现在还要强制为转型
        System.out.println(val);
    }
}
