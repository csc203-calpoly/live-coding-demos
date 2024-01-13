/*?
 * Type:Keyword
 * Anchor:public class Pitcher
 * ---
 * This class represents a baseball pitcher. The pitcher
 * has a number of innings pitched, a number of runs scored,
 * a number of wins, and a number of losses. The pitcher is also
 * able to compute its own "earned run average" (ERA).
 */
public class Pitcher {
    /*?
     * Type:Keyword
     * Anchor:static
     * ---
     * This variable is declared to be `static`, which means that it does
     * not belong to any one instance of the class. It belongs to the _class itself_.
     * 
     * Here, we do this because all `Pitcher`s have the same number of innings per game — that
     * value is shared by all `Pitcher`s. We _could_ give each `Pitcher` an instance variable
     * whose value is always `9`, but that would be a waste to duplicate that data for every single
     * instance. Moreover, if the game of baseball changed, and we now played 10 innings, we would
     * need to change the value for a ton of `Pitcher` objects, instead of changing it once.
     * 
     * +++
     * 
     * Type:Keyword
     * Anchor:INNINGS_PER_GAME
     * ---
     * Convention in Java is to name static final variables (i.e., constants) using
     * upper-case letters and underscores.
     */
    public static final int INNINGS_PER_GAME = 9;
   
    /*?
     * Type:Block
     * Range:4
     * Title:Instance variables
     * ---
     * Notice that we have made these instance variables `private`. See
     * the previous lesson's notes about _encapsulation_ for a reminder of why
     * we do this.
     */
    private double inningsPitched;
    private int runsScored;
    private int wins;
    private int losses;

    /*?
     * Type:Block
     * Range:3
     * Title: Default constructor
     * ---
     * This is commonly referred to as the "default constructor". It does not take any parameters.
     * What do you suppose are the values of this Pitcher's instance variables, if it is created
     * using this constructor?
     */
    public Pitcher() {
        // Empty constructor, doesn't do anything.
    }

    /*?
     * Type:Block
     * Range:6
     * Title: An overloaded constructor
     * ---
     * This is an alternative ("overloaded") constructor. It takes inputs for all of the instance variables.
     */
    public Pitcher(double inningsPitched, int runsScored, int wins, int losses) {
        this.inningsPitched = inningsPitched;
        this.runsScored = runsScored; 
        this.wins = wins; 
        this.losses = losses;
    }

    /*?
     * Type:Block
     * Range:4
     * Title:Another overloaded constructor
     * ---
     * This is yet another constructor, which only takes inputs for
     * the `inningsPitched` and `runsScored` instance variables.
     * 
     * We do this when we are okay with the default values of the other instance variables.
     * In this case, we are okay with the `wins` and `losses` defaulting
     * to 0 to begin with.
     */
    public Pitcher(double inningsPitched, int runsScored) {
       this.inningsPitched = inningsPitched;
       this.runsScored = runsScored;
    }
    
    /*?
     * Type:Block
     * Range:24
     * Title: public double ERA
     * ---
     * This is an _instance method_. Where previously the `ERA` function was
     * written in a separate `PitcherUtil` class, and took a `Pitcher` as a parameter,
     * we now write the `ERA` function right here in the `Pitcher` class
     * itself.
     * 
     * Notice that the method does _not_ take a `Pitcher` as a parameter.
     * As an instance member of the `Pitcher` class, it already has access to
     * the `Pitcher` object to which it belongs. It can access the object using
     * the `this` keyword.
     * 
     * If you prefer, you can think of instance methods as _implicitly_ taking the
     * calling object (the `this` object) as a parameter.
     */
    public double ERA() {
        /*?
         * Type:Keyword
         * Anchor:this.inningsPitched
         * ---
         * Recall from the previous lesson that the `this` keyword is a reference
         * to the object that is calling this instance method.
         * 
         * In this case, we could omit the `this` keyword, and just write `inningsPitched`, since there
         * is no other `inningsPitched` variable in scope. But it is always more clear to use the `this` keyword.
         */
        if (this.inningsPitched > 0) {
            /*?
             * Type: Keyword
             * Anchor: INNINGS_PER_GAME
             * ---
             * Why do you think we don't use `this` when we refer to `INNINGS_PER_GAME`?
             */
            return this.runsScored / this.inningsPitched * INNINGS_PER_GAME;
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

















