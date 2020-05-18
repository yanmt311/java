import java.util.concurrent.LinkedTransferQueue;

/**
 * 循环队列
 */

public class MyCircularQueue {

        public int[] elem;
        public int usedSize;
        public int front;
        public int rear;


        //MyCircularQueue(k): 构造器，设置队列长度为 k 。
        /** Initialize your data structure here. Set the size of the queue to be k. */
         public MyCircularQueue(int k) {
            this.elem =new int [k+1];
        }


        //enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }

            this.elem[this.rear] = value;
            this.rear = (this.rear + 1) % this.elem.length;
            return true;
        }

        //deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            this.front = (this.front + 1) % this.elem.length;
            return true;
        }

        //Front: 从队首获取元素。如果队列为空，返回 -1 。
        /** Get the front item from the queue. */
        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return this.elem[this.front];
        }


        // Rear: 获取队尾元素。如果队列为空，返回 -1 。
        /** Get the last item from the queue. */
        public int Rear() {
            if(isEmpty()){
                return -1;
            }

            //因为rear有可能为0号位置，所以不能this.rear - 1;

            int index = this.rear == 0 ? this.elem.length - 1 : this.rear - 1;
            return  this.elem[index];
        }


        //判断循环队列是否为空
        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return this.front == this.rear;
        }


        //判断循环队列是否满
        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            if((this.rear + 1) % this.elem.length == this.front){
                return true;
            }

            return false;
        }

}
