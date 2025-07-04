package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class A05배낭문제 {

    //주어진 데이터를 중복해서 사용할 수 있는지 구분 필요.
    public static void main(String[] args) throws IOException {
        //호텔 : 백준
        //평범한 배낭 : 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line1 = br.readLine().split(" ");
        int people = Integer.parseInt(line1[0]); //12
        int cities = Integer.parseInt(line1[1]); //2
        Map<Integer,Integer> myMap = new HashMap<>();

        int[][] arr = new int[cities][2];

        for(int i=0; i<cities; i++) {
            String [] line2 = br.readLine().split(" ");
            myMap.put(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]));
        } // {3,5}{1,1}

        int [] dp = new int [people];

        System.out.println(myMap);

        for(int i=0; i<people; i++) { //dp 생성용
            int min = Integer.MAX_VALUE;
            for(int customer : myMap.keySet()) {
                
            }
        }













    }
}
