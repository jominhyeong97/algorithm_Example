package A3bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A03인접리스트활용최단거리 {

//    프로그래머스 : 가장 먼 노드

    //    촌수 계산 : 백준

static Queue<Integer> queue;
static boolean[] visited;
static int [] distance;


    public int solution(int n, int[][] edge) {


        queue = new LinkedList<>();
        visited = new boolean[n+1];
        distance = new int[n+1];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<edge.length; i++) {
            int from = edge[i][0];
            int to = edge[i][1];

            adjList.get(from).add(to);
            adjList.get(to).add(from);

        } //여기까지 인접리스트 생성 완료

        queue.add(1);
        visited[1] = true;
        distance[1] = 0;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for(int a : adjList.get(temp)) {

                if(!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                    distance[a] = distance[temp] + 1;
                }

            }
        }

        int max = Arrays.stream(distance).max().getAsInt();
        int answer = (int)Arrays.stream(distance).filter(a->a==max).count();

        return answer;
    }

}
