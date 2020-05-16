/**
 * 自定义异常
 * RuntimeException :运行时异常
 * Exception:受查异常/编译异常
 */
class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
public class Demo_0_5 {
    public static void func(int x) throws MyException{
        if(x == 10){
            throw new MyException("x==10");
        }
    }
    public static void main(String[] args) {
        try{
            func(10);
        }catch(MyException e){
            e.printStackTrace();
        }

    }
}
