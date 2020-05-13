/**
 * <T>:只是一个占位符,表示当前类的一个泛型类
 * @param <T>
 */
public class MyArrayList1 <T>{
    public Object[] elem;//顺序表底层为一个数组
    public int usedSize;

    public MyArrayList1() {
        this.elem = new Object[10];
        this.usedSize = 0;
    }

    //添加元素
    public void add(Object val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    //获取某个位置的值
    public Object getVal(int pos){
        return this.elem[pos];
    }
}
