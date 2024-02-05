import java.awt.*;

public class Tree
{
   private String type;
   private int height;
   private Color color;

   public Tree(String type, int height, Color color)
   {
      this.type = type;
      this.height = height;
      this.color = color;
   }

   public String toString()
   {
      return "Type: " + type + "\nHeight: " + height + "\nColor: " + color;
   }

   public boolean equals(Object other)
   {
      if (other == null)
         return false;

      if (getClass() != other.getClass())
         return false;

      Tree t = (Tree)other;

      return type.equals(t.type) && height == t.height &&
             color.equals(t.color);
   }  
}
