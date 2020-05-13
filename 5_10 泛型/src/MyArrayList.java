public class MyArrayList {
    public int[] elem;//顺序表底层为一个数组
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    //添加元素
    public void add(int val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    //获取某个位置的值
    public int getVal(int pos){
        return this.elem[pos];
    }
}
