import java.util.*;

public class IDDFS
{


    public void dfs(Node source,Node goal) {

        int expandNodes=0;
        int seenNodes=0;
        int l=0;
        int d=0;



        Problem problem=new Problem();

        List<Node> list = new ArrayList<Node>();
        Stack<Node> stack = new Stack<Node>();

        stack.push(source);

        Set<Node> explored = new HashSet<Node>();

        List<Node> path = new ArrayList<Node>();

        Node current;



        while (true) {
            int t = 0;
            do {
                path.clear();
                current = stack.pop();
                explored.add(current);

                for (Node node = current; node != null; node = node.parent) {
                    path.add(node);
                }

                if (problem.goalTest(current.value)) {

                    goal.parent = current.parent;
                    goal.pathCost = current.pathCost;
                    t++;
                    seenNodes++;
                    break;

                }


                expandNodes++;
                l++;
                for (Edge e : current.adjacencies) {
                    Node child = e.target;
                    double cost = e.cost;

                    if (!(stack.contains(child) || explored.contains(child))
                            && !path.contains(child)) {

                        child.pathCost = current.pathCost + cost;
                        child.parent = current;
                        stack.push(child);
                        seenNodes++;
                    }
                }

                System.out.printf("limit:"+l);
                System.out.println();
                List<Node> pathh = printPath(current);
                System.out.println("Path: " + pathh);
            } while (!stack.isEmpty() && l != d);
            d++;
            if (t != 0)
                break;
        }


        System.out.printf("number of seen nodes:");
        System.out.println(seenNodes+1);
        System.out.printf("number of expand nodes:");
        System.out.println(expandNodes);
        System.out.printf("depth of search:");
        System.out.println(l);


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
        System.out.println("Iterative deepening DFS(Graph search):");
        IDDFS dfsid=new IDDFS();
        dfsid.dfs(p.n1,p.n13);
        System.out.println();
    }

    }

