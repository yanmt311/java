public class Demo_4 {
//    public static Integer valueOf(int i) {
//        if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//            return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//        return new Integer(i);
//    }

    //a和b早-128 到 127 之内 为true
    //超过这个范围为false

    // low >= -128  high <= 127
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
    }
}
