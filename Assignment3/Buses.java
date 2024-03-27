/*
 *
 * Write the Buses program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Buses.java
 * To execute:
 *        java Buses 7302
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Buses {
    public static void main(String[] args) {

        int busNum = Integer.parseInt(args[0]);
        int busSum = 0;
        
        if(busNum < 0){ System.out.println("ERROR");}
        else if(busNum > 0)
        {

            for(int i = 0;i < 4;i++)
            {

                busSum = busSum + busNum%10;
                busNum = busNum/10;

            }
            if(busSum%2 == 0){System.out.println("LX");}
            else{System.out.println("H");}
        }
    }
}
