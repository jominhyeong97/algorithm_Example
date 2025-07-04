package A07이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A02이분탐색활용문제 {
    public static void main(String[] args) throws IOException {
//        예산 : 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String [] line = br.readLine().split(" ");
        int [] arr = new int[x];
        for(int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int budget = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int sum = 0;

        for(int a : arr) {
            sum += a;
        }

        int sumMinusBudget = sum - budget;

        while (sumMinusBudget>0) {
            Arrays.sort(arr);
            arr[x-1] -= 1;
            sumMinusBudget -= 1;
        }
        Arrays.sort(arr);

        System.out.println(arr[x-1]);

    }
}
