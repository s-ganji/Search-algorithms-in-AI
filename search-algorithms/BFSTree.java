import java.util.*;

public class BFSTree {

    public void bfs(Node source, Node goal) {

        int expandNodes=0;
        int seenNodes=0;

        Problem problem = new Problem();

        List<Node> list = new ArrayList<Node>();
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(source);

        Set<Node> explored = new HashSet<Node>();

        List<Node> path = new ArrayList<Node>();

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
            for (Edge e : current.adjacencies) {
                Node child = e.target;
                double cost = e.cost;

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
        } while (!queue.isEmpty());


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

        System.out.printf("path cost:");
        System.out.println(path.size()-1);
        return path;

    }

    public static void main(String[] args) {
        Problem p=new Problem();
        p.actions();
        System.out.println("Breadth first search(Tree search):");
        BFSTree bfsTree = new BFSTree();
        bfsTree.bfs(p.n1, p.n13);
        List<Node> path1 = bfsTree.printPath(p.n13);
        System.out.println("Path: " + path1);
        System.out.println();
    }


    }
