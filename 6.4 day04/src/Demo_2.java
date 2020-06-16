import java.util.Scanner;

public class Demo_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();


        String[] arr1=s1.split("");

        StringBuffer sb=new StringBuffer();

        for (int i=0;i<arr1.length;i++){
            if (!s2.contains(arr1[i])){
                sb.append(arr1[i]);
            }
        }
        System.out.println(sb.toString());
    }

}


