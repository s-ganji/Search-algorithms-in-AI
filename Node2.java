
public class Node2 {
    public final int value;
    public double pathCost;
    public Edge2[] adjacencies;
    public int[] colorcan;
    public Node2 parent;
    public int color;
    public Node2(int val,int c) {

        value = val;
        color=c;

    }


    public Node2(Node2 node) {
        int i = 0;
        adjacencies = new Edge2[node.adjacencies.length];
        value = node.value;
        pathCost = node.pathCost;
        for (int e : node.colorcan) {
            colorcan[i++] = e;
        }
        for (Edge2 e : node.adjacencies) {
            adjacencies[i++] = e;
        }
        parent = node.parent;
    }

    public String toString() {
        return value + pathCost + "   ";
    }
}
