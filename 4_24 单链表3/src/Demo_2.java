/**
 *在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 [OJ链接]
 *
 */

public class Demo_2 {
    public Node head;


    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);//创建虚拟节点
        Node temp = newHead;

        while(cur != null){

            //重复节点的操作 ---不写cur.next != null 会造成空指针异常
            if(cur.next != null && cur.data == cur.next.data){
                while(cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;//删除最后一个重复的
            }else{
                //没有重复的节点 --- 设立一个虚拟的节点newHead -- 尾插法进行拼接
                temp.next = cur;
                temp = temp.next;
                cur = cur.next;
            }

        }
        //手动讲最后链表最后一个变为空 --- 1 2 2 2 2
        temp.next = null;
        return newHead.next;
    }
}
