import java.util.Scanner;

public class Demo_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1= 0;
        int f2 = 1;
        int f3 = f2 + f1;
        while(true){
            if(f2 == n){
                System.out.println(0);
            }else if(f2>n){
                if(Math.abs(f2 - n)>Math.abs(f1 - n)){
                    System.out.println(Math.abs(f1 - n));
                }else{
                    System.out.println(Math.abs(f2 - n));
                }
            }
            break;
        }

        f1 = f2;
        f2 = f3;
        f3 = f1+f2;
    }


}

//ok
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine().trim());
//        int first = 0;
//        int second = 1;
//        if(n == 1) {
//            System.out.println("0");
//            return;
//        }
//        while(true){
//            int temp = first;
//            first = second;
//            second = temp + second;
//            if(n > first && n <= second){
//                int step = Math.min(n-first,second - n);
//                System.out.println(step);
//                return;
//            }
//        }
//    }
//}

