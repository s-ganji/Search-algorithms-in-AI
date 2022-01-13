import java.util.*;

public class DLS
{
   static Scanner in=new Scanner(System.in);

        public void dls(Node source,Node goal) {
            //System.out.println("enter length");
            int d=in.nextInt();
            int expandNodes=0;
            int seenNodes=0;
            int l=0;


            Problem problem=new Problem();

            List<Node> list = new ArrayList<Node>();
            Stack<Node> stack = new Stack<Node>();

            stack.push(source);

            Set<Node> explored = new HashSet<Node>();

            List<Node> path = new ArrayList<Node>();

            Node current;

            do{
                path.clear();
                current=stack.pop();
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
                l++;
                for (Edge e : current.adjacencies) {
                    Node child = e.target;
                    double cost=e.cost;

                    if (!(stack.contains(child) || explored.contains(child))
                            && !path.contains(child)) {

                        child.pathCost = current.pathCost + cost;
                        child.parent = current;
                        stack.push(child);
                        seenNodes++;
                    }
                }
            }while (!stack.isEmpty() && l!=d);


            System.out.printf("number of seen nodes:");
            System.out.println(seenNodes+1);
            System.out.printf("number of expand nodes:");
            System.out.println(expandNodes);
            System.out.printf("depth of search:");
            System.out.println(l);
            List<Node> pathh = printPath(current);
            System.out.println("Path: " + pathh);

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
        System.out.println("Depth limited search(Graph search):");
        System.out.println("enter length of search");
        DLS dls=new DLS();
        dls.dls(p.n1,p.n13);
        System.out.println();
    }

        }


