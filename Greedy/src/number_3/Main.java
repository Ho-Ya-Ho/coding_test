//11장 그리디(모험가 길드)

package number_3;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int result =0;
        int count =0;

        int N = sc.nextInt();

        for(int i =0; i<N; i++){
            int a = sc.nextInt();
            list.add(a);
        }

        Collections.sort(list);

        for(int i=0; i<N; i++) {
            count++;
            if (count == list.get(i)){
                result++;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
