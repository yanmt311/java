/**
 * 调用顺序表中的各种方法
 */
public class main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        for (int i = 0; i < 10; i++) {
            myArrayList.add(i,i);
        }
        myArrayList.display();

        myArrayList.add(0,90);
        myArrayList.add(9,99);
        myArrayList.display();

        System.out.println(myArrayList.contains(7));

        System.out.println(myArrayList.search(6));

        System.out.println(myArrayList.getPos(5));

        myArrayList.remove(4);
        myArrayList.display();

        System.out.println(myArrayList.size());

        myArrayList.clear();
        myArrayList.display();

    }
}










