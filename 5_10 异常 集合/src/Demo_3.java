/**
 * 装箱/装包：将简单类型变为包装类类型
 * 拆箱/拆包：将包装类类型变为简单类型
 */
public class Demo_3 {
    public static void main(String[] args) {
        Integer a = 10;//自动装箱
        int b = a;//自动拆箱
    }
    public static void main1(String[] args) {
        int i = 0;
        Integer i1 = Integer.valueOf(i);
        Integer i2 = new Integer(i);

        int j = i1.intValue();
        double d = i1.doubleValue();
    }
}
