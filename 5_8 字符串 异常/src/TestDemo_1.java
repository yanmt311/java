import java.util.Scanner;
public class TestDemo_1 {


        public static String func(String str) {
            String[] Strings = str.split(" ");
            String ret = "";
            for (String s: Strings) {
                ret += s;
            }
            return ret;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            //不能用next 遇到空格结束了
            String ret = func(str);
            System.out.println(ret);
        }



}
