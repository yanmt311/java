import java.util.HashSet;
import java.util.Scanner;

public class Demo_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        while(scanner.hasNext()){
            hashSet.add(scanner.next());
        }
        int num = hashSet.size();
        System.out.println(num);
    }
}
