/**
 * 链表的回文结构。
 *
 * 分析：1、找到链表的中间节点
 *      2、对链表的后一半进行反转
 *      3、head从头走，slow从尾走进行遍历
 *        奇数：
 *        偶数：
 *
 *     注意：两个特殊的：链表为空---无回文结构 ---返回false
 *                      链表只有一个 --- 肯定是回文 ---返回true
 */
public class Demo_3 {
    public Node head;

    public boolean chkPalindrome() {

        //链表为空
        if(this.head == null){
            return false;
        }

        //链表只有一个
        if(this.head.next == null){
            return true;
        }

        //找到中间节点---采用双指针 ---slow在中间
        Node slow = this.head;
        Node fast = this.head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }


        //反转后半部分链表
        Node cur = slow.next;

        while(cur != null){
            Node curNext = cur.next;

            cur.next = slow;//反转
            slow = cur;
            cur = curNext;
        }

        //一个从头走，一个从尾走
        while(slow != this.head){
            if(slow.data != this.head.data){
                return false;
            }
            //偶数
            if(this.head.next == slow){
                return true;
            }
            //奇数
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }

}

