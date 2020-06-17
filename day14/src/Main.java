import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        while(scanner.hasNext()){
            //读取0-9的个数
            for (int i = 0; i < num.length ; i++) {
                num[i] = scanner.nextInt();
            }

            //输出除0以外的最小数字
            for (int i = 0; i < num.length; i++) {
                if(num[i] != 0){
                    System.out.print(i);
                    num[i]--;
                    break;
                }
            }

            //依次输出最小的
            for (int i = 0; i < num.length; i++) {
                while(num[i] > 0){
                    System.out.print(i);
                    num[i]--;
                }
            }

            //为了保证一行，前面不换行，之后换行
            System.out.println();
        }

    }
}
