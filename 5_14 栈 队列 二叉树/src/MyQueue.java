import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //入栈 均指定到第一个栈当中
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }


        if(stack2.empty()){
            if(!stack1.empty()){
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }else{
               //throw new RuntimeException("队列为空");
                return -1;
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;
        }


        if(stack2.empty()){
            if(!stack1.empty()){
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }else{
                //throw new RuntimeException("队列为空");
                return -1;
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.empty() && stack2.empty()){
            return true;
        }
        return false;
    }
}
