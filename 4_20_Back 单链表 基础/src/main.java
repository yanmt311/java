public class main {
    public static void main(String[] args) {
        //创建一个MyLinkedList对象
        MyLinkedList myLinkedList = new MyLinkedList();

        //测试单链表的各个成员方法
        //实例成员方法：变量名.调用的方法
        //静态成员方法：类名.调用的方法

        /**
         * 1、头插法测试 -- 逆序打印
         */
        myLinkedList.addFirst(66);
        myLinkedList.addFirst(77);
        myLinkedList.addFirst(88);
        myLinkedList.addFirst(99);

        myLinkedList.display();//打印 99 88 77 66 --- 由于头插入再前面插入

        /**
         *3、尾插法测试 --顺序打印
         */
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(14);
        myLinkedList.addLast(15);
        myLinkedList.addLast(16);

        myLinkedList.display();

        /**
         * 4、查找是否包含关键字key是否在单链表当中测试
         */
        //打印1：
        boolean flag = myLinkedList.contains(15);
        System.out.println(flag);

        //打印2：
        System.out.println(myLinkedList.contains(100));


        /**
         * 5、得到单链表的长度
         */
        System.out.println(myLinkedList.size());


        /**
         * 6、任意位置插入,第一个数据节点为0号下标测试
         */
        myLinkedList.addIndex(0,9);
        myLinkedList.addIndex(6,10001);
        myLinkedList.addIndex(12,2000);
        myLinkedList.display();

        /**
         * 7、删除第一次出现关键字为key的节点测试
         */
        myLinkedList.remove(11);
        myLinkedList.display();

        /**
         * 8、删除所有值为key的节点
         */
        myLinkedList.removeAllKey(2000);
        myLinkedList.display();

        /**
         * 9、清空单链表
         */
        System.out.println("--------------------");
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }
}
