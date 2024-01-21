import java.util.*;

/**
 * This class functions as both the "entry point" for the game, as
 * well as the "controller" for the game, i.e., it manages the game logic.
 * If the game logic is sufficiently complex, or if we need to support multiple
 * distinct Game objects, it would make sense to move this code into its own
 * class.
 */
public class Game {
   public static void main(String[] args) {
      /*?
       * Type:Keyword
       * Anchor:Scanner in = new Scanner(System.in);
       * Sequence:1
       * ---
       * The `Scanner` class is used to get string input from various
       * sources.
       * In this case, we are using it to get input from the user via the keyboard.
       */
      Scanner in = new Scanner(System.in);

      /*?
       * Type:Keyword
       * Anchor:name
       * Sequence:2
       * ---
       * A local variable to temporarily hold each player's name (we will ask for them
       * one-by-one). Each name will be used to construct a new `Player`
       * object.
       */
      String name;

      /*?
       * Type:Block
       * Range:15
       * Title: Constructing the players
       * Sequence:3
       * ---
       * We will construct two `Player` objects, one for each player, using
       * the names that are provided.
       */
      System.out.print("Player 1's name? ");
      /*?
       * Type:Keyword
       * Anchor:in.next()
       * Sequence:4
       * ---
       * The Scanner's `next` instance method waits for the user to type some text
       * and then hit "Enter". It returns whatever the user typed.
       */
      name = in.next();
      Player p1 = new Player(name);

      System.out.print("Player 2's name? ");
      name = in.next();
      Player p2 = new Player(name);

      /*?
       * Type:Block
       * Range:13
       * Title: Constructing the Pile of sticks
       * Sequence:5
       * ---
       * We ask the user how many sticks they want to use in the game, and then construct a new `Pile` object with that many sticks.
       */
      System.out.print("How many sticks? ");
      /*?
       * Type:Keyword
       * Anchor:in.nextInt()
       * Sequence:6
       * ---
       * The Scanner's `nextInt` instance method waits for the user to type some text
       * and then hit "Enter". It parses the text into an integer, and returns an int.
       * 
       * **What do you think happens if the user types something that isn't an integer?**
       */
      int numSticks = in.nextInt();
      Pile pile = new Pile(numSticks);

      boolean done = false; // This is our flag to check if the game is over or not.

      /*?
       * Type:Block
       * Range:24
       * Title: Playing the game
       * Sequence:7
       * ---
       * We will play the game until the pile is empty.
       * 
       * Can you think of design or code style improvements you can make to this
       * code?
       */
      while (!done) {
         System.out.print(p1.getName() + ", how many sticks do you want to take? ");
         int sticksToRemove = in.nextInt();

         p1.takeTurn(pile, sticksToRemove);
         System.out.println(p1 + " takes " + sticksToRemove + " stick(s).\n" +
               "There are " + pile.getSticks() + " left in the pile.");

         if (pile.getSticks() <= 0) {
            done = true;
            System.out.println(p2 + " is the winner");
         } else {
            System.out.print(p2.getName() + ", how many sticks do you want to take? ");
            sticksToRemove = in.nextInt();
            p2.takeTurn(pile, sticksToRemove);
            System.out.println(p2 + " takes " + sticksToRemove + " stick(s).\n" +
                  "There are " + pile.getSticks() + " left in the pile.");

            if (pile.getSticks() <= 0) {
               done = true;
               System.out.println(p1 + " is the winner");
            }
         }
      }

      in.close();
   }
}
