/**
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
 *
 */
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Demo_1 {
    public Node head;

    public Node partition(int x) {

        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {//第二次插入
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {//第二次插入
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
         if(bs == null){
          return as;
         }else{
             be.next = as;
         }
        //2、如果bs不为空  需要进行拼接

        //3、如果ae不为空    ae的next需要置为空
        if(as != null){
            ae.next = null;
        }
        return bs;
    }



    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }



    //打印单链表
    public void display(){
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Demo_1 demo_1 = new Demo_1();
        demo_1.addFirst(11);
        demo_1.addFirst(23);
        demo_1.addFirst(89);
        demo_1.addFirst(2);
        demo_1.display();


        demo_1.partition(14);
        demo_1.display();
    }
}
