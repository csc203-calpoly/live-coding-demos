public class GreedyPlayer implements SocialPlayer {
    private String name;
    private String jeer; // This player talks smack
    
    public GreedyPlayer(String name, String jeer) {
      this.name = name;
      this.jeer = jeer;
    }
  
    @Override
    public String getName() {
      return this.name;
    }
  
    @Override  
    public int takeTurn(Pile pile) {
      int toRemove = 0;
      if (pile.getSticks() >= 3) {
        toRemove = 3;
      } else {
        toRemove = pile.getSticks();
      }
      return toRemove;
    }

    @Override
    public void makeComment() {
      System.out.println(this.jeer);
    }

    @Override
    public void makeComment(String message) {
      System.out.println(message);
    }
  }
  