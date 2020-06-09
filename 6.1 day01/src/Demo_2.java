
import java.util.*;
public class Demo_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //生成两个字符串
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int count = 0;

        if(isPlindrome(B+A,0,B.length()+A.length()-1)){
            count++;
        }

        for(int i = 1; i<A.length();i++){
            if(isPlindrome(A.substring(0,i)+B+A.substring(i),0,B.length()+A.length()-1)){
                count++;
            }
        }

        if(isPlindrome(B+A,0,B.length()+A.length()-1)){
            count++;
        }

        System.out.println(count);
    }

    public static Boolean isPlindrome(String s,int i,int j){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}

