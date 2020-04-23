import java.util.Arrays;

/**
 * // 在 pos 位置新增元素
 * public void add(int pos, int data) {
 *
 *  }
 *
 *
 *  分析：1、判断pos位置是否合法  （不能为负数，不能超过usedSize）
 *       2、移动数据 （从最后一个元素移，usedSize-1 ） （每移动一次，i--）
 *       3、添加pos ， this.elem[pose] = data
 *       4、数组元素多了一个，即usedSize++
 */



public class Demo_4 {
    public int[] elem;
    public int usedSize;
    public static final int Capacity = 10;

    public Demo_4() {
        this.elem = new int[Capacity];
        this.usedSize = 10;
    }


    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }



    //判断数组是不是满的
    private boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
        //return this.usedSize == this.elem.length;
    }


    public void add(int pos,int data){
        //判断是不满了 ，满了并扩容
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        //判断pos位置是否合法  （不能为负数，不能超过usedSize）
        if(pos<0 || pos>this.usedSize){
            return ;
        }

        //移动数据 （从最后一个元素移，usedSize-1 ） （每移动一次，i--）
        for (int i = this.usedSize - 1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }

        //添加pos，this.elem[pose] = data
        this.elem[pos] = data;

        //数组元素多了一个，即usedSize++
        this.usedSize ++;
    }

    public static void main(String[] args) {
        //创建一个对象
        Demo_4 demo_4 = new Demo_4();

        //添加元素
        for (int i = 0; i < 10 ; i++) {
            //demo_4.elem[i] = i;
            demo_4.add(i,i);
        }

        demo_4.display();

        //调用add
        demo_4.add(10,11);//下标为0处添加11

        //调用display
        demo_4.display();

    }
}








