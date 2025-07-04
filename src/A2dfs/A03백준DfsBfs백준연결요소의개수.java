package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A03백준DfsBfs백준연결요소의개수 {
    static Queue<Integer> queue;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {

        //https://www.acmicpc.net/problem/11724

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");
        int nodes = Integer.parseInt(line[0]);//노드의 개수
        int lines = Integer.parseInt(line[1]);//간선의개수
        List<List<Integer>> adjList = new ArrayList<>();


        visited = new boolean[nodes+1];


        for(int i=0; i<=nodes; i++) { //빈 배열 만들어 놓기
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<lines; i++) { //양방향 리스트 만들기
            String [] arr = br.readLine().split(" ");
            int to = Integer.parseInt(arr[0]);
            int from = Integer.parseInt(arr[1]);

            adjList.get(to).add(from);
            adjList.get(from).add(to);
        }

        for(int i=0; i<adjList.size(); i++) { //인접리스트 정렬
            adjList.get(i).sort(Comparator.naturalOrder());
        }

//        System.out.println(adjList); //디버깅용

        for(int i=1; i<=nodes; i++) {
            if(!visited[i]) {
                bfs(nodes, i, adjList);
                count++;
            }
        }

        System.out.println(count);


    }

    public static void bfs(int nodes, int startNum, List<List<Integer>> adjList) {
        queue = new LinkedList<>();
        queue.add(startNum);
        visited[startNum] = true;

//        System.out.println("BFS 시작: " + startNum); // 디버깅 1

        while (!queue.isEmpty()) {
            int temp = queue.poll();
//            System.out.println("현재 노드: " + temp); // 디버깅 2

            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
//                    System.out.println("방문 -> " + a); // 디버깅 3
                }
            }
        }

//        System.out.println("BFS 끝: " + startNum); // 디버깅 4
//        System.out.println("===============");
    }
}
