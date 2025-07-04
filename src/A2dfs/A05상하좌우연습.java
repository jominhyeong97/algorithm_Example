package A2dfs;

import java.util.Arrays;

public class A05상하좌우연습 {
    static int[][] arr;
    public static void main(String[] args) {
     arr = new int[][] {{1,1,1,1,1},
                        {1,1,3,1,1},
                        {1,2,1,4,1},
                        {1,1,7,2,1},
                        {1,1,1,1,1}};

     A05상하좌우연습 a5 = new A05상하좌우연습();

        int[] current = new int[]{arr[2][2]};
        a5.up(current);

        System.out.println(Arrays.toString(current));

//        int[] dx = {-1,1,0,0};
//        int[] dy = {0,0,1,-1};
//
//        for(int i=0; i<4; i++) {
//            int nx = current[0] + dx[i];
//            int ny = current[1] + dy[i];
//            System.out.println(nx + "," + ny);
//        }
    }

    public void up (int[] current) {
        int[] up = {(current[0]-1),(current[1])};
    }
    public void down (int[] current) {
        int[] down = {(current[0]+1),(current[1])};
    }
    public void left (int[] current) {
        int[] left = {(current[0]),(current[1])-1};
    }
    public void right (int[] current) {
        int[] right = {(current[0]),(current[1])+1};
    }



}
