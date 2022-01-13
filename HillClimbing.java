public class HillClimbing {
    problem2 problem=new problem2();

    public void hillClimbing() {
        int t;
        problem.initialState();

        t = function();
        do{


        }while (t!=0);

    }






    public int function()
    {
        int t=0;
           if(problem.n1.color==problem.n2.color)
                t++;
            if(problem.n1.color==problem.n3.color)
                t++;
            if(problem.n1.color==problem.n11.color)
                t++;
            if(problem.n1.color==problem.n10.color)
                t++;
            if(problem.n2.color==problem.n4.color)
                t++;
            if(problem.n2.color==problem.n5.color)
                t++;
            if(problem.n3.color==problem.n4.color)
                t++;
            if(problem.n3.color==problem.n6.color)
                t++;
            if(problem.n4.color==problem.n7.color)
                t++;
            if(problem.n4.color==problem.n8.color)
                t++;
            if(problem.n5.color==problem.n11.color)
                t++;
            if(problem.n5.color==problem.n7.color)
                t++;
        if(problem.n5.color==problem.n6.color)
            t++;
        if(problem.n6.color==problem.n8.color)
            t++;
        if(problem.n6.color==problem.n10.color)
            t++;
        if(problem.n7.color==problem.n9.color)
            t++;
        if(problem.n7.color==problem.n10.color)
            t++;
        if(problem.n8.color==problem.n9.color)
            t++;
        if(problem.n8.color==problem.n11.color)
            t++;
        if(problem.n9.color==problem.n10.color)
            t++;
        if(problem.n9.color==problem.n11.color)
            t++;
        if(problem.n10.color==problem.n2.color)
            t++;
        if(problem.n10.color==problem.n2.color)
            t++;


return t;
    }
}
