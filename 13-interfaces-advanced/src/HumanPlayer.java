import java.util.Scanner;

public class HumanPlayer implements Player
{
   private String name;
   private Scanner scanner;
    
   public HumanPlayer(String name, Scanner scanner) {
      this.name = name;
      this.scanner = scanner;
   }

   public String getName() {return name;}
    
   public int takeTurn(Pile pile) 
   {
      System.out.print(name + ", number of sticks to take: ");
      String numSticks = this.scanner.next();
      int toRemove = Math.min(Integer.parseInt(numSticks), pile.getSticks());
      pile.removeSticks(toRemove);
      return toRemove;
   }
}
