//12장 구현(문자열 재정렬)

package number_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        ArrayList<Character> result = new ArrayList<>();
        int number =0;

        for(int i =0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){ //각자리마다 문자인지 판단
                result.add(s.charAt(i));
            }
            else{
                number +=s.charAt(i) - '0';
            }
        }
        Collections.sort(result); //오름차순 정렬

        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i));
        }
        System.out.println(number);
    }
}
