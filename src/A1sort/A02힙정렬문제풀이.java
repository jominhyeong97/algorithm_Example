package A1sort;

public class A02힙정렬문제풀이 {
//    명예의전당 : 프로그래머스
//    야근지수 : 프로그래머스

    public static void main(String[] args) {

        int [] score = {1,2,3,4,5};
        A02힙정렬문제풀이 a1 = new A02힙정렬문제풀이();

        for(int i=score.length/2-1; i>=0; i--) {
            a1.solution(i,score,score.length);
        }

        for(int i=score.length-1; i>=0; i--) {
            int temp = score[i];
            score[i] = score[0];
            score[0] = temp;

            a1.solution(0,score, i);
        }




    }



    int solution(int k, int score[], int size) {
        // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.

        int smallest = k;
        int leftIndex = k * 2 + 1;
        int rightIndex = k * 2 + 2;

        if(leftIndex<size && score[leftIndex] < score[smallest]) {
           smallest = leftIndex;

        }

        if(rightIndex<size && score[rightIndex] < score[smallest]) {
            smallest = rightIndex;


        }

        if(score[smallest]!=score[k]) {
            int temp = score[k];
            score[k] = score[smallest];
            score[smallest] = temp;
            solution(smallest, score,size);
        }

        return score[0];


    }
}
