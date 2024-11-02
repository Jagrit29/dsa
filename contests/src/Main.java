
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges[][] = new int[n-1][2];
        int ind[] = new int[n+1];

        for(int i=0;i<n-1;i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }


        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++) {
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
            ind[u]++;
            ind[v]++;
        }

        // now all the nodes which have ind as 3 and thre two neighbrs have ind of 2 are valid candidates;
        int ans = 0;
        for(int i=0;i<=n;i++) {
            if(ind[i] == 3) {
                // get it's neight;
                List<Integer> neigh = graph.get(i);
                // check ind of it's neight;
                int count = 0;
                for(int ne: neigh) {
                    if(ind[ne]==2) {
                        count++;
                    }
                }
                ans = ans + (count-1);

            }
        }

        System.out.println(Math.max(ans, 0));
    }
}

