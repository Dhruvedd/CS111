public class OOP {
    
    public int num;


    public void roll()
    {
        for(int i = 0; i < num;i++)
        {
            System.out.println("Roll number " + num + " is " + ((int)Math.random()*7));
        }
    }
 public class Main { public void main(String[] args)
    {
        OOP dice = new OOP();

        dice.num = StdIn.readInt();

        roll();

    }
   }
}
