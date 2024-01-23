import java.util.Random;

public class RandomPlayer implements Player {
   private String name;
   private Random random;
    
   public RandomPlayer(String name)
   {
      this.name = name;
      this.random = new Random();
   }

   public String getName() {
      return this.name;
   }
    
   public void takeTurn(Pile pile) {
      this.random.nextInt(1, pile.sticks() + 1);
   }
}
