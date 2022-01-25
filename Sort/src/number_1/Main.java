package number_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i =0; i<n; i++) {
            int num = sc.nextInt();
            a.add(num);
        }
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            b.add(num);
        }

        Collections.sort(a);
        Collections.sort(b);

        for(int i=0; i<k; i++) {
            a.set(i, b.get(n - i-1));
        }

        int result =0;

        for(int i=0; i<n; i++){
            result += a.get(i);
        }
        System.out.println(result);
    }
}
