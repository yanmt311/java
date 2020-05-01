import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class Demo_4 {
    public Node head;

    public Node mergeTwoLists(Node headA, Node headB) {
        //创建一个虚拟节点
        Node newHead = new Node(-1);
        Node temp = newHead;
        while(headA != null && headB != null){
           //谁小将谁串起来
            if(headA.data < headB.data){
                temp.next = headA;
                temp = temp.next;
                headA = headA.next;
            }else{
                temp.next = headB;
                temp = temp.next;
                headB = headB.next;
            }

        }
        if(headA != null){
            temp.next = headA;
        }

        if(headB != null){
            temp.next = headB;
        }
        return newHead.next;
    }
}
