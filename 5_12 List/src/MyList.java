import java.util.ArrayList;
import java.util.List;

/**
 * List
 */
public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //尾插e -- 类型为E--String
        //boolean add(E e)
        list.add("haha");
        list.add("xixi");
        list.add("heihei");
        System.out.println(list);//[haha, xixi, heihei]

        //将e插入到index位置 --注意不能越界
        //void add(int index, E element)
        list.add(0,"hehe");
        System.out.println(list);//[hehe, haha, xixi, heihei]

        //尾插c中的元素
        //满足：1、实现了Collection接口
        //     2、E的类型必须是子类或者本身
        //boolean addAll(Collection<? extends E> c)
        List<String> list1 = new ArrayList<>();
        list.add("222");
        list.addAll(list1);
        System.out.println(list);



        //删除index位置元素
        //E remove(int index) 删除 index
        list.remove(0);
        System.out.println(list);//[haha, xixi, heihei]



        //删除遇到的第一个o
        //boolean remove(Object o)
        System.out.println(list.remove("haha"));//true
        System.out.println(list);//[xixi, heihei]


        //获取下标 index 位置元素
        //E get(int index)
        String ret = list.get(1);
        System.out.println(ret);//heihei


        //将下标 index 位置元素设置为 element
        //E set(int index, E element)
        list.set(1,"111");
        System.out.println(list);//[xixi, 111]

        //判断 o 是否在线性表中
        //boolean contains(Object o)
        System.out.println(list.contains("111"));//true

        //返回第一个 o 所在下标
        //int indexOf(Object o)
        int ret2 = list.indexOf("xixi");
        System.out.println(ret2);//0


        //返回最后一个 o 的下标
        //int lastIndexOf(Object o)
        list.add(0,"aaa");
        list.add("aaa");
        int ret4 = list.lastIndexOf("aaa");
        System.out.println(ret4);//3


        //截取部分 list
        //List<E> subList(int fromIndex, int toIndex)
        List<String>  retList = list.subList(0,2);//左闭右开 --[aaa, xixi]
        System.out.println(retList);


        //陷阱--- 重点---更改后，retList和list中均将0号下标修改了---为浅拷贝
        retList.set(0,"陷阱");
        System.out.println(retList);//[陷阱, xixi]
        System.out.println(list);//[陷阱, xixi, 111, aaa]

        System.out.println();
        //清空
        //void clear()
        list.clear();
    }
}
