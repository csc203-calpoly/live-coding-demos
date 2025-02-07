import java.util.Random;

public class RandomPlayer implements Player
{
    private String name;
    private int sticksTaken;
    private Random rand;
    
    public RandomPlayer(String name)
    {
          this.name = name;
          this.sticksTaken = 0;
          this.rand = new Random();
    }

    public String name() {return this.name;}
    public int sticksTaken() {return this.sticksTaken;}
    
    public void takeTurn(Pile pile) 
    {
       do
       {
          this.sticksTaken = rand.nextInt(3) + 1;
       } while (this.sticksTaken > pile.sticks());
       pile.remove(this.sticksTaken);
    }
}