public class GreedyPlayer implements Player {
   private String name;
   private String jeer; // This player talks smack
   
   public GreedyPlayer(String name, String jeer) {
     this.name = name;
     this.jeer = jeer;
   }
 
   public String jeer() {
     return this.jeer;
   }
 
   @Override
   public String getName() {
     return this.name;
   }
 
   @Override  
   public int takeTurn(Pile pile) {
      // TODO: implement this method
      return 0;
   }
 }
