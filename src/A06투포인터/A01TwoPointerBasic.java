package A06투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//end 인덱스, 정렬 여부, 조건식 중요
public class A01TwoPointerBasic {
    public static void main(String[] args) {
//        아래배열에서 target이 될 수 있는 두 수의 조합을 모두 찾아라.
//        아래 코드는 복잡도 n^2
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;

        List<int[]> myList = new ArrayList<>();

//        for(int i=0; i<nums.length; i++) {
//            for(int j=i+1; j<nums.length; j++) {
//                int a = nums[i];
//                int b = nums[j];
//                if(a + b == target) {
//                    myList.add(new int[] {a, b});
//                }
//            }
//        }

        for(int [] a : myList) {
            System.out.println(Arrays.toString(a));
        }

//        위 배열을 정렬 시 : 1,2,3,4,5,6,7,8,9
//        end가 0부터 출발하는 경우, end가 length-1 부터 시작하는 경우.
        int start = 0;
        int end = nums.length-1;

//        정렬이 필요한 경우 - 예)두 수의 합일 경우

//        정렬이 필요하지 않은 경우 - 예)구간의 합일 경우
        Arrays.sort(nums); //n*log(n)

        while (start < end ) { // <= 또는 <인 경우 두가지 존재
            int total = nums[start] + nums[end];
            if(total == target) {
                myList.add(new int[] {nums[start],nums[end]});
                start++; //또는 end --;
            } else if(total < target) {
                start++;
            } else if(total > target) {
                end--;
            }
        }

        for(int [] a : myList) {
            System.out.println(Arrays.toString(a));
        }


    }
}
