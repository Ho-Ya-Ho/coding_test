//4장 구현(상하좌우)

package number_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int row =1;
        int column=1;
        sc.nextLine(); // *버퍼 비워주기
        String[] s = sc.nextLine().split(" ");

        for(int i =0; i< s.length; i++){

            switch (s[i]){
                case "R" : row++;
                    break;
                case "L" : row--;
                    break;
                case "U" : column--;
                    break;
                case "D" : column++;
                    break;
            }

            if(row > n)
                row=n;
            if(column > n)
                column=n;
            if(row < 1)
                row=1;
            if(column < 1)
                column=1;
        }


        System.out.println(column +" "+ row);
    }
}
