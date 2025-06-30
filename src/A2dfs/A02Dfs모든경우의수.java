package A2dfs;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A02Dfs모든경우의수 {

    static List<List<Integer>> adjList;
    static List<List<Integer>> result;

    public static void main(String[] args) {


//        1부터 10까지의 노드 존재
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};


        adjList = new ArrayList<>();

//        여기서는 1번이 루트 노드라고 정해졌기 때문에, visited제외하고 단방향노드로 설계
//        11로 둔 이유는 1개 여유두려고
        for(int i=0; i<11; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<nodes.length; i++) {
//            단방향
            adjList.get(nodes[i][0]).add(nodes[i][1]);
        }

        System.out.println(adjList);

        for(int i=0; i<adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        result = new ArrayList<>();


        dfs(1,new ArrayList<>());
        System.out.println(result);

    }

    static void dfs (int start, List<Integer> temp) {
        temp.add(start);
        if(adjList.get(start).isEmpty()) {
            result.add(new ArrayList<>(temp));
        }

        for(int a : adjList.get(start)) {
            dfs(a,temp);
            temp.remove(temp.size()-1);
        }
    }

}
