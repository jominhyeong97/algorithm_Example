package A2dfs;

import java.util.Arrays;

public class A0401완전탐색관련프로그래머스 {

    static boolean[] visited;
    static int maxCount = 0; // 최대 던전 클리어 수 기록

    public static void main(String[] args) {
        int [][] arr = {{80,20},{50,40},{30,10}};
        A0401완전탐색관련프로그래머스 a1 = new A0401완전탐색관련프로그래머스();
        visited = new boolean[arr.length];
        int k = 80;

        System.out.print(a1.solution(k, arr, 0)); // count는 int로 넘김 (현재 클리어 수)
    }

    // k: 남은 피로도, dungeons: 던전 배열, count: 지금까지 클리어한 던전 수
    public int solution(int k, int[][] dungeons, int count) {

        maxCount = Math.max(maxCount, count); // 최대 클리어 수 갱신

        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) { // 아직 방문 안했고, 피로도 충분하면
                visited[i] = true;
                solution(k - dungeons[i][1], dungeons, count + 1); // 재귀 호출 (피로도 차감, count 증가)
                visited[i] = false; // 백트래킹: 방문표시 원상복구
            }
        }

        return maxCount;
    }
}