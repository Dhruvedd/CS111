public class Strings {
 
    public static void main(String args[])
    {

        String s = "nolemon, no melon";
        String a = "";
        int x = 0;
        boolean b = true;

        for(int i = 0; i < s.length();i++)
        {
            if(s.charAt(i) != ',' && s.charAt(i) != ' '){ a = a + s.charAt(i);}
        }

        for(int i = 0; i < a.length();i++)
        {
            if(a.charAt(i) != a.charAt(a.length()-i) ){ b = false;}
        }

        System.out.println(b);

    }


}
