/**
 * Code annotated using <a href="https://www.cs.mcgill.ca/~martin/casdoc/index.html">Casdoc</a>.
 */
/*?
 * Keyword:public class Pitcher
 * This class is designed purely for the purpose of storing data. Very much
 * like a "struct" in C, or a "dict" in Python.
 * 
 * It represents a baseball Pitcher.
 */
public class PitcherToo
{
    /*?
     * Block:4
     * Instance variables
     * As we've seen before, these are the instance variables.
     * Each Pitcher object will have its own values for these variables.
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

/*
 * {
 *  inningsPitched: 0,
 *  runsScored: 0,
 *  wins: 0,
 *  losses: 0
 * }
 */
