/**
 * A pile of sticks for playing Simple Nim.
 */
public class Pile {
   private int sticks;
 
   public Pile(int sticks) {
     this.sticks = sticks;
   }
 
   public int getSticks() {
     return sticks;
   }
 
   public void removeSticks(int toRemove) {
     if (toRemove < 1 || toRemove > 3) {
       // We will learn more about exceptions later this quarter.
       // This basically tells the program to crash.
       throw new IllegalArgumentException("Must remove 1-3 sticks");
     } else if (toRemove > sticks) {
       throw new IllegalArgumentException("Not enough sticks to remove");
     } else {
       this.sticks = this.sticks - toRemove;
     }
   }
 
 }
