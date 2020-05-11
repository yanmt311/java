import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            java.lang.String str = scanner.nextLine();

            StringBuilder ret = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String temp = ret.toString();
                //判断结果中是否包含字母，若不包含，进行拼接
                if (!temp.contains(ch + "")) {
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }
}