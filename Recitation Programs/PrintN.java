public class PrintN {

    public static void main(String[] args)
    {

        int n = Integer.parseInt(args[0]);

        for(int i = 1; i <= n; i++)
        {

            if(i != n){System.out.print((i)+",");}

            else{System.out.print(i);}

        }



    }
    
}
