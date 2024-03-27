public class Recursion1 {


    public static int fib(int num)
    {
        if(num == 0){return 1;}

        else if(num == 1){return 1;}

        else
        {

            return fib(num-1) + fib(num-2);

        }
        
        
    
    }



    public static void main(String args[])
    {
        
        StdOut.println("Which term of the fibonacci series do you want?");
        int n = StdIn.readInt();
        System.out.println(fib(n));
    }
}
