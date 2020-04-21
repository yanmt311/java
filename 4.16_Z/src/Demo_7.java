/**
 * 8、考点：静态成员变量 不依赖于对象
 *         静态成员变量只有一份
 */

public class Demo_7 {// 1
    private static int x = 100;// 2

    public static void main(String args[]) {// 3
        Demo_7 hsl = new Demo_7();// 4
        hsl.x++;// 5 -- 101
        Demo_7 hs2 = new Demo_7();// 6
        hs2.x++;// 7 -- 102
        hsl = new Demo_7();// 8
        hsl.x++;// 9 -- 103
        Demo_7.x--;// 10 -- 102
        System.out.println(" x=" + x);// 11
    }
}


