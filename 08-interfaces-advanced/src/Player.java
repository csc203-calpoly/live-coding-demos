public interface Player
{
   String name();
   int sticksTaken();
   default void takeTurn(Pile pile) {
      pile.remove(1);
   }
}
