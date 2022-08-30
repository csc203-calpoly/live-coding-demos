package Example4;

public class FileFormatException extends Exception
{
   private int position;
   private String data;

   public FileFormatException(String data, int position)
   {
      super("Incorrect format: " + data + " (at input position " + position + ")");
      this.data = data;
      this.position = position;
   }
   
   public int position() { return position; }
   public String data() { return data; }
}
