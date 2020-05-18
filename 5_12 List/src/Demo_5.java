import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class Demo_5 {
    //类似于一个二维数组
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        if(numRows == 0){
            return ret;
        }

        //第一行为1
        List<Integer> one = new ArrayList<>();
        ret.add(new ArrayList<>());//拿到一个一维数组
        ret.get(0).add(1);

        //第二行开始计算
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            //第一个元素始终为1
            curRow.add(1);

            //除了最后一列
            List<Integer> prevRow = ret.get(i - 1);
            for (int j = 1; j < i; j++) {
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x+y);
            }

            //最后一个元素
            curRow.add(1);

            //一行结束，将这一行添加在ret中
            ret.add(curRow);
        }
        return ret;
    }

}
