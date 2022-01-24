//5장 DFS (음료수 얼려 먹기 )

package number_1;

import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;
    private static int [][] array;

    public static boolean dfs(int x, int y){
        if(x>=n ||y>=m || x<0 || y<0){
            return false;
        }

        if(array[x][y]==0){
            array[x][y]=1;
            //재귀함수 이용해 인접한 노드 bfs탐색
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();//버퍼 비우기

        array = new int[n][m];

        //2중 배열에 값 넣기
        for(int i =0; i<n; i++){
            String s = sc.nextLine();
            for(int j=0; j<m; j++){
                array[i][j] = s.charAt(j) -'0';
            }
        }

        int result =0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dfs(i, j)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
