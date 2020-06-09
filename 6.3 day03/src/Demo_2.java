//import java.util.Scanner;
//
//public class Demo_2 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        //转换为字符
//        char[] array = str.toCharArray();
//        int l=0;
//        int r=0;
//        int maxL = l;
//        int maxR = r;
//        int max = 0;
//
//        while(r != array.length){
//            if(l == r){
//                if(array[l] >= 'a' && array[l] <= 'z'){
//                    l++;
//                    r++;
//                }else{
//                    r++;
//                }
//            }else{
//                if(array[r] >= 'a' && array[r] <= 'z'){
//                    if(r-l > max){
//                        max = r-l;
//                        maxL = l;
//                        maxR = r;
//                    }
//                    l = r;
//                }else{
//                    r++;
//                    if(r == array.length){
//                        if(r-l > max){
//                            max = r-l;
//                            maxL = l;
//                            maxR = r;
//                        }
//                    }
//                }
//            }
//        }
//        for(int i=maxL; i<maxR; i++){
//            System.out.print(array[i]);
//        }
//    }
//}


import java.util.Scanner;

public class Demo_2 {
    public static void main(String[] args){
        //思路：两层循环：找到起点，然后计算长度，从原字符串中截取
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int count = 0;
        String result = "";
        for(int i = 0;i<arr.length;++i){
            if(arr[i]>='0'&&arr[i]<='9'){  //当前的是数字
                int index = i;
                count = 1;	//初始化计数器
                for(int j = i+1;j<arr.length;++j){
                    if(arr[j]>='0'&&arr[j]<='9'){
                        count++;
                        index = j;
                    }else{
                        break;
                    }
                }
                if(count>result.length()){
                    result = str.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}

