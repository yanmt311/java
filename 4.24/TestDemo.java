import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *     单链表：
 * User: GAOBO
 * Date: 2020-04-20
 * Time: 18:36
 */

public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(13);
        myLinkedList.addLast(21);
        myLinkedList.addLast(3);
        myLinkedList.addLast(41);
        myLinkedList.addLast(15);
        myLinkedList.addLast(63);
        myLinkedList.display();//

        Node ret = myLinkedList.partition(17);
        myLinkedList.display2(ret);
        //System.out.println(myLinkedList.findKthToTail(6).data);

        /*Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/

        /*System.out.println("删除开始:");
        myLinkedList.removeAllKey(81);
        myLinkedList.display();//*/
        /*boolean flg =  myLinkedList.contains(78);
        System.out.println(flg);*/
        /*System.out.println(myLinkedList.contains(78));
        System.out.println(myLinkedList.size());*/
    }
}
