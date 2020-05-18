import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 有一个List当中存放的是整形的数据，要求使用Collections.sort对List进行排序
 */
public class Demo_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
