package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A01계단관련 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
//        멀리 뛰기 : 프로그래머스
//        백준 : 계단오르기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        arr = new int[x+1];
        for(int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int [] maxArr = new int[arr.length];

        if (x >= 1) maxArr[0] = arr[0];
        if (x >= 2) maxArr[1] = arr[0] + arr[1];
        if (x >= 3) maxArr[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);
        for(int i=3; i<maxArr.length; i++) {

                int a = maxArr[i - 2] + arr[i];
                int b = maxArr[i - 3] + arr[i - 1] + arr[i];

                maxArr[i] = Math.max(a, b);
        }
        System.out.println(maxArr[x]);



















//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(br.readLine()  );
//        int [] arr = new int [x];
//        for(int i=0; i<x; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//
//    }
//
//    public long solution(int n) {
//
//        arr = new int[n];
//        arr[0] = 1;
//        arr[1] = 2;
//        for(int i=0; i<n; i++) {
//            if(i>=1) {
//                arr[i] = arr[i-1] + arr[i];
//
//            } else {
//                return 1;
//            }
//        }
//
//        return arr[n-1];

    }

}
