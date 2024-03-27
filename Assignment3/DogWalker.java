/*
 *  
 * Write the DogWalker program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac DogWalker.java
 * To execute:
 *        java DogWalker 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 *
 */
public class DogWalker {

    public static void main(String[] args) {

       int n = Integer.parseInt(args[0]);

       int x = 0;
       int y = 0;

       System.out.println("("+x+","+y+")");
        
       int rand = 0;

       for(int i = 0; i < n; i++)
       {
        

        rand = (int)(Math.random()*4);


        if(rand == 0){y++;}
        
        else if(rand == 1){y--;}

        else if(rand == 2){x++;}
        
        else if(rand == 3){x--;}

        System.out.println("("+x+","+y+")");

       }

       double z = (Math.pow(x,2) + Math.pow(y,2));

       System.out.println("Squared distance =" + " " + z);
			   
    }
}
