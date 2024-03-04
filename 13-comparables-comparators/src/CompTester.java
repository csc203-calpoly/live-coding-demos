import java.util.*;

public class CompTester
{
    public static void main(String[] args)
    {
        ArrayList<Album> albums = new ArrayList<>();
        Album[] albumArray = new Album[4];
        
        albums.add(new Album("Rubber Soul", "The Beatles", 1965, 19.99));
        albums.add(new Album("1989", "Taylor Swift", 2015, 19.99));
        albums.add(new Album("1989 (Taylor's Version)", "Taylor Swift", 2023, 19.99));
        albums.add(new Album("Leaving Eden", "The Carolina Chocolate Drops", 2012, 19.99));

        albumArray[0] = new Album("Rubber Soul", "The Beatles", 1965, 19.99);
        albumArray[1] = new Album("1989", "Taylor Swift", 2015, 19.99);
        albumArray[2] = new Album("1989 (Taylor's Version)", "Taylor Swift", 2023, 19.99);
        albumArray[3] = new Album("Leaving Eden", "The Carolina Chocolate Drops", 2012, 19.99);

        System.out.println("Album List:");
        for (Album s : albums)
                    System.out.println("   " + s);

        System.out.println("Album Array:");
        for (Album s : albumArray)
                    System.out.println("   " + s);

        System.out.println("\n---- Sorting by Title -----\n");
        // Sort in place -- Don't return a sorted list
        Collections.sort(albums);
        Arrays.sort(albumArray); // Doesn't check if the list contains Comparable items

        System.out.println("Album List:");
        for (Album s : albums)
                    System.out.println("   " + s);

        System.out.println("Student Array:");
        for (Album s : albumArray)
                    System.out.println("   " + s);
    }
}
