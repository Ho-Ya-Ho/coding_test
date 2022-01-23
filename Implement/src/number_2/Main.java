//4장 구현(시각)

package number_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result =0;

        if(0 > n || n > 23){ //범위 (0 <= n <= 23) 제한
            System.out.println("error");
            System.exit(0);
        }

        for(int hour =0; hour <= n; hour++){
            for(int minute =0; minute < 60; minute++){
                for(int second=0; second<60; second++){
                    if(hour % 10 ==3 || minute /10 ==3 || minute %10 ==3 ||second /10 ==3 || second %10 ==3){
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
