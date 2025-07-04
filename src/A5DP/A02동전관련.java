package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A02동전관련 {
    public static void main(String[] args) throws IOException {
//        //        1,4,5의 숫자가 있을때, 조합하여 13를 만들 수 있는 조합중 가장 짧은 조합의 길이
//
//        int [] arr = {1,4,5};
//
//        int target = 13;
////        greedy 문제를 풀 경우 : 5개동전
////        dp로 문제를 풀경우 : 4*2 +5*1 = 3개동전
////        dfs,bfs > 시간초과
////        f(n) = Min(f(n-ni), f(n-2)) + 1
//
//
//        int[] minArr = new int[target+1];
//
//        for(int i=1; i<=target; i++) {
//            int min = Integer.MAX_VALUE;
//            for(int a : arr) {
//                if(i-a>0 && min>minArr[i-a]) {
//                    min=minArr[i-a];
//                }
//            }
//            minArr[i] = min + 1 ;
//        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int coin = Integer.parseInt(line[0]);
        int target = Integer.parseInt(line[1]);

        int [] coins = new int[coin];
        for(int i=0; i<coin; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int[] minArr = new int[target+1];



        for(int i=1; i<=target; i++) {
            int min = Integer.MAX_VALUE;
            for(int a : coins) {
                if(i - a >= 0 && minArr[i - a] != Integer.MAX_VALUE) {
                    min=minArr[i-a];
                }
            }
            minArr[i] = min + 1 ;
        }

        System.out.println(minArr[target]);










    }
}
