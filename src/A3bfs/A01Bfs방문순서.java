package A3bfs;

import javax.print.DocFlavor;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class A01Bfs방문순서 {

    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) {
        //방문할수있는점이 여러개면 정점번호가 작은것을 먼저 방문
        //출발은 0부터 dfs 방문시 0 1 3 2 4
        int[][] nodes = {{0, 2}, {0, 1}, {1, 3}, {2, 3}, {2, 4}};

        adjList = new ArrayList<>();
        visited = new boolean[5];

        for(int i=0; i<5; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<5; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);

        }

        for(int i=0; i<5; i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        System.out.println(adjList);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;


        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println(temp);

            for(int a : adjList.get(temp)) {
                if(!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }

        }



    }


}