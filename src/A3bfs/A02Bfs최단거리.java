    package A3bfs;

    import java.util.*;

    public class A02Bfs최단거리 {

        static List<List<Integer>> adjList;
        static boolean[] visited;
        static int [] distance;

        public static void main(String[] args) {
            //방문할수있는점이 여러개면 정점번호가 작은것을 먼저 방문
            //출발은 0부터 dfs 방문시 0 1 3 2 4
            int[][] nodes = {{0, 2}, {0, 1}, {1, 3}, {2, 3}, {2, 4}};

            visited = new boolean[5];
    //        인접리스트를 활용해서 인접해있는 노드를 빠르게 접근
            adjList = new ArrayList<>();
            distance = new int[5];

            for (int i = 0; i < 5; i++) {
                adjList.add(new ArrayList<>());
            }

            for (int i = 0; i < nodes.length; i++) {
                int to = nodes[i][0];
                int from = nodes[i][1];
    //            단방향
                adjList.get(to).add(from);
    //            양방향
                adjList.get(from).add(to);

            }
            for (int i = 0; i < adjList.size(); i++) {
                adjList.get(i).sort(Comparator.naturalOrder());
            }

            int target = 4;
//            Queue<int[]> myQueue = new LinkedList<>(); 간선마다 가중치가 있는경우 0번째는 노드번호 1번째는 거리
            Queue<Integer> myQueue = new LinkedList<>();
            myQueue.add(0); // 0부터 출발
            visited[0] = true;
            while (!myQueue.isEmpty()) {
                int temp = myQueue.poll();
                for(int a : adjList.get(temp)) {

                    if(!visited[a]) {
                        myQueue.add(a);
                        visited[a] = true;
                        distance[a] = distance[temp] + 1;

                    }

                }
            }

            System.out.println(distance[target]);


        }


    }