/**
 * 类和对象实现--编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，
 * 最后实现加减乘除四种运算.
 */
class Calculator{
    private int num1;
    private int num2;

    /**
     * 获得get set 方法
     * @return
     */
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * 创建加减乘除方法
     * @return
     */
    public int Add(){
        return this.num1 + this.num2;
    }

    public int Sub(){
        return this.num1 - this.num2;
    }

    public int Mul(){
        return this.num1 * this.num2;
    }

    public double Dev(){
        return (this.num1*1.0) / this.num2;
    }
}
public class Demo_1{
    public static void main(String[] args) {
        //创建一个对象
        Calculator calculator = new Calculator();

        //赋值--引用成员变量
        calculator.setNum1(12);
        calculator.setNum2(31);

        //引用成员方法
        System.out.println("加法 ---");
        System.out.println(calculator.Add());

        System.out.println("减法 ---");
        System.out.println(calculator.Sub());

        System.out.println("乘法 ---");
        System.out.println(calculator.Mul());

        System.out.println("除法 ---");
        System.out.println(calculator.Dev());

    }
}