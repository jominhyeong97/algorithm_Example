package A06투포인터;

import java.util.ArrayList;
import java.util.List;

public class A02수열의범위 {
    public static void main(String[] args) {
        A02수열의범위 a2 = new A02수열의범위();
        System.out.println(a2.solution(15));
    }
    //프로그래머스 : 숫자의 표현 - 구간의 합
    // 연속된 부분 수열의 합 : 프로그래머스

    public int solution(int n) {

        int [] arr = new int [n];

        for(int i=0; i<n; i++) {
            arr[i] = i +1;
        }

        int startNum = 1;
        int endNum = startNum;
        int target = n;
        int total = 1;
        int count = 0;
        while (startNum <= endNum && endNum<=n) {

            if(total == n) {
                count++;
                endNum ++; //또는 start++
                total += endNum;
            }
            else if(total<n) {
                endNum++;
                total+=endNum;
            }
            else if(total>n) {
                total -= startNum;
                startNum++;

            }

        }

        int answer = count;
        return answer;

    }



}
