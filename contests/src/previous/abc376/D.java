package previous.abc376;


import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int edges[][] = new int[m][2];

        for(int i=0;i<m;i++) {
            edges[i][0] = sc.nextInt()-1;
            edges[i][1] = sc.nextInt()-1;
        }

        // directed edges;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
        }

        // cycle from 0;
        // BFS from zero

        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        queue.add(0);
        int level = 1;
        while(queue.size() > 0) {
            int size = queue.size();

            for(int i=0;i<size;i++) {
                int at = queue.poll();
                visited.add(at);

                for(int to: graph.get(at)) {
                    if(visited.contains(to) && to == 0) {
                        System.out.println(level);
                        return;
                    } else if (!visited.contains(to)){
                        queue.add(to);
                    }
                }
            }

            level++;
        }

        System.out.println(-1);




    }
}

/*
6 6
1 2
2 3
3 2
1 5
5 6
6 1

3 3
1 2
2 3
3 2


 */
