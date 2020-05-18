import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
/**
 * 删除第一个字符串当中出现的的第二个字符串中的字符
 *
 * 如：
 * String str1 = "welcome to bit";
 * String str2 = "come";
 *
 * 输出结果：wl t bit
 */
public class Demo_3 {
    public static List<Character> func(String str1,String str2){
        List<Character> list = new ArrayList<>();
        //遍历看str1中的字符是否在str2中包含(contains ),不包含放在list中，采用list.add()
        for (int i = 0; i < str1.length() ;i++) {
            char ch = str1.charAt(i);//将其转换为字符
            if(!str2.contains(ch + "")){
                list.add(ch);
            }
         }
        return list;
    }


    public static void main(String[] args) {
        String str1 = "welcome to cowf";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
        //1、
        System.out.println(ret);

        //2、
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
