import java.util.*;

public class AlbumPriceComparator implements Comparator<Album> {
  public int compare(Album a1, Album a2) {
  	  if (a1.getPrice() > a2.getPrice()) {
  	    return -1;
		} else if (a1.getPrice() < a2.getPrice()) {
  	  	return 1;
		} else {
  	  	return 0;
		}
  }
}
