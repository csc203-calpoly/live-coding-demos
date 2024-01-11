/**
 * Code annotated using <a href="https://www.cs.mcgill.ca/~martin/casdoc/index.html">Casdoc</a>.
 */
/*?
 * Keyword:public class PitcherUtil
 * This is where behaviours are defined for the Pitcher class.
 */
public class PitcherTooUtil 
{

   /*?
   * Block:7
   * ERA method
   * This method's purpose is to calculate the <i>earned run average</i> for
   * a given <code>Pitcher</code>.
   */
	public static double ERA(PitcherToo p) {
      /*?
       * Keyword:p.inningsPitched 
       * Since the <code>Pitcher</code>'s instance variables are <code>public</code>,
       * we can access them directly from the <code>p</code> variable, by using the 
       * dot operator.
       */
      if (p.inningsPitched > 0) {
         return p.runsScored / p.inningsPitched * 9; // 9 innings per game
      }

      return 0.0;
   }
}
