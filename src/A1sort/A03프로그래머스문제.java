package A1sort;

import java.util.*;

public class A03프로그래머스문제 {
    static PriorityQueue<Integer> queue;
    static int n;
    public static void main(String[] args) {

        queue = new PriorityQueue<>();
        int [] works = new int[]{0,0,0};
        n = 1;
        A03프로그래머스문제 a3 = new A03프로그래머스문제();

        System.out.println(a3.solution(n,works));

    }

    public long solution(int n, int[] works) {
        queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a : works) {
            queue.add(a);
        }
        long answer = 0;

        for(int i=0; i<n; i++) {
            int temp = queue.poll();

            if(temp==0) {
                return 0;
            }
            temp -= 1;
            queue.add(temp);
        }

        for(int a : queue) {
            answer += a*a;
        }
        return answer;
    }

}
