package A1sort;

import java.lang.reflect.Array;
import java.util.*;

//트리탐색 + 재귀적호출
public class A01heapsSort구현 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
//        최초힙구성 : n*log(n)
        for (int i=arr.length/2-1; i>=0; i--){
            heapify(arr, i, arr.length);
        }

//        루트노드와 최하위노드를 자리change해가면서 재heapify
        for (int i=arr.length-1; i>=0; i--){
//            0번째 index와 마지막index의 자리change
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }

//        pq를 통한 정렬방법
//        최초힙구성 : n*log(n)
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(7,6,5,8,3,5,9,1,6));
        System.out.println(pq.poll()); //log(n)
        pq.add(6); //log(n)
    }
    static void heapify(int[] arr, int parent, int lenth){
//        자식노드와의 비교 : 왼쪽자식노드(parent*2+1), 오른쪽자식노드(parent*2+2)
        int left = parent*2+1;
        int right = parent*2+2;
        int smallest = parent;
//        자식이 더 작으면 자리 change
        if(left < lenth && arr[smallest] < arr[left]){
            smallest = left;
        }
        if(right < lenth && arr[smallest] < arr[right]){
            smallest = right;
        }
        if(smallest!=parent){
            int temp = arr[parent];
            arr[parent] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, smallest, lenth);
        }
    }
}
