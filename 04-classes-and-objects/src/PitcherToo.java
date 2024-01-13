/*?
 * Type: Keyword
 * Anchor: public class Pitcher
 * ---
 * This class is designed purely for the purpose of storing data. Very much
 * like a "struct" in C, or a "dict" in Python.
 * 
 * It represents a baseball Pitcher.
 */
public class PitcherToo {
    /*?
     * Type: Block
     * Range:4
     * Title:Instance variables
     * ---
     * As we've seen before, these are the instance variables.
     * Each Pitcher object will have its own values for these variables.
     * 
     * We're marking these as `public` in this procedural example, only to 
     * illustrate that there really is nothing else happening here except
     * packaging of these fields into a compound structure.
     */
    public double inningsPitched;
    public int runsScored;
    public int wins;
    public int losses;

    public PitcherToo(double inningsPitched, int runsScored, int wins,
                   int losses)
    {
        this.inningsPitched = inningsPitched;
        this.runsScored = runsScored; 
        this.wins = wins; 
        this.losses = losses;
    }
}
