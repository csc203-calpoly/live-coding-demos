/**
 * A player in the game Simple Nim.
 */
public class Player {
  /*?
   * Type:Keyword
   * Anchor:final
   * ---
   * We don't intend to change the Player's name after it's been set.
   */
  private final String name;

  public Player(String name) {
    if (name == null) {
      /*?
       * Type:Block
       * Range:1
       * Title: Exceptions
       * ---
       * This will crash the program if the name is null. We will learn more about
       * exceptions later this quarter.
       */
      throw new IllegalArgumentException("Name cannot be null");
    }

    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  /*?
   * Type:Block
   * Range:3
   * Title: Taking a turn
   * ---
   * This is the `Player`'s primary behaviour in this game.
   * The `Player` should be able to _take a turn_, i.e., to pick up some number of sticks from the specified `Pile` object.
   */
  public void takeTurn(Pile pile, int sticks) {
    pile.removeSticks(sticks);
  }

  public String toString() {
    return this.name;
  }
}
