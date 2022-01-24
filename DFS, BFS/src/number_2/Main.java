//5장 BFS (미로 찾기 )

package number_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}


public class Main {
    private static int n;
    private static int m;
    private static int [][] array;

    private static final int[] dx= {-1, 1, 0, 0};//상, 하 방향벡터
    private static final int[] dy= {0, 0, -1, 1};//좌, 우 방향벡터

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) //예외처리
                    continue;
                if (array[nx][ny] == 0) // 예외처리
                    continue;

                if (array[nx][ny] == 1) { //1이면 큐안에 넣기
                    array[nx][ny] = array[x][y] +1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return array[n-1][m-1];
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
        System.out.println(bfs(0, 0));
    }
}
