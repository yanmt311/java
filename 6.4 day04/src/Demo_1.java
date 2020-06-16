import java.util.Scanner;

public class Demo_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(count(n));
        }

    }

    public static int count(int n){
        if(n%2 != 0 || n==10 || n<6){
            return -1;
        }
        if(n%8 == 0){
            return n/8;
        }

        return 1+n/8;
    }

}
