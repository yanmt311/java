import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;


    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x) {
        //两个栈
        //1、若两个栈均为空 同时放第一个元素
        //2、判断栈顶元是否小于要push的元素，若小两个栈均存放。

        stack.push(x);
        if(minstack.empty()){
            minstack.push(x);
        }else{
            //保存栈顶元素
            int top = minstack.peek();
            //栈顶元素于push进行比较
            if(x<=top){
                minstack.push(x);
            }
        }
    }

    //出栈，并且删除栈顶元素
    public void pop() {
        //判断栈是否为空，不为空，则将stack元素弹出
        //比较stack栈顶元素于minstack元素是否相等，相等弹出minstack栈顶元素
        if(!stack.empty()){
            int temp = stack.pop();
            if(temp == minstack.peek()){
                minstack.pop();
            }
        }
    }

    //普通栈的栈顶元素
    public int top() {
        if(stack.empty()){
            return -1;
        }
        return stack.peek();
    }

    //拿到最小栈的栈顶元素
    public int getMin() {
        if(minstack.empty()){
            return -1;
        }
        return minstack.peek();
    }
}

