import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

/**
 * 作业标题
 * 递归求解汉诺塔问题
 *
 * 作业内容
 * 递归求解汉诺塔问题
 *
 */
public class Demo_10 {
    public static void move(char pos1,char pos2){
        System.out.println(pos1 + "->" + pos2);
    }


    public static void hanoi(int x,char pos1,char pos2,char pos3){
        //通过c将n-1个盘子从a移到b
        //将a上最后一个盘子移到c
        //通过a将n-1个盘子从b移到c

        //终止条件：x == 1,pos1 -> pos3

        if(x == 1){
            move(pos1,pos3);
        }else {
            hanoi(x - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(x - 1, pos2, pos1, pos3);
        }
    }


    public static void main(String[] args) {
        System.out.println("请输入盘子数量：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        hanoi(n,'A','B','C');
    }
}
