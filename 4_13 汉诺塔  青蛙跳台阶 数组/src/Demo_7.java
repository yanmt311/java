import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.print.attribute.standard.PagesPerMinute;

/**
 * null ： int[] arr = null; ---java中引用一个空对象，null不代表0地址处
 * NULL ： int* p = NULL; ---c语言，NULL代表0地址处
 */
public class Demo_7 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);

        int[]  arr= null;
        System.out.println(arr);
        //System.out.println(arr[0]);//空指针异常

    }


}
