/**
 * 实现交换两个变量的值，要求：交换两个实参的值
 */

//方法1：private
//class MyValue{
//
//    private int val;
//
//    //获取get set
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//}
//
//public class Demo_2 {
//    public static void swap(MyValue myValue1,MyValue myValue2){
//
//        int temp = myValue1.getVal();
//        myValue1.setVal(myValue2.getVal());
//        myValue2.setVal(temp);
//    }
//    public static void main(String[] args) {
//        //创建两个对象
//        MyValue myValue1 = new MyValue();
//        MyValue myValue2 = new MyValue();
//
//        //设置两个value值 --- 用set
//        myValue1.setVal(12);
//        myValue2.setVal(20);
//
//        //打印value --- 用get
//        System.out.println(myValue1.getVal());
//        System.out.println(myValue2.getVal());
//
//        System.out.println("----------------------------");
//        swap(myValue1,myValue2);
//
//        System.out.println(myValue1.getVal());
//        System.out.println(myValue2.getVal());
//    }
//}


//方法2：public
class MyValue{
    public int val;
}

public class Demo_2 {
    public static void swap(MyValue myValue1,MyValue myValue2){
        int temp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = temp;
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.val = 10;
        myValue2.val = 20;

        System.out.println(myValue1.val);
        System.out.println(myValue2.val);

        System.out.println("------------------------");
        swap(myValue1,myValue2);

        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }
}