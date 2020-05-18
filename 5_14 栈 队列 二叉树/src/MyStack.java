import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现栈
 */
public class MyStack {
    //初始化两个队列
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    //push一个x到栈中
    public void push(int x) {

        if (!queue1.isEmpty()){
            queue1.offer(x);
        }else if(!queue2.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
    }


    public boolean empty(){
        if(queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;
    }
    //出栈且返回元素
    public int pop(){
        if(empty()){
            //throw new RuntimeException("栈为空");
            return -1;
        }
        int data = 0;
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        //出queue1
        if(!this.queue1.isEmpty()){
            for (int i = 0; i < qSize1 - 1; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else{//出queue2
            for (int i = 0; i < qSize2 - 1; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;
    }



    //栈顶元素
    public int top(){
        if(empty()){
            //throw new RuntimeException("栈为空");
            return -1;
        }
        int data = 0;
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        //出queue1
        if(!this.queue1.isEmpty()){
            for (int i = 0; i < qSize1 ; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }else{ //出queue2
            for (int i = 0; i < qSize2; i++) {
                data = queue2.poll();
                queue2.offer(data);
            }
        }
        return data;
    }
}
