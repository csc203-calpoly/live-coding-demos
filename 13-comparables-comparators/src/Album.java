/*?
 * Type:Block
 * Range:1
 * Title: The `Album` class
 * ---
 * Here we declare the `Album` as being `Comparable` to other `Album` objects.
 * The `Comparable` interface is used when we want to define a "natural" ordering
 * for a class.
 * 
 * Implementing this interface forces us to implement the `compareTo` method.
 * 
 * +++
 * 
 * Type:Keyword
 * Anchor:Comparable<Album>
 * ---
 * This part ensures that our `compareTo` method takes in an `Album` object as a parameter, and not any other type.
 */
public class Album implements Comparable<Album> {
  private final String title;
  private final String artist;
  private final int year;
  private double price;
  private int unitsSold;

  /**
   * Construct a Album object with the given title, artist, year, price, and unitsSold.
   * @param title
   * @param artist
   * @param year
   * @param price
   * @param unitsSold
   * 
   * @throws IllegalArgumentException if title or artist is null, year, price, or unitsSold is negative.
   */
  public Album(String title, String artist, int year, double price, int unitsSold) {
    if (title == null || artist == null || year < 0 || price < 0 || unitsSold < 0) {
      throw new IllegalArgumentException("Invalid input");
    }

    this.title = title;
    this.artist = artist;
    this.year = year;
    this.price = price;
    this.unitsSold = unitsSold;
  }

  /*?
   * Type:Block
   * Range:8
   * Title: A `compareTo` method
   * ---
   * This `compareTo` method compares **`this`** Album object with the specified Album object, to determine the order of the two objects. In this case, the order is determined by the titles of the albums in ascending order.
   * 
   * We return a negative number if **`this`** Album object should come "before" the specified Album object, a positive number if **`this`** Album object should come "after" the specified Album object, and 0 if **`this`** Album object is "equal to" the specified Album object.
   */
  /**
   * Compares two Album objects based on their titles in ascending order.
   */
  @Override
  public int compareTo(Album o) {
    int titleComp = this.title.compareTo(o.title);
    return titleComp;
  }

  public String getTitle() {
    return this.title;
  }

  public String getArtist() {
    return this.artist;
  }

  public int getYear() {
    return this.year;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Invalid input");
    }

    this.price = price;
  }

  public int getUnitsSold() {
    return this.unitsSold;
  }

  public void increaseUnitsSold(int unitsSold) {
    if (unitsSold < 0) {
      throw new IllegalArgumentException("Invalid input");
    }

    this.unitsSold += unitsSold;
  }
}
