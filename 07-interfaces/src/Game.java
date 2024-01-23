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
      /*?
       * Type:Keyword
       * Anchor: createPlayer
       * Sequence: 1
       * ---
       * The implementation of this method is further down in this file.
       * 
       * Instead of directly using a constructor, we use the `createPlayer` method to create
       * a `Player`. The method takes in the `Scanner` object a parameter, using it to ask the
       * user what kind of `Player` to create. The method then returns the created `Player`.
       * 
       * This type of method is called a "factory method".
       */
      Player p1 = createPlayer(in);
        
      System.out.println("\nCreate Player 2...");
      Player p2 = createPlayer(in);

      System.out.print("\nHow many sticks? ");
      int numSticks = in.nextInt();
      Pile pile = new Pile(numSticks);
        
      boolean done=false;
      /*?
       * Type:Block
       * Range:19
       * Title: Game play
       * Sequence: 2
       * ---
       * Like before, this loop runs the game logic. Notice that the game never knows what type
       * of `Player` it is playing with — it doesn't care, as long as the `p1` and `p2` can
       * take turns.
       */
      while(!done) {
         /*?
          * Type:Keyword
          * Anchor: play
          * Sequence: 3
          * ---
          * The `play` method runs a turn of the game. It takes in a `Player` (the current player)
          * and the `Pile` as inputs, and returns a `boolean` indicating whether the game is over.
          */
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

   /*?
    * Type: Block
    * Range:23
    * Title: createPlayer
    * Sequence: 4
    * ---
    * This method is where the "wall" between the game and `Player` is pierced. The method
    * does the work of deciding exactly _what_ kind of `Player` to create.
    * 
    * Notice that the method returns a `Player`, not a `GreedyPlayer`, `TimidPlayer`, or `RandomPlayer`.
    * The _**static type**_ of the returned object is `Player`, but the _**dynamic type**_  
    * might be `GreedyPlayer`, `TimidPlayer`, or `RandomPlayer`.
    */
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

   /*?
    * Type:Block
    * Range:17
    * Title: Take a turn 
    * Sequence: 5
    * ---
    * This game play remains the same no matter what kind of `Player` is playing.
    */
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

