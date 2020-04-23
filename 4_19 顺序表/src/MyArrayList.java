import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 顺序表的各种方法
 */
public class MyArrayList {
    /**
     * 定义成员变量和构造方法
     */
    //创建成员变量
    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    //创建构造方法并初始化
    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 10;
    }

    /**
     * 1、打印顺序表
     *
     * 分析：依次打印
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    /**
     * 2、在 pos 位置新增元素
     *
     * 分析：1、判断pos是否合法
     *      2、移动顺序表元素
     *      3、将data给pos位置
     *      注意：判断顺序表为满的、并对其扩容
     */
    public boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    public void add(int pos, int data) {
        if(isFull()){
            //return;
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos<0 || pos>this.usedSize){
            return ;
        }

        for (int i = this.usedSize - 1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
    }


    /**
     * 3、判定是否包含某个元素
     *
     * 分析：依次查找，找到返回true ，没找到返回false
     *
     */
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }


    /**
     * 4、查找某个元素对应的位置
     *
     * 分析：找到返回下标，没找到返回-1
     */
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }


    /**
     * 5、获取 pos 位置的元素
     *
     * 分析：1、先判断顺序表是否为空 -- 返回-1 或者扔一个异常
     *      2、判断pos位置是否合法 -- 返回-1 或者扔一个异常
     *      3、如果不为空，也合法，返回pos位置的元素
     */
    public boolean isEmpty(){
        return this.usedSize == 0;
    }
    public int getPos(int pos) {
        if(isEmpty()){
            throw new RuntimeException("顺序表为空！");
        }
        if(pos<0 || pos>=this.usedSize){
            throw new RuntimeException("pos位置不合法");
        }
        return this.elem[pos];
    }


    /**
     * 6、给 pos 位置的元素设为 value
     *
     * 分析：1、判断pos位置是否合法
     *      2、将pos位置的值变为value
     */
    public void setPos(int pos, int value) {
        if(pos<0 || pos>this.usedSize){
            throw new RuntimeException("pos位置不合法！" );
        }
        this.elem[pos] = value;
    }


    /**
     * 7、删除第一次出现的关键字key
     *
     * 分析：1、找到想要删除的元素在哪，并知道其下标
     *      2、移动数据，将i+1的数据覆盖在i的位置
     *      3、注意this.usedSize - 1,并且移动从找到元素的的位置开始
     *      4、this.usedSize--
     */
    public void remove(int toRemove) {
        int index = this.search(toRemove);
        if(index == -1){
            System.out.println("没有要删除的元素！");
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }



    /**
     * 8、获取顺序表长度
     *
     * 分析：返回有效个数
     */
    public int size() {
        return this.usedSize;
    }



    /**
     * 9、清空顺序表
     *
     * 分析：1、清空：将this.usedSize = 0
     *      2、置0：将this.elem = 0
     */
    public void clear() {
        this.usedSize = 0;
//        for(int i = 0; i < this.usedSize; i++){
//            this.elem[i] = 0;
//        }
    }
}

