import java.util.*;

public class UniformCost {

    public static void UniformCostSearch(Node source,Node goal ) {
        Problem problem=new Problem();
        int expandNodes=0;
        int seenNodes=0;

        List<Node> list = new ArrayList<Node>();

        source.pathCost = 0;

        PriorityQueue<Node> queue = new PriorityQueue<Node>(20,
                new Comparator<Node>() {
                    public int compare(Node i, Node j) {
                        if ((i.pathCost > j.pathCost)) {
                            return 1;
                        }

                        else if (i.pathCost < j.pathCost) {
                            return -1;
                        }

                        else {
                            return 0;
                        }
                    }
                }

        );

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
                seenNodes++;
                if ((queue.contains(child) || explored.contains(child))
                        && !path.contains(child)) {
                    Node n = new Node(child);
                    list.add(n);
                    list.get(list.size() - 1).pathCost = current.pathCost
                            + cost;
                    list.get(list.size() - 1).parent = current;
                    queue.add(list.get(list.size() - 1));

                }
                 if (!path.contains(child)) {
                    child.pathCost = current.pathCost + cost;
                    child.parent = current;
                    queue.add(child);


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
        System.out.printf("path cost:"+target.pathCost);
        System.out.println();

        Collections.reverse(path);
        return path;

    }

    public static void main(String[] args) {
        Problem p=new Problem();
        p.actions();
        System.out.println("uniform-cost search:");
        UniformCost uniformCost=new UniformCost();
        uniformCost.UniformCostSearch(p.n1,p.n13);
        List<Node> path7 = uniformCost.printPath(p.n13);
        System.out.println("Path: " + path7);
        System.out.println();
    }


    }

