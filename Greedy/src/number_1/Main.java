//3장 그리디(1이 될 때까지)

package number_1;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;

            while (true) {
                if (N % K == 0) {
                    N /= K;
                } else {
                    N--;
                }
                count++;
                if (N <= 1)
                    break;
            }

            System.out.println(count);
        }
}
