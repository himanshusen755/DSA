import java.util.*;

/**
 * Adjacencylist
 */
public class Adjacencylist {

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> AL = new ArrayList<>(4);

        for (int i = 0; i < V; i++) {
            AL.add(new ArrayList<>());
        }

        addEdge(AL , 0 ,1);
        addEdge(AL , 0 ,2);
        addEdge(AL , 1 ,3);
        addEdge(AL , 2 ,3);
        addEdge(AL, 1, 2);


        System.out.println(AL);

    }

    private static void addEdge(List<List<Integer>> aL, int i, int j) {
        aL.get(i).add(j);
        aL.get(j).add(i);
    }
}