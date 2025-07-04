package A3bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A05비노드형식의최단거리 {

    static Queue<int[]> queue;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
//        백준 : 숨바꼭질 https://www.acmicpc.net/problem/1697 - 중복제거 로직 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        queue = new LinkedList<>(); //계산된 값, 횟수 넣는 배열
        visited = new boolean[100001]; //방문처리 배열
        int [] arr = new int[3]; //계산 방법 배열
        queue.add(new int[]{x,0}); //초기 값 5와 횟수 0을 넣음
        visited[x] = true; //5 방문설정

        int result = 0; //정답 넣는 변수

        while (!queue.isEmpty()) {
            int temp[] = queue.poll(); //선택범위가 담긴 큐에서 임시 값을 받을 변수
            int tempValue = temp[0]; //계산 값
            int tempCount = temp[1]; //계산 횟수

            if(tempValue == y) { //계산 값이 목표값이라면
                result = tempCount;
                System.out.print(result); //결과 출력
                return; //끝
            }

            arr[0] = tempValue - 1; //계산 방법들
            arr[1]  = tempValue + 1;
            arr[2] = tempValue * 2;

            for(int a : arr) { //초기값을 여러 방법으로 for문 예)4 , 5, 10
                if(a >= 0 && a <= 100000 && !visited[a]) {
                    queue.add(new int [] {a,tempCount+1}); //4, 5, 10을 넣고 각각 횟수 1증가
                    visited[a] = true; //방문해서 다시 오지 않게
                }
            }

        }

    }
}
