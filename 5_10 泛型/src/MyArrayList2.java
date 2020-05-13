/**
 *  <T>:只是一个占位符,表示当前类的一个泛型类
 *  @param <T>
 *
 *      将所有Object换成T
 *
 * 泛型:
 * 坑1:不能new泛型类型的数组 T t = new T[10];
 * 坑2:简单类型不能作为泛型的参数
 *     MyArrayList2<String> myArrayList2 = new MyArrayList2<>();
 *坑3:泛型类型参数,不参与类型的组成
 *
 *
 * 面试问题:泛型到底怎么编译: -- 擦除机制
 * 泛型只是编译时期的一种机制,在运行时,不存在泛型这种说法,多有处理均在编译阶段处理
 *
 * 擦除机制:在编译时,泛型类型擦除为Object了,但不是将T替换为Object,具备了Object的特性
 *
 */

public class MyArrayList2<T> {
    public T[] elem;//顺序表底层为一个数组
    public int usedSize;

    public MyArrayList2() {
        //坑1:不能new泛型类型的数组
        //this.elem = new T[10];
        this.elem = (T[])new Object[10];
        this.usedSize = 0;
    }

    //添加元素
    public void add(T val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    //获取某个位置的值
    public T getVal(int pos){
        return this.elem[pos];
    }
}
