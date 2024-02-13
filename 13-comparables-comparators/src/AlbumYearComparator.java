import java.util.*;

public class AlbumYearComparator implements Comparator<Album> {
   public int compare(Album a1, Album a2) {
      return a1.getYear() - a2.getYear();
   }
}
