

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a * b / leastCommonMultiple(a, b);
            System.out.println(result);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
            int c = a % b;
        if (c == 0) {
            return b;
        } else {
            return leastCommonMultiple(b, c);
        }
    }
}
