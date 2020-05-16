/**
 * 手动抛出异常
 * throw :一般抛出一个你想抛出的异常或者自己自定义的异常
 */
public class Demo_0_3 {
    public static int divide(int x,int y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("y==0");
        }
        return x/y;
    }
    public static void main(String[] args) {
        try{
            int ret = divide(20,0);
            System.out.println(ret);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("捕获算数异常！");
        }finally{
            System.out.println("继续被执行");
        }

    }


    public static void main1(String[] args) {
        int x = 0;
        if(x == 0 ){
            //throw new UnsupportedOperationException("x=0");//不被支持的异常
            throw new RuntimeException("x=0");
        }
    }
}
