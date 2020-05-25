import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**创建一个堆
     * @param root 每棵子树的开始位置
     * @param len  结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //0、判断是否有左右孩子  有的话 找到最大值 C下标表示最大值下标
            if(child + 1 < len && this.elem[child] < this.elem[child + 1]) {
                child++;
            }
            //代码指向到这里，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
                int temp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = temp;

                //向下走
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }

    }

    public void createHeap(int[] array) {

        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i：每棵子树的根节点下标
        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }


    /**
     * 插入一个元素在堆中
     * @param val
     */

    public void push(int val) {
        //0、堆是否是满的--》扩容
        if(isFull()){
            int newCapacity = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //1、放到数组的最后一个位置
        this.elem[this.usedSize] = val;
        this.usedSize++;

        //2、进行调整
        adjustUp(this.usedSize - 1);
    }

    public void adjustUp(int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (this.elem[parent] > this.elem[child]) {
                break;
            } else {
                //交换
                int temp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = temp;

                //向下进行
                child = parent;
                parent = (child - 1) / 2;
            }
        }
    }

    public boolean isFull () {
        return this.elem.length == this.usedSize;
    }


    /**
     * 删除堆中的一个元素
     */
    public void pop(){
        //是否为空
        if(isEmpty()){
            return;
        }
        //最后一个元素与栈顶元素交换
        int temp = this.elem[0];
        this.elem[0] = this.elem[usedSize - 1];
        this.elem[usedSize - 1] = temp;
        this.usedSize --;

        //调正0号下标这棵树
        adjustDown(0,this.usedSize - 1);
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }


    /**
     * 堆排序
     *
     * 从小到大 --- 大根堆
     * 从大到小 --- 小根堆
     */
    public void heapSort() {
        //创建一个end
        int end = this.usedSize-1;
        while (end > 0) {
            //交换
            int temp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = temp;

            //调正
            adjustDown(0,end);
            //继续
            end --;
        }
    }



}

