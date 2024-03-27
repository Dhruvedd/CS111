
public class Speeding
{public static void main(String[] args)
{



    int speed = Integer.parseInt(args[0]);


    if(speed <= 60){System.out.println("$"+0);}

    else if(speed <= 75){System.out.println("$"+100);}

    else if(speed <= 90){System.out.println("$"+200);}

    else{System.out.println("$"+500);}







}
}