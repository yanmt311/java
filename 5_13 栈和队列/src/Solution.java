import java.util.Stack;

/**
 * 左括号匹配 --- 用栈去实现
 *
 *左括号类均进行入栈
 *
 */
public class Solution {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            //遍历字符串，若为左括号入栈 --- 遇到右括号看匹配问题
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);//将字符串其变为字符
                if(ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);//入栈
                }else{
                    //1、判断栈是否为空--栈为空，则右括号多
                    if(stack.empty()){
                        System.out.println("右括号多");
                        return false;
                    }
                    //2、判断左右括号是否匹配
                    char ch2 = stack.peek();
                    if((ch2 == '(' && ch ==')' ) || (ch2 == '[' && ch ==']' ) || (ch2 == '{' && ch =='}' )){
                        stack.pop();//匹配 弹出
                    }else{
                        System.out.println("括号不匹配");
                        return false;
                    }
                }
            }

            //3、遍历完字符串，栈不为空，则左括号多
            if(!stack.empty()){
                System.out.println("左括号多");
                return false;
            }
            return true;
        }

}
