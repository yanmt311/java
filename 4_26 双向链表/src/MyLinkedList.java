/**
 * 双向无头链表
 */
class Node{
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    public Node tail;

    /**
     * 1、头插法
     * @param data
     */
    public void addFirst(int data){
        Node node = new Node(data);
        //判断是不是第一次头插 -- 第一次头插
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            //不是第一次头插
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    /**
     * 2、打印链表
     */
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur =cur.next;
        }
        System.out.println();
    }

    /**
     * 3、尾插法
     * @param data
     */
    public void addLast(int data){
        Node node = new Node(data);
        //判断是不是第一次尾插 -- 第一次尾插
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        //不是第一次尾插
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }

    /**
     *   4、查找是否包含关键字key是否在单链表当中
     */
    public boolean contains(int key){
        Node cur = this.head;
        while(cur.next != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 5、得到单链表的长度
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
     * @param index
     */
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    private Node searchIndex(int index){
        Node cur = this.head;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        //判断index的合法性
        checkIndex(index);

        //判断是不是第一次插入--头插法
        if(index == 0){
            this.addFirst(data);
            return;
        }

        //如果不是第一次插入，判断是不是尾插
        if(index == this.size()){
            this.addLast(data);
            return;
        }

        //中间位置插入
        Node cur = searchIndex(index);
        Node node = new Node(data);

        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }


    /**
     *  7、删除第一次出现关键字为key的节点---找到返回删除的数字，找不到返回-1
     */
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                //删除的节点为头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        //删除中间节点
                        cur.next.prev = cur.prev;
                    }else{
                        //删除尾节点
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    public int remove1(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;

                if(cur == this.head) {
                    //删除的节点为头节点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur == this.tail){
                    //删除尾节点
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                }else{
                    //删除中间节点
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }


    /**
     * 8、删除所有值为key的节点
     */

   public void removeAllKey(int key){
       Node cur = this.head;
       while (cur != null) {
           if(cur.data == key) {
               int oldData = cur.data;
               //删除的节点为头节点
               if(cur == this.head) {
                   this.head = this.head.next;
                   if(this.head != null){
                       //否则会空指针异常
                       this.head.prev = null;
                   }
               }else {
                   cur.prev.next = cur.next;
                   if(cur.next != null){
                       cur.next.prev = cur.prev;
                   }else{
                       this.tail = cur.prev;
                   }
               }
           }
           cur = cur.next;
       }
   }


    /**
     * 9、释放内存--- 一个一个节点进行释放
     */
    public void clear(){
        while(this.head != null){
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }
}
