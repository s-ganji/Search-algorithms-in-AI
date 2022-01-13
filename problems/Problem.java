import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Problem {
    ArrayList<String> parentStates;

    public Node n1;
    public Node n2;
    public Node n3;
    public Node n4;
    public Node n5;
    public Node n6;
    public Node n7;
    public Node n8;
    public Node n9;
    public Node n10;
    public Node n11;
    public Node n12;
    public Node n13;
    public Node n14;

    static Scanner in=new Scanner(System.in);
    private String initialNodeName;
    public void initialState()
    {

         n1 = new Node("Arad");
         n2 = new Node("Zerind");
        n3 = new Node("Oradea");
        n4 = new Node("Sibiu");
        n5 = new Node("Fagaras");
        n6 = new Node("Rimnicu Vilcea");
        n7 = new Node("Pitesti");
        n8 = new Node("Timisoara");
        n9 = new Node("Lugoj");
        n10 = new Node("Mehadia");
        n11 = new Node("Drobeta");
        n12 = new Node("Craiova");
        n13 = new Node("Bucharest");
        n14 = new Node("Giurgiu");


    }

    public void actions()
    {
        ArrayList<String> actions = new ArrayList<String>();
        initialState();

        n1.adjacencies = new Edge[]{new Edge(n2, pathCost(n1.value,n2.value)), new Edge(n4, pathCost(n1.value,n4.value)),
                new Edge(n8,pathCost(n1.value,n8.value))};

        n2.adjacencies = new Edge[]{new Edge(n1,pathCost(n2.value,n1.value)), new Edge(n3,pathCost(n2.value,n3.value))};

        n3.adjacencies = new Edge[]{new Edge(n2,pathCost(n3.value,n2.value)), new Edge(n4, pathCost(n3.value,n4.value))};

        n4.adjacencies = new Edge[]{new Edge(n1, pathCost(n4.value,n1.value)), new Edge(n5, pathCost(n4.value,n5.value)),
                new Edge(n3, pathCost(n4.value,n3.value)), new Edge(n6, pathCost(n4.value,n6.value)),};

        n5.adjacencies = new Edge[]{new Edge(n4,pathCost(n5.value,n4.value)), new Edge(n13,pathCost(n5.value,n13.value))};

        n6.adjacencies = new Edge[]{new Edge(n4, pathCost(n6.value,n4.value)), new Edge(n7,pathCost(n6.value,n7.value)),
                new Edge(n12, pathCost(n6.value,n12.value))};

        n7.adjacencies = new Edge[]{new Edge(n6,pathCost(n7.value,n6.value)), new Edge(n13,pathCost(n7.value,n13.value)),
                new Edge(n12,pathCost(n7.value,n12.value))};

        n8.adjacencies = new Edge[]{new Edge(n1,pathCost(n8.value,n1.value)), new Edge(n9,pathCost(n8.value,n9.value))};

        n9.adjacencies = new Edge[]{new Edge(n8,pathCost(n9.value,n8.value)), new Edge(n10,pathCost(n9.value,n10.value))};

        n10.adjacencies = new Edge[]{new Edge(n9,pathCost(n10.value,n9.value)), new Edge(n11,pathCost(n10.value,n11.value))};

        n11.adjacencies = new Edge[]{new Edge(n10,pathCost(n11.value,n10.value)), new Edge(n12,pathCost(n11.value,n12.value))};

        n12.adjacencies = new Edge[]{new Edge(n11, pathCost(n12.value,n11.value)), new Edge(n6,pathCost(n12.value,n6.value)),
                new Edge(n7,pathCost(n12.value,n7.value))};

        n13.adjacencies = new Edge[]{new Edge(n7,pathCost(n13.value,n7.value)), new Edge(n14,pathCost(n13.value,n14.value)),
                new Edge(n5,pathCost(n13.value,n5.value))};

        n14.adjacencies = new Edge[]{new Edge(n13, pathCost(n14.value,n13.value))};

//        if(s.equals("Oradea"))
//        {
//            actions.add("go to Zerind");
//            actions.add("go to Sibiu");
//
//        }
//        else if(s.equals("Zerind"))
//        {
//            actions.add("go to Oradea");
//            actions.add("go to Arad");
//
//        }
//        else if(s.equals("Sibiu"))
//        {
//            actions.add("go to Oradea");
//            actions.add("go to Rimnicu Vilcea");
//            actions.add("go to Arad");
//            actions.add("go to Faragas");
//        }
//        else if(s.equals("Arad"))
//        {
//            actions.add("go to Timisoara");
//            actions.add("go to Sibiu");
//            actions.add("go to Zerind");
//        }
//       else if(s.equals("Timisoara"))
//        {
//            actions.add("go to Lugoj");
//            actions.add("go to Arad");
//
//        }
//        else if(s.equals("Lugoj"))
//        {
//            actions.add("go to Timisoara");
//            actions.add("go to Mehadia");
//
//        }
//        else if(s.equals("Mehadia"))
//        {
//            actions.add("go to Lugoj");
//            actions.add("go to Dobreta");
//
//        }
//       else if(s.equals("Dobreta"))
//        {
//            actions.add("go to Mehadia");
//            actions.add("go to Craiova");
//
//        }
//        else if(s.equals("Craiova"))
//        {
//            actions.add("go to Dobreta");
//            actions.add("go to Rimnicu Vilcea");
//            actions.add("go to Pitesti");
//
//        }
//        else if(s.equals("Rimnicu Vilcea"))
//        {
//            actions.add("go to Sibiu");
//            actions.add("go to Craiova");
//            actions.add("go to Pitesti");
//
//        }
//        else if(s.equals("Pitesti"))
//        {
//            actions.add("go to Rimnicu Vilcea");
//            actions.add("go to Craiova");
//            actions.add("go to Bucharest");
//
//        }
//        else if(s.equals("Faragas"))
//        {
//            actions.add("go to Sibiu");
//            actions.add("go to Bucharest");
//
//        }
//        else if(s.equals("Bucharest"))
//        {
//            actions.add("go to Fagaras");
//            actions.add("go to Pitesti");
//            actions.add("go to Giurgiu");
//            actions.add("go to Urziceni");
//
//
//        }
//        else if(s.equals("Giurgiu"))
//        {
//            actions.add("go to Bucharest");
//
//        }
//        else if(s.equals("Urziceni"))
//        {
//            actions.add("go to Bucharest");
//            actions.add("go to Vaslui");
//            actions.add("go to Hirsova");
//        }
//        else if(s.equals("Hirsova"))
//        {
//            actions.add("go to Urziceni");
//            actions.add("go to Eforie");
//        }
//        else if(s.equals("Eforie"))
//        {
//            actions.add("go to Hirsova");
//        }
//        else if(s.equals("Vaslui"))
//        {
//            actions.add("go to Urziceni");
//            actions.add("go to Iasi");
//        }
//        else if(s.equals("Iasi"))
//        {
//            actions.add("go to Vaslui");
//            actions.add("go to Neamt");
//        }
//        else if(s.equals("Neamt"))
//        {
//            actions.add("go to Iasi");
//        }
//
//
//        return actions;

        }



        public String result(String state,String action)
        {
            if(action.equals("go to Oradea")) return "Oradea";
            if(action.equals("go to Zerind")) return "Zerind";
            if(action.equals("go to Arad")) return "Arad";
            if(action.equals("go to Sibiu")) return "Sibiu";
            if(action.equals("go to Timisoara")) return "Timisoara";
            if(action.equals("go to Lugoj")) return "Lugoj";
            if(action.equals("go to Mehadia")) return "Mehadia";
            if(action.equals("go to Dobreta")) return "Dobreta";
            if(action.equals("go to Craiova")) return "Craiova";
            if(action.equals("go to Faragas")) return "Faragas";
            if(action.equals("go to Rimnicu Vilcea")) return "Rimnicu Vilcea";
            if(action.equals("go to Pitesti")) return "Pitesti";
            if(action.equals("go to Bucharest")) return "Bucharest";
            if(action.equals("go to Giurgiu")) return "Giurgiu";
            if(action.equals("go to Urziceni")) return "Urziceni";
            if(action.equals("go to Vaslui")) return "Vaslui";
            if(action.equals("go to Hirsova")) return "Hirsova";
            if(action.equals("go to Eforie")) return "Eforie";
            if(action.equals("go to Iasi")) return "Iasi";
            if(action.equals("go to Neamt")) return "Neamt";
            return null;

        }
        public boolean goalTest(String state)
        {
            if(state.equals("Bucharest"))
            {
                return true;
            }
            else return false;
        }

        public int pathCost(String startState,String endState)
        {
            if(startState.equals("Oradea")&& endState.equals("Zerind"))
                return 71;
            else if(startState.equals("Oradea")&& endState.equals("Sibiu"))
                return 151;
            else if(startState.equals("Zerind")&& endState.equals("Oradea"))
                return 71;
            else if(startState.equals("Zerind")&& endState.equals("Arad"))
                return 75;
            else if(startState.equals("Sibiu")&& endState.equals("Oradea"))
                return 151;
            else if(startState.equals("Sibiu")&& endState.equals("Rimnicu Vilcea"))
                return 80;
            else if(startState.equals("Sibiu")&& endState.equals("Arad"))
                return 140;
            else if(startState.equals("Sibiu")&& endState.equals("Faragas"))
                return 99;
            else if(startState.equals("Arad")&& endState.equals("Zerind"))
                return 75;
            else if(startState.equals("Arad")&& endState.equals("Timisoara"))
                return 118;
            else if(startState.equals("Arad")&& endState.equals("Sibiu"))
                return 140;
            else if(startState.equals("Timisoara")&& endState.equals("Lugoj"))
                return 111;
            else if(startState.equals("Timisoara")&& endState.equals("Arad"))
                return 118;
            else if(startState.equals("Lugoj")&& endState.equals("Timisoara"))
                return 111;
            else if(startState.equals("Lugoj")&& endState.equals("Mehadia"))
                return 70;
            else if(startState.equals("Mehadia")&& endState.equals("Lugoj"))
                return 70;
            else if(startState.equals("Mehadia")&& endState.equals("Dobreta"))
                return 75;
            else if(startState.equals("Dobreta")&& endState.equals("Mehadia"))
                return 75;
            else if(startState.equals("Dobreta")&& endState.equals("Craiova"))
                return 120;
            else if(startState.equals("Craiova")&& endState.equals("Dobreta"))
                return 120;
            else if(startState.equals("Craiova")&& endState.equals("Rimnicu Vilcea"))
                return 146;
            else if(startState.equals("Craiova")&& endState.equals("Pitesti"))
                return 138;
            else if(startState.equals("Rimnicu Vilcea")&& endState.equals("Sibiu"))
                return 80;
            else if(startState.equals("Rimnicu Vilcea")&& endState.equals("Craiova"))
                return 146;
            else if(startState.equals("Rimnicu Vilcea")&& endState.equals("Pitesti"))
                return 97;
            else if(startState.equals("Pitesti")&& endState.equals("Rimnicu Vilcea"))
                return 97;
            else if(startState.equals("Pitesti")&& endState.equals("Craiova"))
                return 138;
            else if(startState.equals("Pitesti")&& endState.equals("Bucharest"))
                return 101;
            else if(startState.equals("Fagaras")&& endState.equals("Sibiu"))
                return 99;
            else if(startState.equals("Fagaras")&& endState.equals("Bucharest"))
                return 211;
            else if(startState.equals("Bucharest")&& endState.equals("Fagaras"))
                return 211;
            else if(startState.equals("Bucharest")&& endState.equals("Pitesti"))
                return 101;
            else if(startState.equals("Bucharest")&& endState.equals("Giurgiu"))
                return 90;
            else if(startState.equals("Bucharest")&& endState.equals("Urziceni"))
                return 85;
           else if(startState.equals("Giurgiu")&& endState.equals("Bucharest"))
                return 90;
            else if(startState.equals("Urziceni")&& endState.equals("Bucharest"))
                return 85;
            else if(startState.equals("Urziceni")&& endState.equals("Vaslui"))
                return 142;
            else if(startState.equals("Urziceni")&& endState.equals("Hirsova"))
                return 98;
            else if(startState.equals("Hirsova")&& endState.equals("Urziceni"))
                return 98;
            else if(startState.equals("Hirsova")&& endState.equals("Eforie"))
                return 86;
            else if(startState.equals("Eforie")&& endState.equals("Hirsova"))
                return 96;
            else if(startState.equals("Vaslui")&& endState.equals("Urziceni"))
                return 142;
            else if(startState.equals("Vaslui")&& endState.equals("Iasi"))
                return 92;
            else if(startState.equals("Iasi")&& endState.equals("Vaslui"))
                return 92;
            else if(startState.equals("Iasi")&& endState.equals("Neamt"))
                return 87;
            else if(startState.equals("Neamt")&& endState.equals("Iasi"))
                return 87;

            return 0;
        }

        public int heuristic(String state)
        {
            if(state.equals("Oradea")) return 380;
            else if(state.equals("Zerind")) return 374;
            else if(state.equals("Arad")) return 366;
            else if(state.equals("Sibiu")) return 253;
            else if(state.equals("Timisoara")) return 329;
            else if(state.equals("Lugoj")) return 244;
            else if(state.equals("Mehadia")) return 241;
            else if(state.equals("Dobreta")) return 242;
            else if(state.equals("Craiova")) return 160;
            else if(state.equals("Faragas")) return 178;
            else if(state.equals("Rimnicu Vilcea")) return 193;
            else if(state.equals("Pitesti")) return 98;
            else if(state.equals("Bucharest")) return 0;
            else if(state.equals("Giurgiu")) return 77;
            else if(state.equals("Urziceni")) return 80;
            else if(state.equals("Vaslui")) return 199;
            else if(state.equals("Hirsova")) return 151;
            else if(state.equals("Eforie")) return 161;
            else if(state.equals("Iasi")) return 226;
            else if(state.equals("Neamt")) return 234;
            return 0;
        }
        public ArrayList<String> parent(String state,ArrayList<String> strings)
        {
            parentStates=new ArrayList<String>();
            for (int i = 0; i <strings.size() ; i++) {
                parentStates.add(strings.get(i));
            }
            parentStates.add(state);
            return parentStates;
        }
}
