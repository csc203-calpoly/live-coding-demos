public class TimidPlayer implements Player {
   private String name;
   
   public TimidPlayer(String name) {
     this.name = name;
   }
 
   @Override
   public String getName() {
     return name;
   }
 
   @Override 
   public int takeTurn(Pile pile) {
     pile.remove(1);
     return 1;
   }
 }
 