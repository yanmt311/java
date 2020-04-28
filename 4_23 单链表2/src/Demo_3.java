/**
 * 清空单链表
 */
public class Demo_3 {
    public Node head;
    //claar -- 内存释放
    public void clear(){

        this.head = null;
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
        Demo_3 demo_3 = new Demo_3();
        demo_3.addFirst(11);
        demo_3.addFirst(11);
        demo_3.addFirst(11);
        demo_3.addFirst(14);
        demo_3.addFirst(11);
        demo_3.display();

        demo_3.clear();
        demo_3.display();
    }
}
