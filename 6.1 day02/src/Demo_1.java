import java.util.Scanner;

public class Demo_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n2 = 0;

        while(scanner.hasNext()){
            n2 = scanner.nextInt();
            bottle(n2);
        }
        scanner.close();
    }


    public static  void bottle(int n2){
        int n = 0;//代表瓶子总数
        int n1 = 0;
        int bn = 0;
        int bn1 = 0;

        bn1 = n/3;//可以兑换的饮料
        n = n%3;//兑换后剩余的瓶子数
        bn =  bn1 + bn;
        n1 = n + n1;

        while(n1 >= 3){
            n = n1 % 3;
            bn1 = n1 / 3;
            bn = bn1 + bn;
            n1 = n + bn1;
        }

        if(n1 == 2){
            bn ++;
        }

        System.out.println(bn);
    }
}
