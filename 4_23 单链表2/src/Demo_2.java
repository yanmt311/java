/**
 * 删除所有值为key的节点
 */
public class Demo_2 {
    public Node head;

    public void removeAllKey(int key){

        Node prev = this.head;
        Node cur = this.head.next;//cur代表要删除的节点
        //遍历整个链表，即用cur!=null
        //删除其他节点
        while(cur != null){
            //删除紧挨着的数据
            if(cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                //删除没有紧挨着的数据
                prev = cur;
                cur = cur.next;
            }
        }

        //删除头节点
        if(this.head.data == key){
            this.head = this.head.next;
        }
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
        Demo_2 demo_2 = new Demo_2();
        demo_2.addFirst(11);
        demo_2.addFirst(11);
        demo_2.addFirst(11);
        demo_2.addFirst(14);
        demo_2.addFirst(11);
        demo_2.display();

        demo_2.removeAllKey(11);
        demo_2.display();
    }
}
