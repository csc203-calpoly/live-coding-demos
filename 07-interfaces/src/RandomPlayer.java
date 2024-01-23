import java.util.Random;

public class RandomPlayer implements Player {
  private String name;
  private Random random;
   
  public RandomPlayer(String name) {
    this.name = name;
    this.random = new Random();
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override 
  public int takeTurn(Pile pile) {
    // TODO: Implement this method.
    return 0;
  }
}
