public class main {
    public static void main(String[] args) {
        //创建对象
        MyLinkedList myLinkedList = new MyLinkedList();

        //1
        myLinkedList.addFirst(12);

        //2
        myLinkedList.display();

        //3
        myLinkedList.addLast(99);
        myLinkedList.display();

        //4
        //第一种
        boolean flag = myLinkedList.contains(12);
        System.out.println(flag);
        //第二种
        System.out.println(myLinkedList.contains(99));

        //5
        System.out.println(myLinkedList.size());


    }
}
