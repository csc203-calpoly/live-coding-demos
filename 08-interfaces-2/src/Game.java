import java.util.*;
/**
 * A game of Nim.
 *
 * @author Julie Workman
 * @version 2.0
 */
public class Game {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Create Player 1...");
      Player p1 = createPlayer(in);
        
      System.out.println("\nCreate Player 2...");
      Player p2 = createPlayer(in);

      System.out.print("\nHow many sticks? ");
      int numSticks = in.nextInt();
      Pile pile = new Pile(numSticks);
        
      boolean done=false;
      while(!done) {
         done = play(p1, pile);
         if (done) {
            System.out.println("\n" + p2.getName()+ " is the winner!!!");
         } else {
            done = play(p2, pile);
            if (done) {
               System.out.println("\n" + p1.getName() + " is the winner!!!");
            }
         }    
      }

   }

   /**
    * Creates a player based on user input.
    * @param in the Scanner to use for input
    * @return a GreedyPlayer, TimidPlayer, or RandomPlayer
    */
   public static Player createPlayer(Scanner in) {
      System.out.print("Player's name? ");
      String name = in.next();
      
      System.out.print("Player type (0 - Greedy, 1 - Timid, 2 - Random)? ");
      int type = in.nextInt();
      
      if (type == 0) {
         in.nextLine(); // remove \n from input stream
         System.out.print("What's your jeer? ");
         String jeer = in.nextLine();
         return new GreedyPlayer(name, jeer);
      } else if (type == 1) {
         return new TimidPlayer(name);  
      } else {
         return new RandomPlayer(name);
      }
   }


   /**
    * Plays a turn of Nim.
    * @param p the player whose turn it is
    * @param pile the pile of sticks
    * @return true if the game is over, false otherwise
    */
   public static boolean play(Player p, Pile pile) {
      int sticksTaken = p.takeTurn(pile);
      System.out.println("\n" + p.getName() + " takes " + sticksTaken + " sticks.\n" +
       "There are " + pile.getSticks() + " left in the pile.");

      if (pile.getSticks() <= 0) {
         return true;
      }

      return false;      
   }

}
