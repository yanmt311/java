import java.util.*;

public class Demo_3 {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> s = new Stack<>();
        char[] c = A.toCharArray();
        for (int i = 0; i < n; i++) {
            if(c[i] == '('){
                s.push('(');
            }else if(c[i] == ')'){
                //一定要考虑栈空啊！！！
                if(s.size() == 0){
                    return false;
                }else{
                    s.pop();
                }
            }else{
                return false;
            }
        }

        if(s.size() != 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        System.out.println(new Demo_3().chkParenthesis(s,n));
    }
}

