/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class StaircaseBuilder {
    
    public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int c = Integer.parseInt(args[1]);
    
    String[][] arr = new String[n][n];

   
    for(int i = 0; i < arr.length;i++)

        {
            for(int j = 0; j < arr.length;j++)
            {
                arr[i][j] = " ";
            }
            

        }


    for(int j = 1; j <= arr.length;j++){

      for(int i = 0; i < j;i++){

        if(c != 0){arr[n-i-1][j-1] = "X"; c--;}
    
    }

    }

    for(int i = 0; i < arr.length;i++)

    {
        for(int j = 0; j < arr.length;j++)
        {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }

    System.out.println("Bricks remaining: "+c);


    }
}
