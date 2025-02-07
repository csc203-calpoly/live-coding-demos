import java.util.Scanner;

public class HumanPlayer implements Player
{
   private String name;
   private int sticksTaken;
    
   public HumanPlayer(String name)
   {
      this.name = name;
   }

   public String name() {return this.name;}
   public int sticksTaken() {return this.sticksTaken;}
    
   public void takeTurn(Pile pile) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print(this.name + ", number of sticks to take: ");
      String numSticks = in.next();
      this.sticksTaken = Math.min(Integer.parseInt(numSticks), pile.sticks());
      pile.remove(this.sticksTaken);
   }
}