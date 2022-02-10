package Class;

import java.util.ArrayList;
import java.util.Date;

public interface Filter {
    ArrayList<Song> filterByGenre(String genre);
    ArrayList<Song> filterByYear( Date year);
    ArrayList<Song> orderByDuration( Boolean longToShort);
    ArrayList<Song> orderByDate(Boolean oldToNew);

}
