package A06투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A03두수의합또는차 {
//    백준 : 두 용액

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = new int[x];

        for(int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int min = Integer.MAX_VALUE;

        int start = 0;
        int end = 1;

        Arrays.sort(arr);

        int [] result2 = new int[2];

        while (start<end) {
            if(end == arr.length-1) {
                if (Math.abs(arr[start] + arr[end]) < min) {
                    min = Math.abs(arr[start] + arr[end]);

                    result2[0] = arr[start];
                    result2[1] = arr[end];
                    start++;

                } else {start++;}
            }
            else if(end < arr.length-1) {
                if (Math.abs(arr[start] + arr[end]) < min) {

                    min = Math.abs(arr[start] + arr[end]);
                    result2[0] = arr[start];
                    result2[1] = arr[end];
                    end++;

                } else {end++;}
            }

        }

        System.out.println(Arrays.toString(result2));

    }

}
