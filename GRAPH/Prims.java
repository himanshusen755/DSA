import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        int V = 4 ; //No of vertices
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        //Define the adjencency list with edge and weights
        //edge from vertex 0 to vertex 1 with weight 2
        adj.get(0).add(new ArrayList<>());
        adj.get(0).get(0).add(1);
        adj.get(0).get(0).add(2);

        //Edge from vertex 0  to vertex with weigth 3 
        adj.get(0).add(new ArrayList<>());
        adj.get(0).get(1).add(2);
        adj.get(0).get(1).add(3);
        
        
        //Edge from vertex 1  to vertex 2 with weigth 1 
        adj.get(1).add(new ArrayList<>());
        adj.get(1).get(0).add(2);
        adj.get(1).get(0).add(1);


        //Edge from vertex 1 to vertex 3 with weigth 4
        adj.get(1).add(new ArrayList<>());
        adj.get(1).get(1).add(3);
        adj.get(1).get(1).add(4);

        //Edge from vertex 2  to vertex 3 with weigth 5
        
        adj.get(2).add(new ArrayList<>());
        adj.get(2).get(0).add(3);
        adj.get(2).get(0).add(5);

        int result = spanningTree(V , adj);
        System.out.println("Minimum Cost :" + result);
    }

    private static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
       //This is implemented by the prIMS Algo
       boolean[] vis = new boolean[v];
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]); //Pair of vertex and weigth
       //Comparator  banaya and lamda function banaya compare method ko override kr the weigth ke basis
       //pe sort krne ke liye
        
       int cost = 0;
        pq.add(new int[]{0,0});
       while (!pq.isEmpty()) {
          int[] arr = pq.remove();
          if (vis[arr[0]]==true) {
            continue;
          }
          
            vis[arr[0]] = true;
            cost+=arr[1];

            for (ArrayList<Integer> i : adj.get(arr[0])) {
                int V = i.get(0); // neighbour vertex
                int w = i .get(1); //weight

                pq.add(new int[]{V , w}); //Type of priority queue is integer;
            }
          
       }
       return cost;
    }
}
