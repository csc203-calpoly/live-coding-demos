/**
 * Code annotated using <a href="https://www.cs.mcgill.ca/~martin/casdoc/index.html">Casdoc</a>.
 */
/*?
 * Keyword:Pitcher
 * This class represents a baseball pitcher. The pitcher
 * has a number of innings pitched, a number of runs scored,
 * a number of wins, and a number of losses. The pitcher is also
 * able to compute its own "earned run average" (ERA).
 */
public class Pitcher
{
    /*?
     * Keyword:static
     * This variable is declared to be <code>static</code>, which means that it does
     * not belong to any one instance of the class. It belongs to the <i>class itself</i>.
     * 
     * Here, we do that because all Pitchers have the same number of innings per game — that
     * value is shared by all Pitchers.
     */
    public static final int INNINGS_PER_GAME = 9;
   
    /*?
     * Block:4
     * Instance variables
     * Notice that we have made these instance variables <code>private</code>. See
     * the previous lesson's notes about <i>encapsulation</i> for a reminder of why
     * we do this.
     */
    private double inningsPitched;
    private int runsScored;
    private int wins;
    private int losses;

    /*?
     * Keyword:public Pitcher()
     * This is commonly referred to as the "default constructor". It does not take any parameters.
     * What do you suppose are the values of this Pitcher's instance variables, if it is created
     * using this constructor?
     */
    public Pitcher() {
        // Empty constructor, doesn't do anything.
    }

    /*?
     * Keyword:public Pitcher(double inningsPitched, int runsScored, int wins, int losses)
     * This is an alternative constructor. It takes inputs for all of the instance variables.
     */
    public Pitcher(double inningsPitched, int runsScored, int wins, int losses) {
        this.inningsPitched = inningsPitched;
        this.runsScored = runsScored; 
        this.wins = wins; 
        this.losses = losses;
    }

    /*?
     * Keyword:public Pitcher(double inningsPitched, int runsScored)
     * This is yet another constructor, which only takes inputs for the
     * <code>inningsPitched</code> and <code>runsScored</code> instance variables.
     * 
     * We do this when we are okay with the default values of the other instance variables.
     * In this case, we are okay with the <code>wins</code> and <code>losses</code> defaulting
     * to 0 to begin with.
     */
    public Pitcher(double inningsPitched, int runsScored) {
       this.inningsPitched = inningsPitched;
       this.runsScored = runsScored;
    }
    

    /*?
    * Keyword:public double ERA()
    * This is an <i>instance method</i>. Where previously the <code>ERA</code> function was
    * written in a separate <code>PitcherUtil</code> class, and took a Pitcher as a parameter,
    * we now write the <code>ERA</code> function right here in the <code>Pitcher</code> class
    * itself.
    * 
    * Notice that the function (method) does not take a <code>Pitcher</code> as a parameter.
    * As an instance member of the <code>Pitcher</code> class, it already has access to
    * the <code>Pitcher</code> object to which it belongs. It can access the object using
    * the <code>this</code> keyword.
    */
    public double ERA() {
        /*?
         * Keyword:this.inningsPitched
         * Recall from the previous lesson that the <code>this</code> keyword is a reference
         * to the object that is calling this instance method.
         * 
         * In this case, we could omit the <code>this</code> keyword, and just write 
         * <code>inningsPitched</code>, since there
         * is no other <code>inningsPitched</code> variable in scope. But it is always more
         * clear to use the <code>this</code> keyword.
         */
        if (this.inningsPitched > 0) {
            return this.runsScored/this.inningsPitched*INNINGS_PER_GAME;
        }

        return 0.0;
    }

    // Accessor methods
    public double inningsPitched() {
        return this.inningsPitched;
    }

    public int runsScored() {
        return this.runsScored;
    }

    public int wins() {
        return this.wins;
    }

    public int losses() {
        return this.losses;
    }
    
    // Mutator method
    public void incrementWins() {
        this.wins++;
    }
}

















