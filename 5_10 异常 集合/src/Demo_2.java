import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("aa","bb");
        map.put("cc","dd");
        map.put("ee","ff");
        //map.put("ee","ss"); --- 建议不要使key一样猫一样打印最新的；但是value可以一样
        System.out.println(map);


        //根据指定的k查找对应的value

        System.out.println(map.get("aa"));
        System.out.println(map.get("33"));

        //根据指定的k查找对应的value，没有map.get("33");找到用默认值替代
        System.out.println(map.getOrDefault("55", "错误"));

        //将指定的k-v放入到Map中
        map.put("111","222");
        System.out.println(map);

        //判断是否包含key
        System.out.println(map.containsKey("aa"));

        //判断是否包含value
        System.out.println(map.containsValue("bb"));

        //将多有键值对返回 --- 重点
        Set<Map.Entry<String, String>> set =  map.entrySet();
        for (Map.Entry<String, String> s :set) {
//            s.getValue();
//            s.getKey();
            System.out.println( s.getValue() + "->" +  s.getKey());
        }

//        for (Map.Entry<String, String> s :set) {
//            System.out.println(s);
//        }
        //判断是否为空
        System.out.println(map.isEmpty());

        //返回键值对的数量
        System.out.println(map.size());

    }


}
