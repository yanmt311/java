import java.util.Scanner;

/**
 * finally
 * 1、finally块当中的代码，终究会被执行
 * 2、不建议再finally当中使用return 语句
 */
public class Demo_0_2 {
    /**
     * 如果上层调用者没有处理异常，会继续向上传递；
     * 一直到main方法也没有合适的代码处理异常，
     * 会交给JVM来处理异常，程序会异常终止
     */
    public static void func2(){
        int[] array = {1,2,3,4};
        System.out.println(array[4]);
    }
    public static void main(String[] args) {
        try{
            func2();
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到数组越界异常");
        }finally{
            System.out.println("hehehe");
        }
    }
    /**
     * 关闭资源 : scanner.close();
     */
    public static void main4(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(10 / n);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("捕获算数异常");
        }
    }
    /**
     * 返回2
     */
    public static int func1(){
        int[] array = {1,2,3,4};
        try {
            System.out.println(array[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到数组越界异常");
            return 3;
        }finally {
            return 2;
        }
    }
    public static void main3(String[] args) {
        System.out.println(func1());
    }
    /**
     * 返回2
     * @return
     */
    public static int func(){
        int[] array = {1,2,3,4};
        try {
            System.out.println(array[4]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到数组越界异常");
        }finally {
            return 2;
        }
    }
    public static void main2(String[] args) {
        System.out.println(func());
    }
    /**
     * finally块的代码肯定会被执行！，经常做善后工作，比如关闭资源
     * @param args
     */
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
            System.out.println("此块代码肯定不会被执行！");
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常！");
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到空指针异常！");
        }finally {
            System.out.println("finally块的代码肯定会被执行！，经常做善后工作，比如关闭资源");
        }
        System.out.println("hello");
    }
}
