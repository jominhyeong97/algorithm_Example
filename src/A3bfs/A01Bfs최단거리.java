    package A3bfs;

    import java.util.*;

    public class A01Bfs최단거리 {

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

            for (int i = 0; i < 5; i++) {
                adjList.add(new ArrayList<>());
            }

            for (int i = 0; i < nodes.length; i++) {
    //            단방향
                adjList.get(nodes[i][0]).add(nodes[i][1]);
    //            양방향
                adjList.get(nodes[i][1]).add(nodes[i][0]);

            }
            for (int i = 0; i < adjList.size(); i++) {
                adjList.get(i).sort(Comparator.naturalOrder());
            }
            distance = new int[5];
            int target = 4;
//            Queue<int[]> myQueue = new LinkedList<>(); 간선마다 가중치가 있는경우 0번째는 노드번호 1번째는 거리
            Queue<Integer> myQueue = new LinkedList<>();
            myQueue.add(0);
            visited[0] = true;
            while (!myQueue.isEmpty()) {
                int temp = myQueue.poll();

                for(int a : adjList.get(temp)) {
                    if(!visited[a]) {
                        myQueue.add(a);
                        distance[a] = distance[temp]; //????
                        visited[a] = true; //queue에 담는 시점에 true 세팅해야지 중복해서 안담김

                        if(target == a) {
                            break;
                        }

                    }
                }
            }

            System.out.println(distance[target]);


        }


    }