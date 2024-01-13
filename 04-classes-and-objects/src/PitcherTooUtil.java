/*?
 * Type:Keyword
 * Anchor:public class PitcherUtil
 * ---
 * This is where behaviours are defined for Pitchers.
 */
public class PitcherTooUtil {
   /*?
   * Type:Block
   * Range:26
   * Title:ERA method
   * ---
   * This method's purpose is to calculate the _earned run average_ for
   * a given `Pitcher`. Since the `Pitcher` is currently only holding _data_,
   * but no _behaviours_, we implement behaviours for the `Pitcher` in separate
   * functions that must take the `Pitcher` as a parameter.
   */
	public static double ERA(PitcherToo p) {
      /*?
       * Type:Keyword
       * Anchor:p.inningsPitched 
       * ID:dot
       * ---
       * Since the `Pitcher`'s instance variables are `public`,
       * we can access them directly from the `p` variable, by using the 
       * dot operator.
       * 
       * +++
       * 
       * Type:Internal
       * Parent:dot
       * Anchor: dot operator
       * ---
       * The _dot operator_ (`.`) is used to sort of "burrow into" (or de-reference, if you want to get technical)
       * an object, and access its data or behaviour. In this case, we access various pieces of data like `inningsPitched` and `runsScored` from the `Pitcher p`.
       */
      if (p.inningsPitched > 0) {
         return p.runsScored / p.inningsPitched * 9; // 9 innings per game
      }

      return 0.0;
   }

}
