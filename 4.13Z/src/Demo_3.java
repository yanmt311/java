import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * 作业标题
 * 求阶乘和
 *
 * 作业内容
 * 求1！+2！+3！+4！+........+n!的和
 *
 * 分析：1、求某个数的阶乘
 *       2、将某个数的阶乘叠加起来
 */
public class Demo_3 {
    public static int sum(int y){
        int sum = 0;
        for(int j = 1; j <= y; j++){
            sum += factorial(j);
        }
        return sum;
    }
    public static int factorial(int x){
        int ret = 1;
        for(int i = 1; i <= x; i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println("请输入所求阶乘数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ret = sum(n);
        System.out.println(ret);
    }
}

