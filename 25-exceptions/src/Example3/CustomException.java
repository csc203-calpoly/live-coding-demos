package Example3;

public class CustomException extends RuntimeException
{
   private final int lineNum;
    
   public CustomException(int lineNum, String message)
   {
      super(message);
      this.lineNum = lineNum;
   }
    
   public int getLineNum()
   {
      return lineNum;
   }
}
