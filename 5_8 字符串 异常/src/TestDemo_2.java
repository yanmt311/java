public class TestDemo_2 {
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

    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
