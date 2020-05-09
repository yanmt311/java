import java.util.Scanner;

public class TestDemo_3 {
    public static String reverse(String str,int begin,int end) {
        char[] ch = str.toCharArray();
        while(begin < end){
            char temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            begin++;
            end--;
        }
        String ret = new String(ch);
        return ret;

        //1
        //return new String(ch);
        //2
        //return String.copyValueOf(ch);

    }
    public static String func( String str,int n){
//        String temp1 = reverse(str,0,n-1);
//        String temp2 = reverse(temp1,n,str.length()-1);
//        String temp3 = reverse(temp2,0,str.length()-1);
//        return temp3;
        if(str == null || n <= 0 || n > str.length() - 1 ){
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String str1 = func(str, n);
        System.out.println(str1);
    }
}
