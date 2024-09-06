import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class kruskal {
    static int V = 4;
    static int[] parent = new int[V];
    public static void main(String[] args) {
        ArrayList<int[]> edge =new ArrayList<>();
        edge.add(new int[]{0,1,2});
        edge.add(new int[]{0,2,3});
        edge.add(new int[]{1,2,1});
        edge.add(new int[]{1,3,4});
        edge.add(new int[]{2,3,5});

        int res  = spanningTree(V , edge);

        System.out.println("Minimum wiegth spanning trees : " + res);

    }
    private static int spanningTree(int v2, ArrayList<int[]> edge) {

        //Sort the edges on the basis of their wiegth
        Collections.sort(edge , Comparator.comparingInt(a -> a[2]));
        int cost = 0;

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        for (int[] i : edge) {
            int u = i[0];
            int v = i[1];
            int w = i[2];

            //check if cycle -u and v should have different parents , else cycle
            if (find(u)!=find(v)) {
                cost+=w;
                union(u,v);
            }
        }
            return cost;
    }
    private static void union(int u, int v) {
        int a = find(u);
        int b = find(v);
        parent[b] = a;
    }
    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return find(parent[x]);
    }
}
