import java.util.LinkedList;
import java.util.Random;

public class Graph {
    private int V;
    public LinkedList<Integer> adj[];
    private int[] color;

    //Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
        color=new int[V];
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); //Graph is undirected
    }
    public int[] addColor()
    {
        Random rn=new Random();
        for (int i = 0; i <V ; i++) {
            color[i]=rn.nextInt(3)+1;
        }
        return color;
    }
}

