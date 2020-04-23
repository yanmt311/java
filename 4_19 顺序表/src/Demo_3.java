import java.util.Arrays;

/**
 * // 打印顺序表
 * public void display() {  
 * }
 */

public class Demo_3 {

//方法1：private
//    //创建成员变量
//    private int[] elem;//顺序表必须有一个数组
//    private int usedSize;//记录顺序表的有效的数据个数
//    private static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final
//
//    //private一般用get set初始化
//    public int[] getElem() {
//        return elem;
//    }
//
//    public void setElem(int[] elem) {
//        this.elem = elem;
//    }
//
//    public int getUsedSize() {
//        return usedSize;
//    }
//
//    public void setUsedSize(int usedSize) {
//        this.usedSize = usedSize;
//    }
//
//    public static int getCapacity() {
//        return Capacity;
//    }

    //方法2：
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_3(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }
    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(this.elem));
    }

    public static void main(String[] args) {
        //实例成员变量 依赖对象
        // 创建一个对象
        Demo_3 demo_3 = new Demo_3();

        //添加元素
        for (int i = 0; i < 10; i++) {
            demo_3.elem[i] = i;
           // System.out.print(demo_3.elem[i] + " ");
        }
        //调用实例成员方法
        demo_3.display();
    }
}

