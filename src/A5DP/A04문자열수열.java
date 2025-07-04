package A5DP;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A04문자열수열 {
//    가장 긴 증가하는 부분 수열(11053)
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int x= Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = new int[x];

        for(int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int [] incrArr = new int[arr.length];
        Arrays.fill(incrArr,1);

        for(int i=1; i<arr.length; i++) { //현재위치
            for(int j=0; j<i; j++) { //이전위치
                if(arr[i]>arr[j]) { //이전값보다 크면
                    incrArr[i] = Math.max(incrArr[i],incrArr[j] + 1); //이전값을 선택 했을 경우 + 1 : 길이가 이어지니까
                }
            }
        }

        System.out.print(Arrays.stream(incrArr).max().getAsInt());*/

//    가장 긴 증가하는 부분 수열(11053)

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int x= Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = new int[x];

        for(int i=0; i<x; i++) { //문제 배열 입력받음
            arr[i] = Integer.parseInt(line[i]);
        }

        int [] dp = new int[arr.length];
        Arrays.fill(dp,1); //dp 1로 세팅
        List<List<Integer>> myList = new ArrayList<>();

        for(int i=0; i<x; i++) {
            myList.add(new ArrayList<>());
        }


        for(int i=1; i<arr.length; i++) { //현재값
            for(int j=0; j<i; j++) { //이전부터 조회하는 값
                if(arr[i]>arr[j]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);

                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());










    }


}
