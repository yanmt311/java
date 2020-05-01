public class Demo_3 {
    public Node head;

    Node cur = this.head;
    public int size(){
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度，走差值步
        int lenA = 0;
        int lenB = 0;
        Node pL = headA;
        Node pS = headB;
        while(pL != null){
            lenA++;
            pL = pL.next;
        }
        while(pS != null){
            lenB++;
            pS = pS.next;
        }
        int len = lenA - lenB;
        if(len < 0){
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }else{
            pL = headA;
            pS = headB;
        }

        //走差步 ---前提是pL指向的是最长的链表
        for (int i = 0; i < len; i++) {
            pL = pL.next;
        }

        //pS和pL在同一起跑线上
        while(pS != pL && pL != null && pS != null){
            pS = pS.next;
            pL = pL.next;
        }
        if(pL == pS && pL != null){
            return pL;
        }

        return null;
    }
}
