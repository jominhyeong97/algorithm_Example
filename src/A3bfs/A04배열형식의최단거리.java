package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class A04배열형식의최단거리 {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) {
//        프로그래머스 게임맵
        int[][] maps =
                {{1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};

        System.out.println(solution(maps));
    }

    static int solution(int[][] maps) {


        Queue<int[]> moveQue = new LinkedList<>();
//        moveWhere.add(new int[]{0,0,0})
        boolean[][]  visited = new boolean[5][5];
        moveQue.add(new int[]{0,0,0}); //x좌표, y좌표, 거리
        visited[0][0] = true; //x,y좌표 방문했습니다.

        while (!moveQue.isEmpty()) { //가야할 곳을 담은 큐

            int[] temp = moveQue.poll();
            int x = temp[0];
            int y = temp[1];
            int dist = temp[2];

            for (int k = 0; k < 4; k++) { //이동 for문
                int nx = x + dx[k]; //nx : 이동한 x좌표
                int ny = y + dy[k]; //ny : 이동한 y좌표


                if(nx == 4 && ny ==4) { //움직여서 44가 됐다면 이동했으니까 한칸 더하고 끝.
                    return temp[2] +1;
                }

                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length) { //만약 0이 아니면
                    if(!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        moveQue.add(new int[]{nx, ny, dist + 1});
                    }
                }

            }

        }
        return -1;

    }

}
