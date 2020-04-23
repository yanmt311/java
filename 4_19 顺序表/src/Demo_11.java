/**
 * // 清空顺序表
 * public void clear() {
 *
 * }
 *
 */
public class Demo_11 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_11(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        /**
         * 清空区域
         */
        //this.usedSize = 0;
        /**
         * 使其元素为0
         */
        for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = 0;
        }
   }

    public static void main(String[] args) {
        Demo_11 demo_11 = new Demo_11();
        for (int i = 0; i < 10 ; i++) {
            demo_11.elem[i] = i;
        }
        demo_11.display();
        demo_11.clear();
        demo_11.display();

    }
}
