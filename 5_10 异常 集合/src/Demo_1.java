import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo_1 {
    public static void main1(String[] args) {
        //意味着类型为String 类为ArrayList
        Collection<String> collection = new ArrayList<>();

        //将元素e放入到集合中
        collection.add("xixi");
        collection.add("heihei");
        collection.add("hehe");
        collection.add("haha");

        System.out.println(collection);

        //删除集合中的所有元素
        //collection.clear();
        //System.out.println(collection);

        //判断集合是否没有任何元素,俗称空集合
        System.out.println(collection.isEmpty());

        //如果元素e出现在集合中，删除其中一个
        collection.remove("xixi");
        System.out.println(collection);

        //返回集合中的元素个数
        System.out.println(collection.size());

        //转换为数组进行打印
        // Object[] toArray();
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println(collection);

    }
}
