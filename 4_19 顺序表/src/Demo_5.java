/**
 * // 判定是否包含某个元素
 *
 * public boolean contains(int toFind) {
 *       return true;
 * }
 * 分析：判断顺序表中包含不包含tofind元素，包含返回true  否则返回false
 */
public class Demo_5 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_5(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Demo_5 demo_5 = new Demo_5();

        for (int i = 0; i < 10; i++) {
            demo_5.elem[i] = i;
        }

        System.out.println(demo_5.contains(6));
        System.out.println(demo_5.contains(44));

    }
}
