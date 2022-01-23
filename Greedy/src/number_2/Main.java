//11장 그리디(곱하기 혹은 더하기)

package number_2;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result=0;

        if(s.length() < 1 || s.length() >20){
            System.out.println("error");
        }

        for(int i =0; i<s.length(); i++) {
            char a = s.charAt(i);

            if(a=='0' || a=='1'){
                result += (a-'0');
            }
            else{
                if(result==0){
                    result += (a-'0');
                }
                else{
                    result *= (a-'0');
                }
            }

        }
        System.out.println(result);
    }
}
