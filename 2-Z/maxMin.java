
//给定三个 int 变量, 求其中的最大值和最小值.

public class maxMin{
	/**
	 * 方法1
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		int a = 10;
		int b = 30; 
		int c = 20;
	    int max;
	    if (a > b)  {
	    	if (a > c) {
		    		max = a;
		    	} else {
		    		max = c;
		    	}
		    } else {
		    	if (b > c) {
		    		max = b;
		    	} else {
		    		max = c;
		    	}
	    }
	    System.out.println(max);
	}


	/**
	 * 方法2：
	 */
	public static void main2(String[] args) {
		int a = 10; 
		int b = 30; 
		int c = 20;
	    int max;
	    if (a > b) {
	    	max = a;
	    } else {
	    	max = b;
	    }
	    if (max < c) {
		    max = c;
	    } 
	    System.out.println(max);
	}

	/**
	 * 方法3:if语句（假定a最大，b,c与a比较，如果比a大，则赋值给max）
	 */
	public static void main3(String[] args) {
		
	    int a = 10;
	    int b = 30;
	    int c = 20;
	    int max = a;
	    if (b > max) {
	    	max = b;
	    }
	    if (c > max) {
	    	max = c;
	    }
	    System.out.println(max);
	}

	/**
	 * 方法4：三元运算符
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
		int max;
	    int temp = (a > b) ? a : b;
	    max = (temp > c) ? temp : c;
	    
	    //int max = ((a > b ? a : b) > c) ? (a > b ? a : b) : c;
	    System.out.println(max);
	}

	/**
	 * 方法5：if语句 + 逻辑运算符 &&（a,b,c三个数，如果不是a最大，或者b最大，就是c最大）
	 */
	
	public static void main5(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
	    int max;
	    if (a > b && a > c) {
	    	max = a;
	    } else if (c > a && c > b) {
	    	max = c;
	    } else
	    max = b;
	    System.out.println(max);
	}
}


 
