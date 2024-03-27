/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class BusStop {

    public static void main(String[] args) {

       int[] arr = new int[args.length];
       
       int n = Integer.parseInt(args[args.length - 1]);
       
       int a = 1;

       for(int i = 1; i <= args.length - 1;i++)
       {
        arr[i-1] = Integer.parseInt(args[i-1]);

        if(arr[i-1] == n){System.out.println(a);
            break;
        }
        else
         {a++;}

       }
       
       if(a >= args.length){System.out.println(1000);}


    }
}
