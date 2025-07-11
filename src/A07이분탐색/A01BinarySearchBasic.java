package A07이분탐색;

public class A01BinarySearchBasic {
    public static void main(String[] args) {
//        이분탐색은 사전에 정렬이 되어있어야 함

        /*int[] arr ={1,3,5,7,9,11,13,15,17,19};
        int start = 0;
        int end = arr.length-1;
        int target = 17;
        int answer = -1;

        while (start<=end) {
            int mid = (start + end)/2;

            if(target==arr[mid]) {
                answer = mid;
                break;
            }

            else if(target>arr[mid]) {
                start = mid +1;

            }
            else if(target<arr[mid]) {
                end = mid -1;

            }

        }
        System.out.println(answer);*/



//        target이 arr에 있다면 index값을 리턴하고, arr에 없다면 있어야할 자리 index를 return
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 2;
        int answer = -1;
        int start =0 ;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) /2 ;
            if(target == arr[mid]) {
                answer = mid;
//                조건에 맞는 값을 찾았어도 최소값/최대값을 위해 이분탐색을 계쏙 진행할 수 있음
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
//                조건에 맞는 딱 맞는 값이 없는 경우
                answer = mid;
            }
        }
        System.out.println(answer);




//        응용case : 배열(탐색의대상)을 직접설정

    }
}
