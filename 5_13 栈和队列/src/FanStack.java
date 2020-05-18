import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.Stack;

public class FanStack<T> {

    public T[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    //构造方法
    public FanStack() {
        this.elem = (T[])new Object[10];//泛型重点
    }

    //入栈
    public void push(T val) {
        //如果栈满了，扩容
        if(this.full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //往栈中存放数据
        this.elem[top] = val;
        this.top++;
        //this.elem[this.top++] = val;
    }

    //栈顶元素并且删除
    public T pop() {
        if(this.empty()){
            //return -1;
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        this.top--;
        return data;
    }

    //栈顶元素
    public T peek() {
        if(this.empty()){
            //return -1;
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        return data;
    }

    //栈是否为空
    public boolean empty() {
        return this.top == 0;
    }

    //栈是否满了
    public boolean full() {
        if(this.top == this.elem.length){
            return true;
        }
        return false;

        //return this.top == this.elem.length;
    }

    //栈中元素的个数
    public int size() {
        return this.top;
    }

}






