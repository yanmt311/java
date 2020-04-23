/**
 * // 查找某个元素对应的位置
 * public int search(int toFind) {
 *      return -1;
 * }
 *
 * 分析：查找某个元素对应的位置，如果找到返回下标，否则返回-1
 */
public class Demo_6 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_6(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
     }

    public static void main(String[] args) {
        Demo_6 demo_6 = new Demo_6();

        for (int i = 0; i < 10; i++) {
            demo_6.elem[i] = i;
        }

        System.out.println(demo_6.search(5));
        System.out.println(demo_6.search(15));

    }
}
