import java.util.Stack;
import java.lang.Integer;
public class Demo_Stack {

    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        FanStack<Integer> fanStack = new FanStack<>();
        fanStack.push(1);
        fanStack.push(2);
        fanStack.push(3);
        fanStack.push(4);
        System.out.println(fanStack.peek());//4
        System.out.println(fanStack.pop());//4-删除
        System.out.println(fanStack.peek());//3
        System.out.println(fanStack.empty());//false
        System.out.println(fanStack.full());//false
        System.out.println(fanStack.size());//3
    }


    public static void main2(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.peek());//4
        //System.out.println(myStack);

        System.out.println(myStack.pop());//4-删除
        //System.out.println(myStack);

        System.out.println(myStack.peek());//3

        System.out.println(myStack.empty());//false

        System.out.println(myStack.full());//false

        System.out.println(myStack.size());//3
    }




    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);//1,2,3,4

        //出栈，删除栈顶元素
        stack.pop();
        System.out.println(stack);//1,2,3

        //输出栈顶元素
        System.out.println(stack.peek());//3

        //判断栈是否为空
        System.out.println(stack.empty());//false

        //从栈顶开始返回o所在下标
        System.out.println(stack.search(1));//3

        //栈的大小
        System.out.println(stack.size());//3


    }

}
