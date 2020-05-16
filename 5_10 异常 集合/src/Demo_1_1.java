import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection 常用方法
 */
public class Demo_1_1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("111");
        collection.add("222");
        collection.add("333");
        System.out.println(collection);

        //遍历打印
        for (String s: collection) {
            System.out.println(s);
        }
        System.out.println( collection.size());

        collection.remove("111");
        System.out.println(collection);

        System.out.println(collection.isEmpty());

//        collection.clear();
//        System.out.println(collection);

        System.out.println(collection.contains("222"));


        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

    }
}
