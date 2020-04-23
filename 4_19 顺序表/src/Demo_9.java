/**
 * //删除第一次出现的关键字key
 * public void remove(int toRemove) {  
 *
 * }
 *
 * 分析：1、找要删除的数字在哪，并指导其下标在哪？ index
 *      2、让后面的元素值覆盖前面的元素，【i】= 【i+1】
 *      3、删除了一个 即usedSize--
 *      4、本来usedSize就比数组下标小1，现在删除了再小一次1，所以i的范围是i<usedSize - 1,且从index开始
 */
public class Demo_9 {

    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public Demo_9() {
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void remove(int toRemove) {
        //找元素
        int index = this.search(toRemove);

        //判断是否存在要找的元素
        if(index == -1){
            System.out.println("没有要找（删除）的元素：");
            return ;
        }

        //删除操作
        for (int i = index; i<this.usedSize - 1; i++){
            this.elem[i] = this.elem[i+1];
        }

        //this.usedSize-- 删除后整个顺序表元素少一个
        this.usedSize--;
    }

    public static void main(String[] args) {
        Demo_9 demo_9 = new Demo_9();
        for (int i = 0; i < 10; i++){
            demo_9.elem[i] = i;
        }
        demo_9.remove(5);
        demo_9.display();

        demo_9.remove(0);
        demo_9.display();

        demo_9.remove(9);
        demo_9.display();


    }
}