import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * case ：汉诺塔
 * 分析：
 * A    B   C
 * 1个盘子  A -> C  2^1 -1
 * 2个盘子  A -> B    A -> C  B -> C   2^2 - 1
 * 3个盘子  A -> C    A -> B  C -> B   A -> C  B -> A  B -> C  A -> C   2^3 - 1
 */


public class Demo_1 {
    /**
     *将盘子从pos1 移到 pos2
     * @param pos1
     * @param pos2
     */
    public static void move(char pos1,char pos2){
        System.out.println(pos1 + " -> " + pos2 + " ");
    }

    /**
     * @param n  --- 盘子个数
     * @param pos1 --- 移动时盘子的起始位置
     * @param pos2 --- 移动时盘子的中途位置
     * @param pos3 --- 移动时盘子的目的地位置
     *
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n == 1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入汉诺塔盘子的个数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        hanoi(n,'A','B','C');
        System.out.println();

    }


}
