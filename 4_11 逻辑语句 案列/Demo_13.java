
//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
//密码错误， 可以重新输入，最多输入三次。三次均错，则提示退出程序

import java.util.Scanner;
public class Demo_13{
	public static void main(String[] args) {
		
		int count = 3;
		while (count != 0){
			System.out.println("请输入密码：");

			Scanner scan = new Scanner(System.in);
		    String password = scan.nextLine();

		    if(password.equals("123456") ){
				System.out.println("密码正确，登陆成功");
				break;
		    }else{
		    	count --;
				System.out.println("密码错误，你还有"+count+"次机会");
		    }
		} 
	}
}