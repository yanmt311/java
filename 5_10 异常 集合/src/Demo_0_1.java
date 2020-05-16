/**
 * try{
 *     可能出现异常的代码
 * }catch（参数：异常的类型 变量：e）{
 *     捕获try当中可能出现异常的情况
 * }
 */
public class Demo_0_1 {
    /**
     * 4、可以合并异常
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
            System.out.println("这里的代码不会被执行，直接跳转至catch");
        }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常或者空指针异常");
        }
        System.out.println("hello");
    }
    /**
     *3、不建议大家直接捕获Exception
     *  Exception：一个异常捕获所有异常
     * 若Exception放在第一个catch中，会发生错误
     */
    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常");
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到空指针异常");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("捕获到Exception异常");
        }
        System.out.println("hello");
    }
    /**
     *2、可以通过catch捕获多个异常
     * @param args
     */
    public static void main4(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常");
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到空指针异常");
        }
        System.out.println("hello");
    }
    /**
     * 处理异常需要注意的问题：
     * 1、catch块中，一定要捕获相应的异常，
     * 如果程序抛出的异常再catch块当中，
     * 不能被捕获，会交给JVM处理
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
        }catch(NullPointerException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常");
        }
        System.out.println("hello");
    }
    /**
     * 当程序发生异常时，会直接交给JVM处理异常，
     * 这样导致的结果是，程序会立即停止，不再像下执行，
     * 不打印hello
     *
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(array[4]);
        System.out.println("hello");
    }

    /**
     * 当程序抛出异常之后，由catch块进行捕获，
     * 程序由自己来处理异常，程序会继续向下执行
     * 打印hello
     *
     *
     * @param args
     */
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        try{
            System.out.println(array[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印栈追踪，打印出来所在的位置不固定
            System.out.println("捕获到数组越界异常");
        }
        System.out.println("hello");
    }

}
