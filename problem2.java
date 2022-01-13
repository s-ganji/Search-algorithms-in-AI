import java.util.Random;

public class problem2 {
    private int node;
    Random rn=new Random();
    int[]color=new int[11];
    public Node2 n1;
    public Node2 n2;
    public Node2 n3;
    public Node2 n4;
    public Node2 n5;
    public Node2 n6;
    public Node2 n7;
    public Node2 n8;
    public Node2 n9;
    public Node2 n10;
    public Node2 n11;

    public void initialState()
    {
        n1 = new Node2(1,rn.nextInt(3));
        n2 = new Node2(2,rn.nextInt(3));
        n3 = new Node2(3,rn.nextInt(3));
        n4 = new Node2(4,rn.nextInt(3));
        n5 = new Node2(5,rn.nextInt(3));
        n6 = new Node2(6,rn.nextInt(3));
        n7 = new Node2(7,rn.nextInt(3));
        n8 = new Node2(8,rn.nextInt(3));
        n9 = new Node2(9,rn.nextInt(3));
        n10 = new Node2(10,rn.nextInt(3));
        n11 = new Node2(11,rn.nextInt(3));
    }

    public void action()
    {
        initialState();

        n1.adjacencies=new Edge2[]{new Edge2(n2),new Edge2(n3),new Edge2(n11),new Edge2(n10)};
        n2.adjacencies=new Edge2[]{new Edge2(n1),new Edge2(n4),new Edge2(n5)};
        n3.adjacencies=new Edge2[]{new Edge2(n1),new Edge2(n4),new Edge2(n6)};
        n4.adjacencies=new Edge2[]{new Edge2(n2),new Edge2(n3),new Edge2(n7),new Edge2(n8)};
        n5.adjacencies=new Edge2[]{new Edge2(n7),new Edge2(n11),new Edge2(n2),new Edge2(n6)};
        n6.adjacencies=new Edge2[]{new Edge2(n5),new Edge2(n3),new Edge2(n8),new Edge2(n10)};
        n7.adjacencies=new Edge2[]{new Edge2(n5),new Edge2(n4),new Edge2(n9),new Edge2(n10)};
        n8.adjacencies=new Edge2[]{new Edge2(n4),new Edge2(n6),new Edge2(n11),new Edge2(n9)};
        n9.adjacencies=new Edge2[]{new Edge2(n7),new Edge2(n8),new Edge2(n11),new Edge2(n10)};
        n10.adjacencies=new Edge2[]{new Edge2(n1),new Edge2(n6),new Edge2(n7),new Edge2(n9)};
        n11.adjacencies=new Edge2[]{new Edge2(n9),new Edge2(n8),new Edge2(n1),new Edge2(n5)};
        int c1=n1.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c1)
                n1.colorcan=new int[]{i};
        }
        int c2=n2.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c2)
                n2.colorcan=new int[]{i};
        }
        int c3=n3.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c3)
                n3.colorcan=new int[]{i};
        }
        int c4=n4.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c4)
                n4.colorcan=new int[]{i};
        }
        int c5=n5.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c5)
                n5.colorcan=new int[]{i};
        }
        int c6=n6.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c6)
                n6.colorcan=new int[]{i};
        }
        int c7=n7.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c7)
                n7.colorcan=new int[]{i};
        }
        int c8=n8.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c8)
                n8.colorcan=new int[]{i};
        }
        int c9=n9.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c9)
                n9.colorcan=new int[]{i};
        }
        int c10=n10.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c10)
                n10.colorcan=new int[]{i};
        }
        int c11=n11.color;
        for (int i = 1; i <=3 ; i++) {
            if(i!=c11)
                n11.colorcan=new int[]{i};
        }
        }



}
