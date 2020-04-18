import javax.xml.bind.annotation.XmlInlineBinaryData;

/**
 * 数组
 */
public class Demo_4 {
    /**
     * 数组的定义与初始化
     * 1、动态初始化
     *      数据类型[] 数组名称 = new 数据类型 [] { 初始化数据 };
     * 2、静态初始化
     *      数据类型[] 数组名称 = { 初始化数据 }
     * 3、int[] ---数据类型
     *    arr --- 数组名 --存放在栈中 -- 引用
     *    {1，2，3，4} --- 初始化数据 --- 存放在堆中 ---一个对象
     * 4、数组 : 存放相同数据类型的集合。内存是连续的。
     * 5、new:实例化一个对象   内存在堆上
     * 6、栈上的地址是拿不到的
     *    堆上的地址可以打印，但不是真实的，是Java进行处理的地址（hash），但可以当做是真实的。-- 地址也是唯一的。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};//静态初始化
        int[] arr2 = new int[] {1,2,3,4};//动态初始化
        int[] arr3 = new int[10];//局部变量初始化为0，Java中初始化为随机值
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
     }
}
