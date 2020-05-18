class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public int usedSize;
    public Node head;
    public Node tail;

    public boolean offer(int val){
        Node node = new Node(val);
        //尾插---添加元素
        if(this.tail == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.usedSize++;
        return true;
    }


    //输出队头元素(出队)，删除对头元素
    public int poll(){
        if(empty()){
            throw new RuntimeException("队列为空");
        }
        int data = this.head.data;

        this.head = this.head.next;//删除

        return data;
    }


    //输出队头元素，但是不要删除对头元素
    public int peek(){
        if(empty()){
            throw new RuntimeException("队列为空");
        }
        int data = this.head.data;

        this.head = this.head.next;

        return data;
    }


    //确认队列是否为空
    public boolean empty(){
        return this.usedSize == 0;
    }

    //确定队列的元素
    public int size(){
        return this.usedSize;
    }
}
