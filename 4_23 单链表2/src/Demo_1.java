/**
 * 删除第一次出现关键字为key的节点
 *
 * 分析：1、删除头节点this.head.data == key，即this.head = this.head.next
 *      2、删除其他节点
 *          a、找到删除的节点key的前驱 -- 返回是一个节点
 *              定义节点 Node prev = this.head;//前驱
 *              Node cur = null;//删除的当前节点
 *
 *          b、进行删除操作
 *
 */
//抽象节点类
class Node{
    public int data;
    public Node next;

    //构造方法 -- 初始化成员变量 -- 实例化一个对象
    //不知道节点的地址，默认为null 所以只传data值
    public Node(int data) {
        this.data = data;
    }
}



public class Demo_1 {
    public Node head;

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

    }


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

    public static void main(String[] args) {
        Demo_1 demo_1 = new Demo_1();
        demo_1.addFirst(11);
        demo_1.addFirst(12);
        demo_1.addFirst(13);
        demo_1.addFirst(14);
        demo_1.addFirst(15);
        demo_1.display();

        demo_1.remove(11);
        demo_1.display();
        demo_1.remove(13);
        demo_1.display();
        demo_1.remove(15);
        demo_1.display();

    }
}
