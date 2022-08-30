
/**
 * A player in the game simple Nim.
 */
public class Player 
{  
   // Instance Variables:
   private String name;
   private int sticks; // 0 // # sticks on most recent turn

  
   /**
    * Create a new Player with the specified name.
    *
    * @param name the name of the Player
    */
   public Player(String name) {
      this.name = name;
      this.sticks = 0;
   }
  
   /**
    * String representation of the Player
    *
    * @return the name of the Player
    */
   public String toString() {
      return this.name + " with " + this.sticks + " sticks.";
   }
  
   /**
    * The number of sticks this Player removed on this Player's most recent turn:
    * 1, 2, or 3. Returns 0 if this Player has not yet taken a turn.
    *
    * @return the number of sticks removed or 0
    */
   public int sticksTaken () {
      return this.sticks;
   }
  
   /**
    * Remove 1, 2, or 3 sticks from the specified Pile.
    * The Pile must not be empty.
    *
    * @param pile the pile to remove sticks from
    */
   public void takeTurn (Pile pile)
   {
      pile.remove(1);
      this.sticks = 1;
   }
}






