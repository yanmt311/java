public class Demo_2 {
    public Node head;
    public Node detectCycle() {
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
            return null;
        }

        //有环
        slow = this.head;
        if(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
