public class Method {




    public static void rectest(int n)
    {

        if(n<=0){return;}

        rectest(n-7);
        rectest(n-3);
        System.out.print(n + " ");

    }


     public static void main(String args[])
    {


       rectest(8);



        /*
        
        String sequence = "ABCABCABCABCDGTDGTABCABCABCABCABC";
        String STR = "ABC";

        int maxRepeat = 0;
        int consecRepeat = 0;

        int n = STR.length();

        for(int i = 0; i < sequence.length(); i++)
        {


            if(sequence.startsWith(STR, i))
            {
                consecRepeat++;
            }
            else
            {
                if(consecRepeat > maxRepeat)
                {
                    maxRepeat = consecRepeat;
                }
            consecRepeat = 0;
            }
        }

        if (consecRepeat>maxRepeat){
            maxRepeat = consecRepeat;
        }
    
        System.out.println(maxRepeat);
*/
    }
}
