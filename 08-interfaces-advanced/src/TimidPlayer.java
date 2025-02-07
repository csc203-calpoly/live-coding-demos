public class TimidPlayer implements Player
{
    private String name;
    private int sticksTaken;
    
    /**
     * Constructor for objects of class TimidPlayer
     */
    public TimidPlayer(String name)
    {
          this.name = name;
          this.sticksTaken = 0;
    }

    public String name() {return this.name;}
    public int sticksTaken() {return this.sticksTaken;}
    
    public void takeTurn(Pile pile) 
    {
        pile.remove(1);
        this.sticksTaken = 1;
    }
}