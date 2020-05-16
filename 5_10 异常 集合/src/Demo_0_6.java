/**
 * 登陆
 */
class UserException extends Exception{
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}


class PassedException extends Exception{
    public PassedException() {
    }

    public PassedException(String message) {
        super(message);
    }
}

public class Demo_0_6 {
    private static String username = "admin";
    private static String password = "123456";

    public static void login(String username ,String password){
        if(!Demo_0_6.username.equals((username))){
            throw new RuntimeException("用户名异常");
        }

        if(!Demo_0_6.password.equals(password)){
            throw new RuntimeException("密码异常");
        }

        System.out.println("登陆成功");
    }


    public static void main(String[] args) {
        login("admin" ,"12345");
    }
}
