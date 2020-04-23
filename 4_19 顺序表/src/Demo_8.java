/**
 * // 给 pos 位置的元素设为 value
 * public void setPos(int pos, int value) {
 *
 * }
 */
public class Demo_8 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_8(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void setPos(int pos, int value) {
        for (int i = 0; i < this.usedSize ; i++) {
            this.elem[pos] = value;
        }
    }

    public static void main(String[] args) {
        Demo_8 demo_8 = new Demo_8();
        for (int i = 0; i < 10 ; i++) {
            demo_8.elem[i] = i;
        }

        demo_8.setPos(2,5);
        demo_8.display();
    }
}
