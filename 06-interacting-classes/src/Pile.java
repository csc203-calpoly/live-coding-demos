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

  /*?
   * Type:Block
   * Range:11
   * Title:removeSticks
   * ---
   * The `Pile`'s main job is to manage the sticks in the pile.
   * When it has been asked to remove a given number of sticks,
   * it does so, after checking that the request is valid.
   * 
   * **Should the Pile be responsible for this check? Or should the Player just
   * not make invalid requests?**
   */
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
