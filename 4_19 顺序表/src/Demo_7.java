/**
 * // 获取 pos 位置的元素
 * public int getPos(int pos) {
 *          return -1;
 * }
 *
 * 分析：1、顺序表是否为空 --- 为空返回-1
 *      2、判断pos是否合法
 *      3、返回pos位置的数据
 */
public class Demo_7 {
    public int[] elem;//顺序表必须有一个数组
    public int usedSize;//记录顺序表的有效的数据个数
    public static final  int Capacity = 10;//初始化数组内存空间容量 --- 常量一般用static final

    //构造方法--初始化变量
    public  Demo_7(){
        this.elem = new int[Capacity];//为数组开辟内存空间
        this.usedSize = 10;
    }

    //方法实现pos不合法
//    private void checkPos(int pos){
//        if(pos<0 || pos>this.usedSize){
//            throw new RuntimeException("pos位置不合法！");
//        }
//    }

    private boolean isEmpty(){
        return this.usedSize == 0;
    }

    public int getPos(int pos) {
        if(isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空！");//手动抛出一个异常
        }

        if(pos<0 || pos>=this.usedSize){
            //return -1;//有可能顺序表中有-1，所以扔一个异常
            throw new RuntimeException("pos位置不合法！");//手动抛出一个异常
        }

        return this.elem[pos];
    }

    public static void main(String[] args) {
        Demo_7 demo_7 = new Demo_7();

        for (int i = 0; i < 10 ; i++) {
            demo_7.elem [i] = i;
        }

        System.out.println(demo_7.getPos(5));
        //System.out.println(demo_7.getPos(15));//pos位置不合法
    }

}
