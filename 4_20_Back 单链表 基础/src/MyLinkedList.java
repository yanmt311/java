import com.sun.corba.se.impl.encoding.CDROutputObject;

import javax.swing.plaf.IconUIResource;

/**
 * 单链表
 * 1、单链表由节点组成，节点由数值域和下一个节点的引用域组成。
 * 2、不带头节点的单向非循环链表
 *    带头节点的单向非循环链表
 *    带头节点的单向循环链表
 * 3、每一个节点都是一个对象
 * 4、假设 每个节点的引用（地址） --- Node类型
 *      即int data
 *       Node next
 *    头节点也为引用 --- Node head
 *
 *   Node需要抽象化 -- 成员属性 --data，next
 *                    构造方法 --data（由于一般设）
 *                              data，next
 *                              无参
 * 5、要想遍历完单链表, 就要cur != null
 *    不打印最后一个 用cur.next
 *    如果只是想停在最后一个节点的话, 就是cur.next != null
 *    cur里面存放的是当前节点的地址,
 *    cur.next里面存放的是当前节点下一个节点的地址
 *    注意：将链表遍历完 用cur ！= null
 *         将链表遍历到最后一个节点，用cur.next != null
 */

//抽象节点类
class Node{
    public int data;
    public Node next;

    //构造方法 -- 初始化成员变量 -- 实例化一个对象
    //不知道节点的地址，默认为null 所以只传data值
    public Node(int data) {
        this.data = data;
        this.next = null;//也可不要
    }
}

//抽象单链表
//包含--成员属性：头节点
//      成员方法：

public class MyLinkedList {

    //成员属性
    public Node head;//保存单链表的头节点的引用

    //成员方法

    /**
     * 1、头插法
     *
     * 分析：1、创建一个节点对象
     *      2、如果第一次插入头节点：本来head = null ，现在需要将head头指向创建的节点
     *      3、如果不是第一次创建头节点：
     *         a:首先需要和后面进行绑定，即将创建的节点下一个节点的引用域null 变成下一个将要连接的原先的的头地址（引用）
     *             this.next = this.head
     *         b:再将插入的节点变为现在的头节点
     *             this.head = node
     * @param data
     */
    public void addFirst(int data){

        //创建了一个数值域为data ，下一个节点域为null的节点（节点名：node）
        Node node = new Node(data);

        if(this.head == null){
            //第一次插入头节点
            this.head = node;
            return;
        }

        //若不是第一次插入头节点，需要先绑定后面，否则会造成自身死循环
        node.next = this.head;
        this.head = node;

//        //自身死循环
//        this.head = node;
//        node.next = this.head;


    }

    /**
     * 2、打印单链表
     *
     * 分析：1、一般成员变量不会变，所以创建一个变量存头的引用 Node cur = this.head
     *      2、然后依次往后遍历 cur = cur.next
     *      3、当遍历到最后一个元素时，cur == null ，即循环条件为cur ！= null
     *      4、打印其节点的数值域
     *
     */

    public void display(){
        //创建一个存放头引用null的变量
        Node cur = this.head;

        //遍历节点
        while(cur != null){
            System.out.print(cur.data + " ");
            //下个引用赋值给当前引用，即下一个节点的地址赋值给当前的地址，以此从头往后依次进行遍历
            cur = cur.next;
        }
        System.out.println();
    }



    /**
     * 2、尾插法
     *
     * 分析：1、创建一个变量存放头引用，为了遍历找最后一个节点，最后一个节点cur = null
     *      2、插入一个节点，创建一个节点。
     *      2、将最后一个节点的null引用，变为插入的node引用 cur.next = node
     *      3、如果第一次尾插入，跟第一次头插入一样
     */
    public void addLast(int data){
        //创建一个变量存放头引用
        Node cur = this.head;

        //创建一个节点，进行尾插
        Node node = new Node(data);

        //如果是第一次尾插操作
        if(this.head == null){
            this.head = node;
            return;
        }

        //如果不是第一次尾插操作
        //遍历寻找最后一个节点
        while(cur.next != null){
            cur = cur.next;
        }

        //找到最后一个节点进行尾插操作
        cur.next = node;
    }




