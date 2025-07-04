package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A04완전탐색관련백준문제 {
    static Set<String > set;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] arrs;

    public static void main(String[] args) throws IOException {

        //https://www.acmicpc.net/problem/2210

        Set<Integer> result = new HashSet<>();
        arrs = new int[5][5];
        set = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //배열 조립
            for(int i=0; i<5; i++) {
                String [] lines = br.readLine().split(" ");
                for(int j=0; j<5; j++) {
                    arrs[i][j] = Integer.parseInt(lines[j]);
                }
            }
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                jump(String.valueOf(arrs[i][j]),i,j);
            }
        }
        System.out.print(set.size());
    }

    static void jump(String temp,int startIndex, int endIndex) { //배열의 한 점에서 갈 수 있는 경우의수를 set에 넣음.

        if(temp.length() == 6) { //문자열의 길이가 6
            set.add(temp);
            return;
            }
        for(int k=0; k<4; k++) {

            int nx = startIndex + dx[k]; //만약 현재위치 (0,0) 이라면
            int ny = endIndex + dy[k];   //상하좌우로 움직임
            //여기에 nx ny 검사로직
            if(nx < 0 || ny < 0 || nx > 4 || ny > 4) {
                continue;
            } else {
                jump(temp+(arrs[nx][ny]),nx,ny);
            }
        }
    }
}
