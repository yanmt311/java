/**
 * // 获取顺序表长度
 *  public int size() {
 *      return 0;
 *  }
 */
public class Demo_10 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_10(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    public int size() {
        return this.usedSize;
    }

    public static void main(String[] args) {
        Demo_10 demo_10 = new Demo_10();

        System.out.println(demo_10.size());
    }
}
