import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 3, 4, 5};
        int target = 5;
        //result 6,6

        int startIndex = 0;
        int endIndex = 0;

        Deque<Integer> status = new ArrayDeque<>(); //현재 탐색중인 수열 모음
        List<Deque<Integer>> result = new ArrayList<>(); //결과 배열 {{1,1,1,2},{3,4}...}

        //초기값 세팅
        int sum = 0;
        status.addFirst(arr[startIndex]);
        status.addLast(arr[endIndex]);
        sum += arr[startIndex] + arr[endIndex];

        while (startIndex<=endIndex && endIndex<arr.length-1) {

            if(sum==target){ //끝 인덱스를 늘리고 결과 배열에 현재상태 넣음 endindex++했으므로 현상태 배열에 추가
                endIndex++;
                result.add(new ArrayDeque<>(status));
                status.addLast(arr[endIndex]);
                sum += arr[endIndex]; //현재 상태배열의 합
            }

            else if(sum<target) {
                endIndex++;
                status.addLast(arr[endIndex]);
                sum +=arr[endIndex];


            }
            else if(sum>target) {
                startIndex++;
                sum -= status.pollFirst();

            }
        }

        for(Deque<Integer> a : result) {
            System.out.println(a);
        }


    }

}