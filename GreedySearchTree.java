import java.util.*;
public class GreedySearchTree {

    public void greedysearch(Node source,Node goal) {
        int expandNodes = 0;
        int seenNodes = 0;
        Problem problem = new Problem();

        List<Node> list = new ArrayList<Node>();

        source.pathCost = 0;

        Queue<Node> queue = new LinkedList<>();

        queue.add(source);

        Set<Node> explored = new HashSet<Node>();

        List<Node> path = new ArrayList<Node>();
        Node max = source;

        do {
            path.clear();
            Node current = queue.poll();
            explored.add(current);

            for (Node node = current; node != null; node = node.parent) {
                path.add(node);
            }

            if (problem.goalTest(current.value)) {

                goal.parent = current.parent;
                goal.pathCost = current.pathCost;
                seenNodes++;
                break;

            }


            expandNodes++;

            int m = 10000;
            Node child=null;
            double cost=0;
            for (Edge e : current.adjacencies) {
                seenNodes++;
                if(problem.heuristic(e.target.value)<m) {
                    child = e.target;
                    cost=e.cost;
                    m = problem.heuristic(e.target.value);
                }
            }
            if ((queue.contains(child) || explored.contains(child))
                    && !path.contains(child)){
                queue.add(child);
                seenNodes++;
            }
            else if (!path.contains(child)){
                child.pathCost = current.pathCost + cost;
                child.parent = current;
                queue.add(child);
                seenNodes++;
            }



        }
        while (!queue.isEmpty());


        System.out.printf("number of seen nodes:");
        System.out.println(seenNodes+1);
        System.out.printf("number of expand nodes:");
        System.out.println(expandNodes);



    }

    public static List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();
        for (Node node = target; node != null; node = node.parent) {
            path.add(node);
        }
        Collections.reverse(path);

        System.out.printf("path cost:"+target.pathCost);
        System.out.println();
        return path;

    }

    public static void main(String[] args) {
        Problem p=new Problem();
        p.actions();
        System.out.println("greedy best-first search(tree search):");
        GreedySearchTree greedySearchTree=new GreedySearchTree();
        greedySearchTree.greedysearch(p.n1, p.n13);
        List<Node> path9 = greedySearchTree.printPath(p.n13);
        System.out.println("Path: " + path9);
    }


}




