public class SmartPlayer implements Player, Socializer
{
   private String name;
   private int sticksTaken;

   /**
   * Constructor for objects of class SmartPlayer
   */
   public SmartPlayer(String name)
   {
      this.name = name;
      this.sticksTaken = 0;
   }

   public String name() {return this.name;}
   public int sticksTaken() {return this.sticksTaken;}

   public void takeTurn(Pile pile) 
   {
      this.sticksTaken = (pile.sticks()-1)%4;
      
      if (this.sticksTaken == 0)
         this.sticksTaken = 1;

      pile.remove(this.sticksTaken);
   }
   
   public void makeComment()
   {
      System.out.println("Yeah, Ima gonna win.");
   }
    
   public void chitChat(String talkingTo)
   {
      System.out.println("Hey, " + talkingTo + ", not a good move");
   }

}