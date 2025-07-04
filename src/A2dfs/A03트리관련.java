package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03트리관련 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] temp;
    public static void main(String[] args) throws IOException {

//        트리의부모찾기 : 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        adjList = new ArrayList<>();
        visited = new boolean[x+1];
        temp = new int[x+1];

        for (int i=0; i<=x; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<x-1; i++ ){

            String [] line = br.readLine().split(" ");
            int from = Integer.parseInt(line[0]);
            int to = Integer.parseInt(line[1]);
            adjList.get(to).add(from);
            adjList.get(from).add(to);

        }

        dfs(1);

        for(int i=2; i<temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

    static void dfs(int start) {

        visited[start] = true; //여기로

        for(int a : adjList.get(start)) { //만약 start = 2면 2에는 [4]가있고
            if(!visited[a]) { //a는 4가된다.
                temp[a] = start; //temp 배열에 2를 넣고
                dfs(a); //start = 4로 재귀함수 시작
               //여기있던 방문처리
            }
        }
    }
}
