public class Test {
    public static void main(String[] args) {
        /**
         * 1、头插法
         */
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.display();
        System.out.println("-----------------------");
        /**
         * 3、尾插法
         */
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.display();
        System.out.println("-----------------------");


        /**
         * 4、查找是否包含关键字key是否在单链表当中
         */
        System.out.println(myLinkedList.contains(5));
        System.out.println("-----------------------");


        /**
         * 5、得到单链表的长度
         */
        System.out.println(myLinkedList.size());
        System.out.println("-----------------------");


        /**
         * 6、任意位置插入,第一个数据节点为0号下标
         */
        myLinkedList.addIndex(0,99999);
        myLinkedList.display();
        myLinkedList.addIndex(7,9999);
        myLinkedList.display();
        myLinkedList.addIndex(4,999999);
        myLinkedList.display();
        System.out.println("-----------------------");


        /**
         * 7、删除第一次出现关键字为key的节点
         */

        myLinkedList.remove1(99999);
        myLinkedList.display();
        myLinkedList.remove1(9999);
        myLinkedList.display();
        myLinkedList.remove1(999999);
        myLinkedList.display();
        System.out.println("-----------------------");

        myLinkedList.remove(4);
        myLinkedList.display();
        myLinkedList.remove(6);
        myLinkedList.display();
        myLinkedList.remove(2);
        myLinkedList.display();
        System.out.println("-----------------------");

        /**
         * 8、删除所有值为key的节点
         */
        myLinkedList.addFirst(2);
        myLinkedList.display();
        myLinkedList.addFirst(2);
        myLinkedList.display();
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.addIndex(3,2);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
        System.out.println("-----------------------");


        /**
         * 9、释放内存
         */
        myLinkedList.clear();
        System.out.println("ahahhahah");
        myLinkedList.display();
        System.out.println("-----------------------");

    }
}
