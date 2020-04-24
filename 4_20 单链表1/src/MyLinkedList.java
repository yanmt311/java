
class Node{
    public int data;//代表数据
    public Node next;//代表引用

    //构造方法 --- 类似于初始化成员变量
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    //保存单链表的头节点的引用
    public Node head;

    //1、头插法
    public void addFirst(int data){
        //创建一个对象
        Node node = new Node(data);

        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return ;
        }
        node.next = this.head;
        this.head = node;

    }

    //2、打印
    public void display(){
        Node cur = this.head;

        if(cur != null){
           cur = cur.next;
            System.out.println(cur.data);
        }
        System.out.println();
    }

    //3、尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;

        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return ;
        }

        while(cur.next != null){
            cur = cur.next;
        }
        //cur.next == null --- 指向最后一个元素
        cur.next = node;
    }

    //4、查找是否包含关键字key在单链表中
    public boolean contains(int key){
        Node cur = this.head;

        while(cur != null){
            if(key == cur.data){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //5、得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;

        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //6、任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        //创建一个对象
        Node node = new Node(data);

        //1、判断是不是头插
        if(index == 0) {
            addFirst(data);
            return;
        }

        //2、判断是不是尾插
        if(index == this.size()) {
            addLast(data);
            return;
        }

        //3、先找到  index位置的前一个节点的地址
        Node cur = searchIndex(index);

        //4、进行插入
        node.next = cur.next;
        cur.next = node;

    }

    private Node searchIndex(int index) {
        //1、对index进行合法性检查
        if(index <0 ||index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        while(index-1 != 0){
            cur = cur.next;
            index --;
        }
//        for (int i = 0; i < index - 1; i++) {
//            cur = cur.next;
//        }
        return cur;
    }

}
