//4장 구현(왕실의 나이트)

package number_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result =0;

        String p = sc.nextLine();

        int row = p.charAt(0) - 'a'+1;
        int column = p.charAt(1) -'0';

        int []dx = {-2, -1, 1, 2, -2, -1, 1, 2};
        int []dy = {-1, -2, 2, 1, 1, 2, -2, -1};

        for(int i =0; i<8; i++){
            int a = row + dx[i];
            int b = column + dy[i];

            if(a >= 1 && a <=8 && b >= 1 && b <=8 )
                result++;
        }
        System.out.println(result);
    }
}
