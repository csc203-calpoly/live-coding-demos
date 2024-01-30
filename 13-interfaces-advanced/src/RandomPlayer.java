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
    int toRemove = Integer.MAX_VALUE;

    do {
      toRemove = this.random.nextInt(1, pile.getSticks() + 1);
    } while(toRemove > pile.getSticks());

    pile.removeSticks(toRemove);
    return toRemove;
  }
}
