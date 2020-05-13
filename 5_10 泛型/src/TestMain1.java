public class TestMain1 {
    public static void main(String[] args) {
        MyArrayList1 myArrayList1 = new MyArrayList1();
        //由于为Object，所以可以为任意类型，但是需要进行强转 所以引入泛型
        myArrayList1.add("hello");
        myArrayList1.add('q');


        int val = (int)myArrayList1.getVal(1);//本来一号位置就是整形，现在还要强制为转型
        System.out.println(val);
    }
}
