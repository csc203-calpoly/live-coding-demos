public class SmartPlayer implements SocialPlayer {
   private String name;

   /**
   * Constructor for objects of class SmartPlayer
   */
   public SmartPlayer(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public int takeTurn(Pile pile) {
      int toRemove = (pile.getSticks()-1)%4;
      
      if (toRemove == 0)
         toRemove = 1;

      pile.removeSticks(toRemove);   
      return toRemove;
   }
   
   public void makeComment() {
      System.out.println("Yeah, I'm gonna win.");
   }

   @Override
   public void makeComment(String message) {
      System.out.println(message);
   }
}
