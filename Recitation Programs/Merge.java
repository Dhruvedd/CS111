public class Merge{



    public static int[][] Split(int[] first) // takes an array, splits it and outputs 2 arrays in the form of rows of a 2D array
    {
        
        
        int[][] output = new int[2][first.length/2];
        
        for(int i = 0; i < first.length/2;i++)//populates the first row with the first half of the input array
        {
            output[0][i] = first[i];
        }

        for(int i = first.length/2; i < first.length;i++)//populates the second row with the first half of the input array
        {
            output[1][i] = first[i];
        }
        
        
        
        return output;//replace this line with a 2 rowed 2D integer Array
    }



    public static void main(String[] args)
    {


















    }
}