    /**
     * 4、查找是否包含关键字key是否在单链表当中
     *
     * 分析：1、创建一个变量存放头引用
     *      2、判断cur是否为空，为空则没有找到相应的key
     *      3、若没有遍历完，每遍历一次判断一下key是否和cur.data相等，若相等返回true，否则继续遍历：cur = cur.next
     */

    public boolean contains(int key){
        //遍历
        Node cur = this.head;

        //若cur为空，可以找到最后一个数值域，若cur.next为空，则找不到最后一个数值域
        while(cur != null){
            if(key == cur.data){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }



    /**
     * 5、得到单链表的长度
     *
     *分析：1、创建一个变量存放头引用
     *     2、每遍历一次count++，直到cur == null
     *
     *     注意：将链表遍历完 用cur ！= null
     *          将链表遍历到最后一个节点，用cur.next != null
     * @return
     */
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }




    /**
     * 6、任意位置插入,第一个数据节点为0号下标
     *
     * 分析：题目要求在index位置插入data的一个node节点
     *     1、首先判断index是否为头插法(index == 0)和尾插法(index == this.size())
     *     2、如果不是头插也不是尾插，寻找index的前一个节点的引用，写成函数searchIndex() -- 返回类型为Node
     *     3、进行插入 即先绑定后面的  node.next = cur.next  cur.next = node
     */

    public void addIndex(int index,int data){
        Node node = new Node(data);

        //头插法
        if(index == 0){
            this.addFirst(data);
            return;
        }

        //尾插法
        if(index == this.size()){
            this.addLast(data);
            return;
        }

        //寻找index的前一个节点的地址
        Node cur = searchIndex(index);

        //进行任意位置的插入
        node.next = cur.next;
        cur.next = node;
    }

    private Node searchIndex(int index){
        //1、index位置合法性的判断
        if(index < 0 || index > size()){
            throw new  RuntimeException("index位置不合法");
        }

        //寻找index前一个节点
        Node cur = this.head;
        while(index - 1 != 0){
            cur = cur.next;
            index--;
        }
//        for (int i = 0; i < index - 1; i++) {
//            cur = cur.next;
//        }
        return cur;
    }

    /**
     * 7、删除第一次出现关键字为key的节点
     */
    //遍历寻找删除节点的前驱
    private Node searchPrev(int key){
        //定义prev节点指向头节点
        Node prev = this.head;
        //遍历停在最后一个节点即prev.next！=null
        while(prev.next != null){
            //prev.next.data == key找到前驱
            if(prev.next.data == key){
                return prev;
            }else{
                //没找到前驱，继续遍历
                prev = prev.next;
            }
        }

        //遍历结束，没有key，即没有要删除的节点
        return null;
    }

    public void remove(int key){
        //判断头节点是否为空
        if(this.head == null){
            return;
        }

        //删除头节点
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }

        //删除其他节点
        //1、遍历寻找删除节点的前驱
        Node prev = searchPrev(key);
        if(prev == null){
            System.out.println("遍历完，没有这个节点！");
            return;
        }
        //2、进行删除操作
        Node cur = prev.next;//cur为删除的节点
        prev.next = cur.next;

    }

    /**
     * 8、删除所有值为key的节点
     */
    public void removeAllKey(int key){
        //创建两个节点
        //prev --- 代表要删除的key的前驱
        //cur --- 代表要删除的节点
        Node prev = this.head;
        Node cur = prev.next;

        //遍历链表寻找key进行删除
        while(cur != null){
            //若两个key紧挨
            if(cur.data == key){
                prev.next = cur.next;
                cur = cur.next;//只移动cur，防止删除后依旧紧挨
            }else{
                //若没有紧挨着的key
                prev = cur;
                cur = cur.next;
            }

            //若头中有删除的元素
            if(this.head.data == key){
                this.head.next = this.head;
            }
        }
    }


    /**
     * 9、清空单链表
     */
    public void clear(){
        this.head = null;
    }
}
