import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;

/**
 * 数组的长度
 * 1、arr.length 为属性
 * 2、for（数组参数类型 变量名：数组名称）{}
 * 3、 使用 arr.length 能够获取到数组的长度. . 这个操作为成员访问操作符. 后面在面向对象中会经常用到.
 *     使用 [ ] 按下标取数组元素. 需要注意, 下标从 0 开始计数
 *     使用 [ ] 操作既能读取数据, 也能修改数据.
 *     下标访问操作不能超出有效范围 [0, length - 1] , 如果超出有效范围, 会出现下标越界异常
 *
 */
public class Demo_5 {


    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8};
            int len = arr.length;
            System.out.println("len:" + len);


        /**
         * 遍历一个数组
         */
        for(int i = 0;i < len;i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        for(int j = 0;j < arr.length;j ++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        for(int x : arr ){
            System.out.print(x + " ");
        }
        System.out.println();

        /**
         * 打印数组元素
         */
        System.out.println(arr[1]);
        //System.out.println(arr[100]);//谨防下标越界异常
    }
}
