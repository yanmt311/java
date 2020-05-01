/**
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

    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        //判断有没有环
        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }


    public boolean hasCycle1() {
        Node fast = this.head;
        Node slow = this.head;
        //判断有没有环
        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return false;
        }
        return true;
    }
}
