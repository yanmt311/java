public class TestMain {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        int val = myArrayList.getVal(1);
        System.out.println(val);
    }
}
